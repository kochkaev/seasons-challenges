package ru.kochkaev.seasons.season;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.SeasonObject;
import net.minecraft.server.MinecraftServer;

public class Fall extends SeasonObject {

    public Fall() {
        super("FALL", () -> Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.fall.name"));
    }

    @Override
    public void onSeasonSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.fall.message"));
    }
    @Override
    public void onSeasonRemove() {

    }
}
