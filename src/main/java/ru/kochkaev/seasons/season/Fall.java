package ru.kochkaev.seasons.season;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.SeasonObject;
import net.minecraft.server.MinecraftServer;

import java.util.ArrayList;
import java.util.Collections;

public class Fall extends SeasonObject {

    public Fall() {
        super(() -> Config.getModConfig("Seasons Challenges").getLang().getText("lang.season.fall.name"), "FALL", new ArrayList<>(), Collections.singletonList("SUMMER"), () -> Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.season.fall.chance"));
    }

    @Override
    public void onSeasonSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getText("lang.season.fall.message"));
    }
    @Override
    public void onSeasonRemove() {

    }
}
