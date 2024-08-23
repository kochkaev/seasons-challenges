package ru.kochkaev.seasons.challenge;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.service.Weather;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WarmingStew extends ChallengeObject {

    public WarmingStew() {
        super("WarmingStew", Collections.singletonList(Weather.getWeatherByID("COLD")), true);
    }

    private final List<Item> stews = Arrays.asList(Items.BEETROOT_SOUP, Items.MUSHROOM_STEW, Items.RABBIT_STEW);

    @Override
    public void register() {
//        registerOnEventMethod("ON_CONSUME", this::onConsume);
    }

    @Override
    public int logic(ServerPlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        return 0;
    }

    @Override
    public void onChallengeStart(ServerPlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.warmingStew.message.trigger"));
    }

    @Override
    public void onChallengeEnd(ServerPlayerEntity player) {

    }

    public boolean onConsume(PlayerEntity player) {
        if (isAllowedInTicker()){
            if (stews.contains(player.getActiveItem().getItem())) {
                sendMessage((ServerPlayerEntity) player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.warmingStew.message.get"));
                spawnParticles((ServerPlayerEntity) player, ParticleTypes.HAPPY_VILLAGER, false, 1, 10);
                giveEffect((ServerPlayerEntity) player, StatusEffects.REGENERATION, 20 * 10, 0);
            }
        }
        return true;
    }
}
