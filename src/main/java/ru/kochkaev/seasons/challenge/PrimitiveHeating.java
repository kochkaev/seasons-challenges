package ru.kochkaev.seasons.challenge;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import ru.kochkaev.api.seasons.SeasonsAPI;
import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.provider.Weather;

import java.util.Collections;

public class PrimitiveHeating extends ChallengeObject {

    public PrimitiveHeating() {
        super("PrimitiveHeating", Collections.singletonList(Weather.getWeatherByID("COLD")), true);
    }

    private static final Item[] hots = {Items.LAVA_BUCKET, Items.BLAZE_POWDER, Items.BLAZE_ROD,
            Items.DRAGON_BREATH, Items.MAGMA_CREAM};

    @Override
    public void register() {
    }

    @Override
    public int logic(PlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        boolean  isHot  = false;
        var isInOverworld = player.getWorld().equals(SeasonsAPI.getOverworld());
        for (Item item : hots) if (player.getInventory().count(item) > 0) isHot = true;
        if (isHot && isInOverworld && countOfInARowCalls==0) {
            sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.primitiveHeating.message.get"));
            giveEffect(player, StatusEffects.RESISTANCE);
            spawnParticles(player, ParticleTypes.SMALL_FLAME, false, 0, 10);
            return 1;
        }
        else if ((!isHot || !isInOverworld) && countOfInARowCalls>0) {
            sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.primitiveHeating.message.remove"));
            removeEffect(player, StatusEffects.RESISTANCE);
            spawnParticles(player, ParticleTypes.ANGRY_VILLAGER, false, 1, 2);
        }
        else if (countOfInARowCalls > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public void onChallengeStart(PlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.primitiveHeating.message.trigger"));
    }

    @Override
    public void onChallengeEnd(PlayerEntity player) {
        removeEffect(player, StatusEffects.RESISTANCE);
    }
}
