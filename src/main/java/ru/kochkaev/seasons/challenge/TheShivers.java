package ru.kochkaev.seasons.challenge;

import net.minecraft.block.Blocks;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import ru.kochkaev.seasons.util.functional.IFuncRet;
import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.ChallengeObject;
import ru.kochkaev.seasons.service.Weather;

import java.util.Collections;

public class TheShivers extends ChallengeObject {

    public TheShivers() {
        super(Config.getLang().getString("lang.effect.theShivers.message.trigger"), Collections.singletonList(Weather.getWeatherByID("CHILLY")), false);
    }

    private IFuncRet task;

    @Override
    public void register() {
    }

    @Override
    public int logic(ServerPlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        if (player.getBlockStateAtPos().getBlock().equals(Blocks.WATER) && !player.hasVehicle()) {
            if (countOfInARowCalls == 0) {
                sendMessage(player, Config.getLang().getString("lang.effect.theShivers.message.get"));
                task = giveFrozen(player);
            }
            if (countOfInARowCalls % ticksPerAction == 0) {
                damageCold(player);
                spawnParticles(player, ParticleTypes.SNOWFLAKE, true, 0, 5);
            }
            return countOfInARowCalls+1;
        }
        else if (countOfInARowCalls > 0) removeFrozen(task);
        return 0;
    }

    @Override
    public void challengeEnd(ServerPlayerEntity player) {

    }
}
