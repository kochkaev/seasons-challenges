package ru.kochkaev.seasons.season;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.SeasonObject;
import net.minecraft.server.MinecraftServer;

import java.util.ArrayList;
import java.util.Collections;

public class Spring extends SeasonObject {

    public Spring() {
        super(() -> Config.getModConfig("Seasons Challenges").getLang().getText("lang.season.spring.name"), "SPRING", new ArrayList<>(), Collections.singletonList("WINTER"), () -> Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.season.spring.chance"));
    }

    @Override
    public void onSeasonSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getText("lang.season.spring.message"));
    }
    @Override
    public void onSeasonRemove() {

    }
}
