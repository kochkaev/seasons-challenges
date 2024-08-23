package ru.kochkaev.seasons.challenge;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.service.Weather;

import java.util.Collections;
import java.util.List;

public class Devastation extends ChallengeObject {


    public Devastation() {
        super("Devastation", Collections.singletonList(Weather.getWeatherByID("STORMY")), true);
    }

    @Override
    public void register() {

//        onHeal = registerOnEventMethod("ON_HEAL", this::onHeal);
    }

    @Override
    public int logic(ServerPlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        return 0;
    }

    @Override
    public void onChallengeStart(ServerPlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.devastation.message.trigger"));
    }

    @Override
    public void onChallengeEnd(ServerPlayerEntity player) {

    }

    public boolean onHeal(LivingEntity entity) {
        if (isAllowedInTicker()){
            if (!entity.hasStatusEffect(StatusEffects.REGENERATION)) {
                if (entity.getType() == EntityType.PLAYER) spawnParticles((ServerPlayerEntity) entity, ParticleTypes.ANGRY_VILLAGER, false, 1, 2);
                return false;
            }
        }
        return true;
    }
}
