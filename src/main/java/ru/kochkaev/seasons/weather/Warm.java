package ru.kochkaev.seasons.weather;

import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.WeatherObject;
import ru.kochkaev.seasons.service.Season;

import java.util.Collections;

public class Warm extends WeatherObject {

    public Warm() {
        super("WARM",
                Config.getLang().getString("lang.weather.warm.name"),
                Config.getLang().getString("lang.weather.warm.message"),
                false, false,
                Config.getConfig().getInt("conf.weather.warm.chance"),
                Collections.singletonList(Season.getSeasonByID("SUMMER")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
