package ru.kochkaev.seasons.challenge;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.provider.Weather;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sweating extends ChallengeObject {

    public Sweating() {
        super("Sweating", Collections.singletonList(Weather.getWeatherByID("HOT")), false);
    }

    private static final List<Block> waters = Arrays.asList(Blocks.WATER, Blocks.WATER_CAULDRON);

    @Override
    public void register() {
    }

    @Override
    public int logic(PlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        boolean isFullArmor = true;
        for (EquipmentSlot it : Arrays.stream(EquipmentSlot.values()).filter(it -> { return it.getType().equals(EquipmentSlot.Type.HUMANOID_ARMOR); }). toList())
            isFullArmor = player.getEquippedStack(it).getItem() != Items.AIR && isFullArmor;
        if (isFullArmor) {
            if (!(player.getSteppingBlockState().getBlock() == Blocks.WATER || waters.contains(player.getBlockStateAtPos().getBlock()))) {
                if (countOfInARowCalls == 0)
                    sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.sweating.message.get"));
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
            sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.sweating.message.remove"));
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
    public void onChallengeStart(PlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.sweating.message.trigger"));
    }

    @Override
    public void onChallengeEnd(PlayerEntity player) {
        removeEffect(player, StatusEffects.MINING_FATIGUE);
    }
}
