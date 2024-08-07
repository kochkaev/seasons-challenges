package ru.kochkaev.seasons.season;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.SeasonObject;
import net.minecraft.server.MinecraftServer;

public class Summer extends SeasonObject {

    public Summer() {
        super("SUMMER", Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.summer.name"));
    }

    @Override
    public void onSeasonSet(MinecraftServer server) {
        sendMessage(server, Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.summer.message"));
    }
    @Override
    public void onSeasonRemove() {

    }
}
