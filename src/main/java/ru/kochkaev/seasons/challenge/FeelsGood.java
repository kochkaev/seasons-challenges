package ru.kochkaev.seasons.challenge;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;
import ru.kochkaev.api.seasons.SeasonsAPI;
import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.provider.Weather;

import java.util.Arrays;
import java.util.Collections;

public class FeelsGood extends ChallengeObject {

    public FeelsGood() {
        super("FeelsGood", Collections.singletonList(Weather.getWeatherByID("WARM")), false);
    }

    @Override
    public void register(){

    }

    @Override
    public int logic(PlayerEntity player, int countOfInARowCalls, int ticksPerAction){
        if (player.getWorld().equals(SeasonsAPI.getOverworld())) {
            boolean wearArmor = false;
            for (EquipmentSlot it : Arrays.stream(EquipmentSlot.values()).filter(it -> { return it.getType().equals(EquipmentSlot.Type.HUMANOID_ARMOR); }). toList())
                wearArmor = player.getEquippedStack(it).getItem() != Items.AIR || (wearArmor);
            if (!wearArmor) {
                if (countOfInARowCalls == 0) {
                    sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.feelsGood.message.get"));
                    giveEffect(player, StatusEffects.SPEED);
                    spawnParticles(player, ParticleTypes.HAPPY_VILLAGER, false, 1, 10);
                }
                return countOfInARowCalls + 1;
            }
        }
        if (countOfInARowCalls > 0) {
            spawnParticles(player, ParticleTypes.ANGRY_VILLAGER, false, 1, 2);
            sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.feelsGood.message.remove"));
            removeEffect(player, StatusEffects.SPEED);
        }
        return  0;
    }

    @Override
    public void onChallengeStart(PlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.feelsGood.message.trigger"));
    }

    @Override
    public void onChallengeEnd(PlayerEntity player) {
        removeEffect(player, StatusEffects.SPEED);
    }

}
