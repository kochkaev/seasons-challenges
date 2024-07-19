package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;

import java.util.Collections;

public class Snowy extends WeatherObject {

    public Snowy() {
        super("SNOWY",
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.snowy.name"),
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.snowy.message"),
                true, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.snowy.chance"),
                Collections.singletonList(Season.getSeasonByID("WINTER")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
