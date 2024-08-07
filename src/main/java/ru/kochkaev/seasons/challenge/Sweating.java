package ru.kochkaev.seasons.challenge;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvents;
import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.service.Weather;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sweating extends ChallengeObject {

    public Sweating() {
        super(Collections.singletonList(Weather.getWeatherByID("HOT")), false);
    }

    private static final List<Block> waters = Arrays.asList(Blocks.WATER, Blocks.WATER_CAULDRON);

    @Override
    public void register() {
    }

    @Override
    public int logic(ServerPlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        boolean isFullArmor = true;
        for (ItemStack item : player.getArmorItems()) isFullArmor = item.getItem() != Items.AIR && isFullArmor;
        if (isFullArmor) {
            if (!(player.getSteppingBlockState().getBlock() == Blocks.WATER || waters.contains(player.getBlockStateAtPos().getBlock()))) {
                if (countOfInARowCalls == 0)
                    sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.sweating.message.get"));
                else if (countOfInARowCalls % ticksPerAction == 0) {
                    damageHot(player);
                    spawnParticles(player, ParticleTypes.SMALL_FLAME, false, 0, 10);
                }
                if (countOfInARowCalls == ticksPerAction) giveEffect(player, StatusEffects.MINING_FATIGUE);
                return countOfInARowCalls + 1;
            }
            else if (countOfInARowCalls > 0) {
                player.playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE);
                spawnParticles(player, ParticleTypes.SMOKE, false, 0, 10);
            }
        }
        else if (countOfInARowCalls > 0) {
            sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.sweating.message.remove"));
            return -1 - ticksPerAction;
        }
        else if (countOfInARowCalls == -1) {
            removeEffect(player, StatusEffects.MINING_FATIGUE);
            spawnParticles(player, ParticleTypes.HAPPY_VILLAGER, false, 1, 10);
        }
        else if (countOfInARowCalls < -1) return countOfInARowCalls + 1;
        return 0;
    }

    @Override
    public void onChallengeStart(ServerPlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.sweating.message.trigger"));
    }

    @Override
    public void onChallengeEnd(ServerPlayerEntity player) {
        removeEffect(player, StatusEffects.MINING_FATIGUE);
    }
}
