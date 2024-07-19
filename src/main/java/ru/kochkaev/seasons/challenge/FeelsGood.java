package ru.kochkaev.seasons.challenge;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.service.Weather;

import java.util.Collections;

public class FeelsGood extends ChallengeObject {

    public FeelsGood() {
        super(Collections.singletonList(Weather.getWeatherByID("WARM")), true);
    }

    @Override
    public void register(){

    }

    @Override
    public int logic(ServerPlayerEntity player, int countOfInARowCalls, int ticksPerAction){
        boolean wearArmor = false;
        for (ItemStack item : player.getArmorItems()) wearArmor = item.getItem() != Items.AIR || (wearArmor);
        if (!wearArmor) {
            if (countOfInARowCalls == 0) {
                sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.feelsGood.message.get"));
                giveEffect(player, StatusEffects.SPEED);
                spawnParticles(player, ParticleTypes.HAPPY_VILLAGER, false, 1, 10);
            }
            return countOfInARowCalls+1;
        }
        else if (wearArmor && countOfInARowCalls>0) {
            spawnParticles(player, ParticleTypes.ANGRY_VILLAGER, false, 1, 2);
            sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.feelsGood.message.remove"));
            removeEffect(player, StatusEffects.SPEED);
        }
        return  0;
    }

    @Override
    public void onChallengeStart(ServerPlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.feelsGood.message.trigger"));
    }

    @Override
    public void onChallengeEnd(ServerPlayerEntity player) {
        removeEffect(player, StatusEffects.SPEED);
    }

}
