package ru.kochkaev.seasons.challenge;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.vehicle.AbstractBoatEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import ru.kochkaev.api.seasons.SeasonsAPI;
import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.provider.Weather;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Frostbite extends ChallengeObject {

    public Frostbite() {
        super("Frostbite", Arrays.asList(Weather.getWeatherByID("SNOWY"), Weather.getWeatherByID("FREEZING")), true);
    }

    private static final List<Block> waters = Arrays.asList(Blocks.WATER, Blocks.WATER_CAULDRON);

    @Override
    public void register() {
    }

    @Override
    public int logic(PlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        if (player.getWorld().equals(SeasonsAPI.getOverworld())) {
            boolean doNotWearArmor = false;
            for (EquipmentSlot it : Arrays.stream(EquipmentSlot.values()).filter(it -> { return it.getType().equals(EquipmentSlot.Type.HUMANOID_ARMOR); }). toList())
                doNotWearArmor = player.getEquippedStack(it).getItem() == Items.AIR || doNotWearArmor;
            if (waters.contains(player.getBlockStateAtPos().getBlock()) && !(player.hasVehicle() && (player.getVehicle() instanceof AbstractBoatEntity))) {
                if (countOfInARowCalls == 0) {
                    player.setInPowderSnow(true);
                    giveFrozen(player);
                }
                damageCold(player);
                spawnParticles(player, ParticleTypes.SNOWFLAKE, true, 0, 5);
                return 1;
            }
            if (doNotWearArmor) {
                if (countOfInARowCalls == 0) {
                    player.setInPowderSnow(true);
                    giveFrozen(player);
                    spawnParticles(player, ParticleTypes.SNOWFLAKE, true, 0, 5);
                    return countOfInARowCalls + 1;
                }
                if (countOfInARowCalls == 1) {
                    return countOfInARowCalls + 1;
                } else if (countOfInARowCalls % ticksPerAction == 0) {
                    damageCold(player);
                    spawnParticles(player, ParticleTypes.SNOWFLAKE, true, 0, 5);
                    return 1;
                }
                return countOfInARowCalls + 1;
            }
        }
        if (countOfInARowCalls > 0) {
            player.setInPowderSnow(false);
            removeFrozen(player);
        }
        return 0;
    }

    @Override
    public void onChallengeStart(PlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.frostbite.message.trigger"));
    }

    @Override
    public void onChallengeEnd(PlayerEntity player) {
        player.setInPowderSnow(false);
        removeFrozen(player);
    }
}
