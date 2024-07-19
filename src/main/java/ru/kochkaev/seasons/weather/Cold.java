package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;

import java.util.Collections;

public class Cold extends WeatherObject {

    public Cold() {
        super("COLD",
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.cold.name"),
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.cold.message"),
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.cold.chance"),
                Collections.singletonList(Season.getSeasonByID("FALL")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
