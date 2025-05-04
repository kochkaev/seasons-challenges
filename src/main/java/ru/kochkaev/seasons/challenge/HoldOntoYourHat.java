package ru.kochkaev.seasons.challenge;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import ru.kochkaev.api.seasons.SeasonsAPI;
import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.provider.Weather;

import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class HoldOntoYourHat extends ChallengeObject {

    public HoldOntoYourHat() {
        super("HoldOntoYourHat", Collections.singletonList(Weather.getWeatherByID("BREEZY")), true);
    }

    @Override
    public void register() {
    }

    @Override
    public int logic(PlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
        if (player.getWorld().equals(SeasonsAPI.getOverworld())) {
            boolean haveLeatherHelmet = false;
            ItemStack helmet = Items.LEATHER_HELMET.getDefaultStack();
            var headStack = player.getEquippedStack(EquipmentSlot.HEAD);
            if (headStack.getItem() == Items.LEATHER_HELMET) {
                haveLeatherHelmet = true;
                helmet = headStack;
            }
//        Main.getLogger().info(String.valueOf(haveLeatherHelmet));
            if (haveLeatherHelmet && new Random().nextInt(100) <= 10) {
                player.dropStack(Objects.requireNonNull(player.getServer()).getWorld(player.getWorld().getRegistryKey()), helmet);
                player.getInventory().removeOne(helmet);
                spawnParticles(player, ParticleTypes.CLOUD, false, 1, 5);
                sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.holdOntoYourHat.message.get"));
            }
        }
        return 0;
    }

    @Override
    public void onChallengeStart(PlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getText("lang.challenge.holdOntoYourHat.message.trigger"));
    }

    @Override
    public void onChallengeEnd(PlayerEntity player) {

    }
}
