package ru.kochkaev.seasons.season;

import ru.kochkaev.api.seasons.service.Config;
import ru.kochkaev.api.seasons.object.SeasonObject;
import net.minecraft.server.MinecraftServer;

public class Spring extends SeasonObject {

    public Spring() {
        super("SPRING", () -> Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.spring.name"));
    }

    @Override
    public void onSeasonSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.spring.message"));
    }
    @Override
    public void onSeasonRemove() {

    }
}
