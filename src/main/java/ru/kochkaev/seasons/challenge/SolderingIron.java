package ru.kochkaev.seasons.challenge;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import ru.kochkaev.api.seasons.service.Config;
import ru.kochkaev.api.seasons.object.ChallengeObject;
import ru.kochkaev.api.seasons.service.Weather;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolderingIron extends ChallengeObject {

    public SolderingIron() {
        super("SolideringIron", Collections.singletonList(Weather.getWeatherByID("SCORCHING")), false);
    }

    private static final List<Item> items = Arrays.asList(Items.BUCKET, Items.IRON_INGOT, Items.IRON_BLOCK,
            Items.IRON_DOOR, Items.IRON_HELMET, Items.IRON_CHESTPLATE, Items.IRON_LEGGINGS,
            Items.IRON_BOOTS, Items.ANVIL, Items.IRON_NUGGET, Items.IRON_BARS, Items.IRON_TRAPDOOR,
            Items.CHAINMAIL_HELMET, Items.CHAINMAIL_CHESTPLATE, Items.CHAINMAIL_LEGGINGS,
            Items.CHAINMAIL_BOOTS, Items.WATER_BUCKET, Items.LAVA_BUCKET);
    
    @Override
    public void register() {
    }

    @Override
    public int logic(ServerPlayerEntity player, int countOfInARowCalls, int ticksPerAction) {
//        Main.getLogger().info(player.getInventory().getMainHandStack().getItem().toString());
        boolean contains = items.contains(player.getInventory().getMainHandStack().getItem());
        if (contains) {
            if (countOfInARowCalls == 0) sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.solderingIron.message.get"));
            else {
                spawnParticles(player, ParticleTypes.SMALL_FLAME, false, 0,10);
                damageHot(player);
            }
            return countOfInARowCalls+1;
        }
        return 0;
    }

    @Override
    public void onChallengeStart(ServerPlayerEntity player) {
        sendMessage(player, Config.getModConfig("Seasons Challenges").getLang().getString("lang.challenge.solderingIron.message.trigger"));
    }

    @Override
    public void onChallengeEnd(ServerPlayerEntity player) {

    }
}
