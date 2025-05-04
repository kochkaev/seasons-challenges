package ru.kochkaev.seasons.season;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.SeasonObject;
import net.minecraft.server.MinecraftServer;

import java.util.ArrayList;
import java.util.Collections;

public class Winter extends SeasonObject {

    public Winter() {
        super(() -> Config.getModConfig("Seasons Challenges").getLang().getText("lang.season.winter.name"), "WINTER", new ArrayList<>(), Collections.singletonList("FALL"), () -> Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.season.winter.chance"));
    }

    @Override
    public void onSeasonSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getText("lang.season.winter.message"));
    }
    @Override
    public void onSeasonRemove() {

    }
}
