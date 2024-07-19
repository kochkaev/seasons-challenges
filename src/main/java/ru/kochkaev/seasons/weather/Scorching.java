package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;

import java.util.Collections;

public class Scorching extends WeatherObject {

    public Scorching() {
        super("SCORCHING",
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.scorching.name"),
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.scorching.message"),
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.scorching.chance"),
                Collections.singletonList(Season.getSeasonByID("SUMMER")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
