package ru.kochkaev.seasons.weather;

import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.WeatherObject;
import ru.kochkaev.seasons.service.Season;

import java.util.Arrays;

public class Breezy extends WeatherObject {

    public Breezy() {
        super("BREEZY",
                Config.getLang().getString("lang.weather.breezy.name"),
                Config.getLang().getString("lang.weather.breezy.message"),
                false, false,
                Config.getConfig().getInt("conf.weather.breezy.chance"),
                Arrays.asList(Season.getSeasonByID("SPRING"), Season.getSeasonByID("FALL")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
