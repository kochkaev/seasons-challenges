package ru.kochkaev.seasons.challenge;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import ru.kochkaev.api.seasons.SeasonsAPI;
import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.provider.Weather;

import java.util.Collections;

public class Revitalized extends ChallengeObject {

    public Revitalized() {
        super("Revitalized", Collections.singletonList(Weather.getWeatherByID("BEAUTIFUL")), false);
    }

    @Override
    public void register() {
    }

    @Override
    public int logic(PlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        if (player.getWorld() == SeasonsAPI.getOverworld()) {
            if (countOfInARowCalls == 0) {
                sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.revitalized.message.get"));
                giveEffect(player, StatusEffects.REGENERATION);
                spawnParticles(player, ParticleTypes.HAPPY_VILLAGER, false, 1, 10);
            }
            return 1;
        }
        else if ((player.getWorld() != SeasonsAPI.getOverworld()) && countOfInARowCalls == 1) {
            removeEffect(player, StatusEffects.REGENERATION);
            spawnParticles(player, ParticleTypes.ANGRY_VILLAGER, false, 1, 2);
            sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.revitalized.message.remove"));
        }
        return 0;
    }

    @Override
    public void onChallengeStart(PlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.revitalized.message.trigger"));
    }

    @Override
    public void onChallengeEnd(PlayerEntity player) {
        removeEffect(player, StatusEffects.REGENERATION);
    }
}
