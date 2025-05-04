package ru.kochkaev.seasons.challenge;

import net.minecraft.block.Blocks;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import ru.kochkaev.api.seasons.SeasonsAPI;
import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.provider.Weather;

import java.util.Collections;

public class TheShivers extends ChallengeObject {

    public TheShivers() {
        super("TheShivers", Collections.singletonList(Weather.getWeatherByID("CHILLY")), false);
    }

    @Override
    public void register() {
    }

    @Override
    public int logic(PlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        if (player.getWorld().equals(SeasonsAPI.getOverworld()) && player.getBlockStateAtPos().getBlock().equals(Blocks.WATER) && !player.hasVehicle()) {
            if (countOfInARowCalls == 0) {
                sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.theShivers.message.get"));
                giveFrozen(player);
            }
            if (countOfInARowCalls % ticksPerAction == 0) {
                damageCold(player);
                spawnParticles(player, ParticleTypes.SNOWFLAKE, true, 0, 5);
            }
            return countOfInARowCalls+1;
        }
        else if (countOfInARowCalls > 0) removeFrozen(player);
        return 0;
    }

    @Override
    public void onChallengeStart(PlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.theShivers.message.trigger"));
    }

    @Override
    public void onChallengeEnd(PlayerEntity player) {

    }
}
