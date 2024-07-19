package ru.kochkaev.seasons.weather;

import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.WeatherObject;
import ru.kochkaev.seasons.service.Season;

import java.util.Arrays;

public class Rainy extends WeatherObject {

    public Rainy() {
        super("RAINY",
                Config.getLang().getString("lang.weather.rainy.name"),
                Config.getLang().getString("lang.weather.rainy.message"),
                true, false,
                Config.getConfig().getInt("conf.weather.rainy.chance"),
                Arrays.asList(Season.getSeasonByID("SPRING"), Season.getSeasonByID("FALL")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
