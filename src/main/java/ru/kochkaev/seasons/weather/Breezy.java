package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;

import java.util.Arrays;

public class Breezy extends WeatherObject {

    public Breezy() {
        super("BREEZY",
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.breezy.name"),
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.breezy.message"),
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.breezy.chance"),
                Arrays.asList(Season.getSeasonByID("SPRING"), Season.getSeasonByID("FALL")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
