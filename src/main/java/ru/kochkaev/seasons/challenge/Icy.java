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
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import ru.kochkaev.api.seasons.SeasonsAPI;
import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.provider.Task;
import ru.kochkaev.api.seasons.provider.Weather;

import java.util.*;
import java.util.function.Function;

public class Icy extends ChallengeObject {

    public Icy() {
        super("Icy", Collections.singletonList(Weather.getWeatherByID("FREEZING")), true);
    }

    @Override
    public void register() {
        UseBlockCallback.EVENT.register((PlayerEntity player, World world, Hand hand, BlockHitResult hitResult) -> {
            if (isAllowedInTicker() && player.getWorld().equals(SeasonsAPI.getOverworld())) {
                BlockPos pos = hitResult.getBlockPos();
                BlockPos posOffset= pos.offset(hitResult.getSide());
                BlockState blockState = world.getBlockState(pos);
                BlockState blockStateOffset= world.getBlockState(posOffset);
                Item item = player.getStackInHand(hand).getItem();
                if (item == Items.WATER_BUCKET) {
                    if (blockState.getBlock() == Blocks.CAULDRON) {
                        Function<List<?>, List<?>> task = (arg) -> {
                            int count = (Integer) arg.getFirst();
                            PlayerEntity playr = (PlayerEntity) arg.get(1);
                            BlockPos postn = (BlockPos) arg.get(2);
                            String key = (String) arg.get(3);
                            if (count == 10) {
                                if (playr.getWorld().getBlockState(postn).getBlock() == Blocks.WATER_CAULDRON) {
                                    playr.getWorld().setBlockState(postn, Blocks.CAULDRON.getDefaultState());
                                    sendMessage(playr, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.icy.message.get"));
                                    spawnParticles(playr, ParticleTypes.CLOUD, false, 0, 5);
                                    playr.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE);
                                }
                                Task.removeTask(key);
                                return new ArrayList<>();
                            }
                            return Arrays.asList(count + 1, playr, postn, key);
                        };
                        String key = getTaskKey(player, "icingWaterInCauldron" + new Random().nextInt(1000));
                        Task.addTask(key, task, Arrays.asList(0, player, pos, key));
                    }
                    else if (blockStateOffset.getBlock() == Blocks.AIR || blockStateOffset.getBlock() == Blocks.WATER){
                        Function<List<?>, List<?>> task = (arg) -> {
                            int count = (Integer) arg.getFirst();
                            PlayerEntity playr = (PlayerEntity) arg.get(1);
                            BlockPos postn = (BlockPos) arg.get(2);
                            String key = (String) arg.get(3);
                            if (count == 10) {
                                if (playr.getWorld().getBlockState(postn).getBlock() == Blocks.WATER) {
                                    playr.getWorld().setBlockState(postn, Blocks.ICE.getDefaultState());
                                    sendMessage(playr, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.icy.message.get"));
                                    spawnParticles(playr, ParticleTypes.CLOUD, false, 0, 5);
                                    playr.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE);
                                }
                                Task.removeTask(key);
                                return new ArrayList<>();
                            }
                            return Arrays.asList(count + 1, playr, postn, key);
                        };
                        String key = getTaskKey(player, "icingWater" + new Random().nextInt(1000));
                        Task.addTask(key, task, Arrays.asList(0, player, posOffset, key));
                    }
                }
                if (item == Items.BUCKET) {
                    if (blockStateOffset.getBlock() == Blocks.WATER /* && !(blockState.getFluidState().get(WaterFluid.Still.LEVEL) > 0)*/) {
                        Function<List<?>, List<?>> task = (arg) -> {
                            int count = (Integer) arg.getFirst();
                            PlayerEntity playr = (PlayerEntity) arg.get(1);
                            BlockPos postn = (BlockPos) arg.get(2);
                            String key = (String) arg.get(3);
                            if (count == 1) {
                                if (playr.getInventory().getSelectedStack().getItem() == Items.WATER_BUCKET) {
                                    playr.getInventory().setSelectedStack(Items.BUCKET.getDefaultStack());
//                                    playr.getServerWorld().setBlockState(postn, Blocks.AIR.getDefaultState());
                                    sendMessage(playr, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.icy.message.get"));
                                    playr.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, 1, 0);
                                    spawnParticles(playr, ParticleTypes.CLOUD, false, 0, 5);
                                }
                                Task.removeTask(key);
                                return new ArrayList<>();
                            }
                            return Arrays.asList(count + 1, playr, postn, key);
                        };
                        String key = getTaskKey(player, "icingWaterInBucket" + new Random().nextInt(1000));
                        Task.addTask(key, task, Arrays.asList(0, player, posOffset, key));
                    }
                    else if (blockState.getBlock() == Blocks.WATER_CAULDRON && blockState.get(LeveledCauldronBlock.LEVEL) == 3) {
                        Function<List<?>, List<?>> task = (arg) -> {
                            int count = (Integer) arg.getFirst();
                            PlayerEntity playr = (PlayerEntity) arg.get(1);
                            BlockPos postn = (BlockPos) arg.get(2);
                            String key = (String) arg.get(3);
                            if (count == 20) {
                                if (playr.getInventory().getSelectedStack().getItem() == Items.WATER_BUCKET) {
                                    playr.getInventory().setSelectedStack(Items.BUCKET.getDefaultStack());
                                    playr.getWorld().setBlockState(postn, Blocks.CAULDRON.getDefaultState());
                                    sendMessage(playr, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.icy.message.get"));
                                    playr.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, 1, 0);
                                    spawnParticles(playr, ParticleTypes.CLOUD, false, 0, 5);
                                }
                                Task.removeTask(key);
                                return new ArrayList<>();
                            }
                            return Arrays.asList(count + 1, playr, postn, key);
                        };
                        String key = getTaskKey(player, "icingWaterInWaterCauldron" + new Random().nextInt(1000));
                        Task.addTask(key, task, Arrays.asList(0, player, pos, key));
                    }
                }
            }
            return ActionResult.PASS;
        });
        UseItemCallback.EVENT.register((PlayerEntity player, World world, Hand hand) -> {
            if (isAllowedInTicker() && player.getWorld().equals(SeasonsAPI.getOverworld())){
                Item item = player.getStackInHand(hand).getItem();
                if (item == Items.BUCKET){
                    Function<List<?>, List<?>> task = (arg) -> {
                        int count = (Integer) arg.getFirst();
                        PlayerEntity playr = (PlayerEntity) arg.get(1);
                        String key = (String) arg.get(2);
                        if (count == 1) {
                            if (playr.getInventory().getSelectedStack().getItem() == Items.WATER_BUCKET) {
                                playr.getInventory().setSelectedStack(Items.BUCKET.getDefaultStack());
                                sendMessage(playr, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.icy.message.get"));
                                playr.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, 1, 0);
                                spawnParticles(playr, ParticleTypes.CLOUD, false, 0, 5);
                            }
                            Task.removeTask(key);
                            return new ArrayList<>();
                        }
                        return Arrays.asList(count + 1, playr, key);
                    };
                    String key = getTaskKey(player, "icingWaterInBukkitWhenUse" + new Random().nextInt(1000));
                    Task.addTask(key, task, Arrays.asList(0, player, key));
                }
            }
            return ActionResult.PASS;
        });
        PlayerBlockBreakEvents.BEFORE.register((World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity entity) -> {
            if (isAllowedInTicker() && state.getBlock() == Blocks.ICE && world == SeasonsAPI.getOverworld()) {
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
                return false;
            }
            return true;
        });
    }


    @Override
    public int logic(PlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        return 0;
    }

    @Override
    public void onChallengeStart(PlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.icy.message.trigger"));
    }

    @Override
    public void onChallengeEnd(PlayerEntity player) {

    }
}
