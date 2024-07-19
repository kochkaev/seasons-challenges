package ru.kochkaev.seasons.weather;

import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.WeatherObject;
import ru.kochkaev.seasons.service.Season;

import java.util.Collections;

public class Scorching extends WeatherObject {

    public Scorching() {
        super("SCORCHING",
                Config.getLang().getString("lang.weather.scorching.name"),
                Config.getLang().getString("lang.weather.scorching.message"),
                false, false,
                Config.getConfig().getInt("conf.weather.scorching.chance"),
                Collections.singletonList(Season.getSeasonByID("SUMMER")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
