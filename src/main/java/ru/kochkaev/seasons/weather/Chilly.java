package ru.kochkaev.seasons.weather;

import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.WeatherObject;
import ru.kochkaev.seasons.service.Season;

import java.util.Collections;

public class Chilly extends WeatherObject {

    public Chilly() {
        super("CHILLY",
                Config.getLang().getString("lang.weather.chilly.name"),
                Config.getLang().getString("lang.weather.chilly.message"),
                false, false,
                Config.getConfig().getInt("conf.weather.chilly.chance"),
                Collections.singletonList(Season.getSeasonByID("SPRING")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
