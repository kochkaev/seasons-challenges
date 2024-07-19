package ru.kochkaev.seasons.weather;

import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.WeatherObject;
import ru.kochkaev.seasons.service.Season;

import java.util.Collections;

public class Stormy extends WeatherObject {

    public Stormy() {
        super("STORMY",
                Config.getLang().getString("lang.weather.stormy.name"),
                Config.getLang().getString("lang.weather.stormy.message"),
                true, true,
                Config.getConfig().getInt("conf.weather.stormy.chance"),
                Collections.singletonList(Season.getSeasonByID("FALL")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
