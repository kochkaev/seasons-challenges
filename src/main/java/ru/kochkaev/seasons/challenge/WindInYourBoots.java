package ru.kochkaev.seasons.challenge;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.provider.Weather;

import java.util.Collections;
import java.util.Random;

public class WindInYourBoots extends ChallengeObject {

    public WindInYourBoots() {
        super("WindInYourBoots", Collections.singletonList(Weather.getWeatherByID("BREEZY")), false);
    }

    @Override
    public void register() {
    }

    @Override
    public int logic(PlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        if (countOfInARowCalls >= 60 * 2) {
            int random = new Random().nextInt(10);
            if (random < 5 && !player.hasStatusEffect(StatusEffects.SPEED)) {
                giveEffect(player, StatusEffects.SPEED, 20*10, 0);
                sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.windInYourBoots.message.get"));
                spawnParticles(player, ParticleTypes.HAPPY_VILLAGER, false, 1, 10);
            }
            return 0;
        }
        else {
            return countOfInARowCalls+1;
        }
    }

    @Override
    public void onChallengeStart(PlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.windInYourBoots.message.trigger"));
    }

    @Override
    public void onChallengeEnd(PlayerEntity player) {

    }
}
