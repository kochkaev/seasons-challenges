package ru.kochkaev.seasons.weather;

import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.WeatherObject;
import ru.kochkaev.seasons.service.Season;

import java.util.Collections;

public class Snowy extends WeatherObject {

    public Snowy() {
        super("SNOWY",
                Config.getLang().getString("lang.weather.snowy.name"),
                Config.getLang().getString("lang.weather.snowy.message"),
                true, false,
                Config.getConfig().getInt("conf.weather.snowy.chance"),
                Collections.singletonList(Season.getSeasonByID("WINTER")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
