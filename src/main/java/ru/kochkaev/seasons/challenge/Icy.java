package ru.kochkaev.seasons.challenge;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import ru.kochkaev.api.seasons.util.functional.IFuncRet;
import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.object.EventObject;
import ru.kochkaev.api.seasons.service.Task;
import ru.kochkaev.api.seasons.service.Weather;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Icy extends ChallengeObject {

    public Icy() {
        super(Collections.singletonList(Weather.getWeatherByID("FREEZING")), true);
    }

    private EventObject onBlockChange;

    @Override
    public void register() {
        onBlockChange = registerOnEventMethod("ON_BLOCK_CHANGE", this::onBlockChange);
    }

    @Override
    public int logic(ServerPlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        return 0;
    }

    @Override
    public void onChallengeStart(ServerPlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.icy.message.trigger"));
    }

    @Override
    public void onChallengeEnd(ServerPlayerEntity player) {

    }

    public void onBlockChange(List<Object> args)  {
        if (isAllowed()){
            ItemStack item = (ItemStack) args.get(1);
//        Main.getLogger().info("Block");
            if (item.getItem() == Items.WATER_BUCKET) {
                IFuncRet task = (arg) -> {
                    int count = (Integer) arg.getFirst();
                    ServerPlayerEntity player = (ServerPlayerEntity) arg.get(1);
                    BlockPos pos = (BlockPos) arg.get(2);
                    IFuncRet tsk = (IFuncRet) arg.get(3);
                    if (count == 10) {
                        if (player.getServerWorld().getBlockState(pos).getBlock() == Blocks.WATER) {
                            player.getServerWorld().setBlockState(pos, Blocks.ICE.getDefaultState());
                            sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.icy.message.get"));
                            player.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE);
                            player.getServerWorld().spawnParticles(ParticleTypes.CLOUD, pos.getX(), pos.getY(), pos.getZ(), 5, pos.getX(), pos.getY(), pos.getZ(), 0.1);
                        }
                        Task.removeTask(tsk);
                        return new ArrayList<>();
                    }
                    return Arrays.asList(count + 1, player, pos, tsk);
                };
                onBlockChange.injectToEnd((arg) -> {
                    ServerPlayerEntity player = (ServerPlayerEntity) arg.getFirst();
                    BlockHitResult hitResult = (BlockHitResult) arg.get(1);
                    BlockPos pos = hitResult.getBlockPos().offset(hitResult.getSide());
                    Task.addTask(task, Arrays.asList(0, player, pos, task));
                });
            }
            if (item.getItem() == Items.BUCKET) {
//            Main.getLogger().info("Bucket");
                IFuncRet task = (arg) -> {
//                Main.getLogger().info("Task");
                    int count = (Integer) arg.getFirst();
                    ServerPlayerEntity player = (ServerPlayerEntity) arg.get(1);
                    BlockPos pos = (BlockPos) arg.get(2);
                    IFuncRet tsk = (IFuncRet) arg.get(3);
                    if (count == 20) {
//                    Main.getLogger().info(player.getInventory().getMainHandStack().toString());
                        if (player.getInventory().getMainHandStack().getItem() == Items.WATER_BUCKET) {
                            player.getInventory().setStack(player.getInventory().selectedSlot, Items.BUCKET.getDefaultStack());
                            sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.icy.message.remove"));
                            player.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, 1, 0);
                            spawnParticles(player, ParticleTypes.CLOUD, false, 0, 5);
                        }
                        Task.removeTask(tsk);
                        return new ArrayList<>();
                    }
                    return Arrays.asList(count + 1, player, pos, tsk);
                };
                onBlockChange.injectToEnd((arg) -> {
                    ServerPlayerEntity player = (ServerPlayerEntity) arg.getFirst();
                    BlockHitResult hitResult = (BlockHitResult) arg.get(1);
                    BlockPos pos = hitResult.getBlockPos().offset(hitResult.getSide());
                    Block block = player.getServerWorld().getBlockState(pos).getBlock();
//                Main.getLogger().info(block.toString());
                    if (block == Blocks.WATER || block == Blocks.CAULDRON)
                        Task.addTask(task, Arrays.asList(0, player, pos, task));
                });
            }
        }
    }
}
