package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.service.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Collections;

public class Scorching extends WeatherObject {

    public Scorching() {
        super("SCORCHING",
                () -> Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.scorching.name"),
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.scorching.chance"),
                Collections.singletonList(Season.getSeasonByID("SUMMER")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.scorching.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
