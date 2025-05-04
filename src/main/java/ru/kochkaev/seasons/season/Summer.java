package ru.kochkaev.seasons.season;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.SeasonObject;
import net.minecraft.server.MinecraftServer;

import java.util.ArrayList;
import java.util.Collections;

public class Summer extends SeasonObject {

    public Summer() {
        super(() -> Config.getModConfig("Seasons Challenges").getLang().getText("lang.season.summer.name"), "SUMMER", new ArrayList<>(), Collections.singletonList("SPRING"), () -> Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.season.summer.chance"));
    }

    @Override
    public void onSeasonSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getText("lang.season.summer.message"));
    }
    @Override
    public void onSeasonRemove() {

    }
}
