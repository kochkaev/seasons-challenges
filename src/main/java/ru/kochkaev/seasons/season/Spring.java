package ru.kochkaev.seasons.season;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.SeasonObject;
import net.minecraft.server.MinecraftServer;

import java.util.ArrayList;
import java.util.Collections;

public class Spring extends SeasonObject {

    public Spring() {
        super("SPRING", () -> Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.spring.name"), new ArrayList<>(), Collections.singletonList("WINTER"), () -> Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.season.spring.chance"));
    }

    @Override
    public void onSeasonSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.spring.message"));
    }
    @Override
    public void onSeasonRemove() {

    }
}
