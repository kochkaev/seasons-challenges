package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;

import java.util.Collections;

public class Hot extends WeatherObject {

    public Hot() {
        super("HOT",
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.hot.name"),
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.hot.message"),
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.hot.chance"),
                Collections.singletonList(Season.getSeasonByID("SUMMER")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
