package ru.kochkaev.seasons.season;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.SeasonObject;
import net.minecraft.server.MinecraftServer;

public class Winter extends SeasonObject {

    public Winter() {
        super("WINTER", Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.winter.name"));
    }

    @Override
    public void onSeasonSet(MinecraftServer server) {
        sendMessage(server, Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.winter.message"));
    }
    @Override
    public void onSeasonRemove() {

    }
}
