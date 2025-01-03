package ru.kochkaev.seasons.challenge;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.provider.Weather;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HotSand extends ChallengeObject {

    public HotSand() {
        super("HotSand", Collections.singletonList(Weather.getWeatherByID("SCORCHING")), false);
    }

    private static final List<Block> hots = Arrays.asList(Blocks.SAND, Blocks.RED_SAND);

    @Override
    public void register() {
    }

    @Override
    public int logic(PlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        if (!player.hasVehicle() && hots.contains(player.getSteppingBlockState().getBlock()) && !player.isSneaking()) {
            sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.hotSand.message.get"));
            spawnParticles(player, ParticleTypes.SMALL_FLAME, false, 0, 10);
            damageHot(player);
            return countOfInARowCalls+1;
        }
        return 0;
    }

    @Override
    public void onChallengeStart(PlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.hotSand.message.trigger"));
    }

    @Override
    public void onChallengeEnd(PlayerEntity player) {

    }
}
