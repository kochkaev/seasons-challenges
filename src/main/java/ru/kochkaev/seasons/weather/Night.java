package ru.kochkaev.seasons.weather;

import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.WeatherObject;
import ru.kochkaev.seasons.service.Season;

import java.util.Arrays;

public class Night extends WeatherObject {

    public Night() {
        super("NIGHT",
                Config.getLang().getString("lang.weather.night.name"),
                Config.getLang().getString("lang.weather.night.message"),
                null, null,
                Config.getConfig().getInt("conf.weather.night.chance"),
                Arrays.asList(Season.getSeasonByID("WINTER"), Season.getSeasonByID("SPRING"), Season.getSeasonByID("SUMMER"), Season.getSeasonByID("FALL")), true);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
