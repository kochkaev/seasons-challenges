package ru.kochkaev.seasons.weather;

import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.WeatherObject;
import ru.kochkaev.seasons.service.Season;

import java.util.Arrays;

public class Beautiful extends WeatherObject {

    public Beautiful() {
        super("BEAUTIFUL",
                Config.getLang().getString("lang.weather.beautiful.name"),
                Config.getLang().getString("lang.weather.beautiful.message"),
                false, false,
                Config.getConfig().getInt("conf.weather.beautiful.chance"),
                Arrays.asList(Season.getSeasonByID("SPRING"), Season.getSeasonByID("SUMMER")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
