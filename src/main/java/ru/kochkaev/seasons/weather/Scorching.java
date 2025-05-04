package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.provider.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Collections;

public class Scorching extends WeatherObject {

    public Scorching() {
        super(
                () -> Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.scorching.name"),
                "SCORCHING",
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.weather.scorching.chance"),
                Collections.singletonList(Season.getSeasonByID("SUMMER")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.scorching.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
