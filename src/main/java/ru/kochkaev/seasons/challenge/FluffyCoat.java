package ru.kochkaev.seasons.challenge;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import ru.kochkaev.api.seasons.SeasonsAPI;
import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.provider.Weather;

import java.util.Arrays;
import java.util.Collections;

public class FluffyCoat extends ChallengeObject {

    public FluffyCoat() {
        super("FluffyCoat", Collections.singletonList(Weather.getWeatherByID("SNOWY")), true);
    }

    @Override
    public void register(){
    }

    @Override
    public int logic(PlayerEntity player, int countOfInARowCalls, int ticksPerAction){
        if (player.getWorld().equals(SeasonsAPI.getOverworld())) {
            boolean doNotWearArmor = false;
            for (EquipmentSlot it : Arrays.stream(EquipmentSlot.values()).filter(it -> { return it.getType().equals(EquipmentSlot.Type.HUMANOID_ARMOR); }). toList())
                doNotWearArmor = player.getEquippedStack(it).getItem() == Items.AIR || doNotWearArmor;
            if (!doNotWearArmor) {
                if (countOfInARowCalls == 0) {
                    sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.fluffyCoat.message.get"));
                    giveEffect(player, StatusEffects.RESISTANCE);
                    spawnParticles(player, ParticleTypes.HAPPY_VILLAGER, false, 1, 10);
                }
                return countOfInARowCalls + 1;
            }
        }
        if (countOfInARowCalls > 0) {
            sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.fluffyCoat.message.remove"));
            spawnParticles(player, ParticleTypes.ANGRY_VILLAGER, false, 1, 2);
            removeEffect(player, StatusEffects.RESISTANCE);
        }
        return 0;
    }

    @Override
    public void onChallengeStart(PlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.fluffyCoat.message.trigger"));
    }

    @Override
    public void onChallengeEnd(PlayerEntity player) {
        removeEffect(player, StatusEffects.RESISTANCE);
    }

}
