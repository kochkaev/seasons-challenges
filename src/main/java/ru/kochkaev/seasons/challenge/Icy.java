package ru.kochkaev.seasons.challenge;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import ru.kochkaev.api.seasons.util.functional.IFuncRet;
import ru.kochkaev.api.seasons.service.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.service.Task;
import ru.kochkaev.api.seasons.service.Weather;
import net.minecraft.util.TypedActionResult;

import java.util.*;

public class Icy extends ChallengeObject {

    public Icy() {
        super("Icy", Collections.singletonList(Weather.getWeatherByID("FREEZING")), true);
    }

    @Override
    public void register() {
        UseBlockCallback.EVENT.register((PlayerEntity player, World world, Hand hand, BlockHitResult hitResult) -> {
            if (isAllowedInTicker()) {
                BlockPos pos = hitResult.getBlockPos();
                BlockPos posOffset= pos.offset(hitResult.getSide());
                BlockState blockState = world.getBlockState(pos);
                BlockState blockStateOffset= world.getBlockState(posOffset);
                Item item = player.getStackInHand(hand).getItem();
                if (item == Items.WATER_BUCKET) {
                    if (blockState.getBlock() == Blocks.CAULDRON) {
                        IFuncRet task = (arg) -> {
                            int count = (Integer) arg.getFirst();
                            ServerPlayerEntity playr = (ServerPlayerEntity) arg.get(1);
                            BlockPos postn = (BlockPos) arg.get(2);
                            String key = (String) arg.get(3);
                            if (count == 10) {
                                if (playr.getServerWorld().getBlockState(postn).getBlock() == Blocks.WATER_CAULDRON) {
                                    playr.getServerWorld().setBlockState(postn, Blocks.CAULDRON.getDefaultState());
                                    sendMessage(playr, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.icy.message.get"));
                                    spawnParticles(playr, ParticleTypes.CLOUD, false, 0, 5);
                                    playr.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE);
                                }
                                Task.removeTask(key);
                                return new ArrayList<>();
                            }
                            return Arrays.asList(count + 1, playr, postn, key);
                        };
                        String key = getTaskKey((ServerPlayerEntity) player, "icingWaterInCauldron" + new Random().nextInt(1000));
                        Task.addTask(key, task, Arrays.asList(0, player, pos, key));
                    }
                    else if (blockStateOffset.getBlock() == Blocks.AIR || blockStateOffset.getBlock() == Blocks.WATER){
                        IFuncRet task = (arg) -> {
                            int count = (Integer) arg.getFirst();
                            ServerPlayerEntity playr = (ServerPlayerEntity) arg.get(1);
                            BlockPos postn = (BlockPos) arg.get(2);
                            String key = (String) arg.get(3);
                            if (count == 10) {
                                if (playr.getServerWorld().getBlockState(postn).getBlock() == Blocks.WATER) {
                                    playr.getServerWorld().setBlockState(postn, Blocks.ICE.getDefaultState());
                                    sendMessage(playr, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.icy.message.get"));
                                    spawnParticles(playr, ParticleTypes.CLOUD, false, 0, 5);
                                    playr.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE);
                                }
                                Task.removeTask(key);
                                return new ArrayList<>();
                            }
                            return Arrays.asList(count + 1, playr, postn, key);
                        };
                        String key = getTaskKey((ServerPlayerEntity) player, "icingWater" + new Random().nextInt(1000));
                        Task.addTask(key, task, Arrays.asList(0, player, posOffset, key));
                    }
                }
                if (item == Items.BUCKET) {
                    if (blockStateOffset.getBlock() == Blocks.WATER /* && !(blockState.getFluidState().get(WaterFluid.Still.LEVEL) > 0)*/) {
                        IFuncRet task = (arg) -> {
                            int count = (Integer) arg.getFirst();
                            ServerPlayerEntity playr = (ServerPlayerEntity) arg.get(1);
                            BlockPos postn = (BlockPos) arg.get(2);
                            String key = (String) arg.get(3);
                            if (count == 1) {
                                if (playr.getInventory().getMainHandStack().getItem() == Items.WATER_BUCKET) {
                                    playr.getInventory().setStack(playr.getInventory().selectedSlot, Items.BUCKET.getDefaultStack());
//                                    playr.getServerWorld().setBlockState(postn, Blocks.AIR.getDefaultState());
                                    sendMessage(playr, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.icy.message.get"));
                                    playr.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, 1, 0);
                                    spawnParticles(playr, ParticleTypes.CLOUD, false, 0, 5);
                                }
                                Task.removeTask(key);
                                return new ArrayList<>();
                            }
                            return Arrays.asList(count + 1, playr, postn, key);
                        };
                        String key = getTaskKey((ServerPlayerEntity) player, "icingWaterInBucket" + new Random().nextInt(1000));
                        Task.addTask(key, task, Arrays.asList(0, player, posOffset, key));
                    }
                    else if (blockState.getBlock() == Blocks.WATER_CAULDRON && blockState.get(LeveledCauldronBlock.LEVEL) == 3) {
                        IFuncRet task = (arg) -> {
                            int count = (Integer) arg.getFirst();
                            ServerPlayerEntity playr = (ServerPlayerEntity) arg.get(1);
                            BlockPos postn = (BlockPos) arg.get(2);
                            String key = (String) arg.get(3);
                            if (count == 20) {
                                if (playr.getInventory().getMainHandStack().getItem() == Items.WATER_BUCKET) {
                                    playr.getInventory().setStack(playr.getInventory().selectedSlot, Items.BUCKET.getDefaultStack());
                                    playr.getServerWorld().setBlockState(postn, Blocks.CAULDRON.getDefaultState());
                                    sendMessage(playr, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.icy.message.get"));
                                    playr.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, 1, 0);
                                    spawnParticles(playr, ParticleTypes.CLOUD, false, 0, 5);
                                }
                                Task.removeTask(key);
                                return new ArrayList<>();
                            }
                            return Arrays.asList(count + 1, playr, postn, key);
                        };
                        String key = getTaskKey((ServerPlayerEntity) player, "icingWaterInWaterCauldron" + new Random().nextInt(1000));
                        Task.addTask(key, task, Arrays.asList(0, player, pos, key));
                    }
                }
            }
            return ActionResult.PASS;
        });
        UseItemCallback.EVENT.register((PlayerEntity player, World world, Hand hand) -> {
            if (isAllowedInTicker()){
                Item item = player.getStackInHand(hand).getItem();
                if (item == Items.BUCKET){
                    IFuncRet task = (arg) -> {
                        int count = (Integer) arg.getFirst();
                        ServerPlayerEntity playr = (ServerPlayerEntity) arg.get(1);
                        String key = (String) arg.get(2);
                        if (count == 1) {
                            if (playr.getInventory().getMainHandStack().getItem() == Items.WATER_BUCKET) {
                                playr.getInventory().setStack(playr.getInventory().selectedSlot, Items.BUCKET.getDefaultStack());
                                sendMessage(playr, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.icy.message.get"));
                                playr.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, 1, 0);
                                spawnParticles(playr, ParticleTypes.CLOUD, false, 0, 5);
                            }
                            Task.removeTask(key);
                            return new ArrayList<>();
                        }
                        return Arrays.asList(count + 1, playr, key);
                    };
                    String key = getTaskKey((ServerPlayerEntity) player, "icingWaterInBukkitWhenUse" + new Random().nextInt(1000));
                    Task.addTask(key, task, Arrays.asList(0, player, key));
                }
            }
            return TypedActionResult.pass(ItemStack.EMPTY);
        });
        PlayerBlockBreakEvents.BEFORE.register((World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity entity) -> {
            if (isAllowed() && state.getBlock() == Blocks.ICE && world == player.getServer().getOverworld()) {
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
                return false;
            }
            return true;
        });
    }


    @Override
    public int logic(ServerPlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        return 0;
    }

    @Override
    public void onChallengeStart(ServerPlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.icy.message.trigger"));
    }

    @Override
    public void onChallengeEnd(ServerPlayerEntity player) {

    }
}
