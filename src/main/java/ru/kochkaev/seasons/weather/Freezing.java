package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;

import java.util.Collections;

public class Freezing extends WeatherObject {

    public Freezing() {
        super("FREEZING",
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.freezing.name"),
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.freezing.message"),
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.freezing.chance"),
                Collections.singletonList(Season.getSeasonByID("WINTER")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
