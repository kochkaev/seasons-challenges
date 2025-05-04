package ru.kochkaev.seasons.challenge;

import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.vehicle.AbstractBoatEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import ru.kochkaev.api.seasons.SeasonsAPI;
import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.provider.Task;
import ru.kochkaev.api.seasons.provider.Weather;

import java.util.*;
import java.util.function.Function;

public class StrongCurrent extends ChallengeObject {

    public StrongCurrent() {
        super("StrongCurrent", Collections.singletonList(Weather.getWeatherByID("STORMY")), true);
    }

//    @SuppressWarnings("rawtypes")
//    private static final List<EntityType> boats = Arrays.asList(EntityType.BOAT, EntityType.CHEST_BOAT);

    @Override
    public void register() {
    }

    @Override
    public int logic(PlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        if (player.getWorld().equals(SeasonsAPI.getOverworld())) {
            if (player.hasVehicle() && player.getSteppingBlockState().getBlock() == Blocks.WATER) {
                if (new Random().nextInt(100) <= 5) {
                    if (player.getVehicle() instanceof AbstractBoatEntity) {
                        Entity boat = player.getVehicle();
                        Function<List<?>, List<?>> task = (args) -> {
                            Entity bt = (Entity) args.getFirst();
                            PlayerEntity playr = (PlayerEntity) args.get(1);
                            int counter = (Integer) args.get(2);
//                        Function<List<?>, List<?>> tsk = (Function<List<?>, List<?>>) args.get(3);
                            String tsk = (String) args.get(3);
                            bt.onBubbleColumnCollision(true);
                            bt.onBubbleColumnSurfaceCollision(true, bt.getBlockPos());
//                        spawnParticles(player, ParticleTypes.BUBBLE, false, 0, 5);
                            if (bt.shouldDismountUnderwater()) {
                                Task.removeTask(tsk);
                                playr.dismountVehicle();
                            }
                            return Arrays.asList(bt, playr, counter + 1, tsk);
                        };
                        giveEffect(player, StatusEffects.NAUSEA);
                        spawnParticles(player, ParticleTypes.ANGRY_VILLAGER, true, 1, 2);
                        var taskName = getTaskKey(player, "StrongCurrent" + new Random().nextInt(1000));
                        Task.addTask(taskName, task, Arrays.asList(boat, player, 0, taskName));
                    } else {
                        player.dismountVehicle();
                        spawnParticles(player, ParticleTypes.ANGRY_VILLAGER, true, 1, 2);
                    }
                }
                return 0;
            }
//                if (countOfInARowCalls > 0) {
//                    removeEffect(player, StatusEffects.NAUSEA);
//                    removeEffect(player, StatusEffects.MINING_FATIGUE);
//                    return 0;
//                }
            else if (player.getBlockStateAtPos().getBlock() == Blocks.WATER) {
                if (countOfInARowCalls == 1)
                    sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.strongCurrent.message.get"));
                else if (countOfInARowCalls == ticksPerAction) {
                    spawnParticles(player, ParticleTypes.ANGRY_VILLAGER, true, 1, 2);
                    giveEffect(player, StatusEffects.NAUSEA);
                    giveEffect(player, StatusEffects.MINING_FATIGUE);
                } else if (countOfInARowCalls % ticksPerAction == 0) {
                    Objects.requireNonNull(Objects.requireNonNull(player.getServer()).getWorld(player.getWorld().getRegistryKey())).spawnParticles(ParticleTypes.BUBBLE, player.getX(), player.getY(), player.getZ(), 2, player.getX(), player.getY(), player.getZ(), 0.1);
                    damageStorm(player);
                }
                return countOfInARowCalls + 1;
            }
        }
        if (countOfInARowCalls != 0) {
            if (player.getSteppingBlockState().getBlock() != Blocks.WATER) {
                if (countOfInARowCalls > 0) {
                    return -ticksPerAction-1;
                }
                else if (countOfInARowCalls == -1) {
                    spawnParticles(player, ParticleTypes.HAPPY_VILLAGER, true, 1,10);
                    removeEffect(player, StatusEffects.NAUSEA);
                    removeEffect(player, StatusEffects.MINING_FATIGUE);
                    sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.strongCurrent.message.remove"));
                }
            }
            return countOfInARowCalls+1;
        }
        return 0;
    }

    @Override
    public void onChallengeStart(PlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.strongCurrent.message.trigger"));
    }

    @Override
    public void onChallengeEnd(PlayerEntity player) {
        removeEffect(player, StatusEffects.MINING_FATIGUE);
        removeEffect(player, StatusEffects.NAUSEA);
    }
}
