package ru.kochkaev.seasons.challenge;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
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
        boolean doNotWearArmor = false;
        for (ItemStack item : player.getArmorItems()) doNotWearArmor = item.getItem() == Items.AIR || (doNotWearArmor);
        if (waters.contains(player.getBlockStateAtPos().getBlock())) {
            if (countOfInARowCalls==0) {
                player.setInPowderSnow(true);
                giveFrozen(player);
            }
            damageCold(player);
            spawnParticles(player, ParticleTypes.SNOWFLAKE, true, 0, 5);
            return 1;
        }
        if (doNotWearArmor) {
            if (countOfInARowCalls==0) {
                player.setInPowderSnow(true);
                giveFrozen(player);
                spawnParticles(player, ParticleTypes.SNOWFLAKE, true, 0, 5);
                return countOfInARowCalls+1;
            }
            if (countOfInARowCalls==1) {
                return countOfInARowCalls+1;
            }
            else if (countOfInARowCalls%ticksPerAction == 0) {
                damageCold(player);
                spawnParticles(player, ParticleTypes.SNOWFLAKE, true, 0, 5);
                return 1;
            }
            return countOfInARowCalls+1;
        }
        else if (countOfInARowCalls>0) {
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
