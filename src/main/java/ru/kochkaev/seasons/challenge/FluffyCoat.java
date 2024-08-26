package ru.kochkaev.seasons.challenge;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import ru.kochkaev.api.seasons.service.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.service.Weather;

import java.util.Collections;

public class FluffyCoat extends ChallengeObject {

    public FluffyCoat() {
        super("FluffyCoat", Collections.singletonList(Weather.getWeatherByID("SNOWY")), true);
    }

    @Override
    public void register(){
    }

    @Override
    public int logic(ServerPlayerEntity player, int countOfInARowCalls, int ticksPerAction){
        boolean doNotWearArmor = false;
        for (ItemStack item : player.getArmorItems()) doNotWearArmor = item.getItem() == Items.AIR || (doNotWearArmor);
        if (!doNotWearArmor) {
            if (countOfInARowCalls == 0) {
                sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.fluffyCoat.message.get"));
                giveEffect(player, StatusEffects.RESISTANCE);
                spawnParticles(player, ParticleTypes.HAPPY_VILLAGER, false, 1, 10);
            }
            return countOfInARowCalls+1;
        }
        else if (countOfInARowCalls>0) {
            sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.fluffyCoat.message.remove"));
            spawnParticles(player, ParticleTypes.ANGRY_VILLAGER, false, 1, 2);
            removeEffect(player, StatusEffects.RESISTANCE);
        }
        return 0;
    }

    @Override
    public void onChallengeStart(ServerPlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.effect.fluffyCoat.message.trigger"));
    }

    @Override
    public void onChallengeEnd(ServerPlayerEntity player) {
        removeEffect(player, StatusEffects.RESISTANCE);
    }

}
