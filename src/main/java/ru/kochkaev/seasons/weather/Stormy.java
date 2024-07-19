package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;

import java.util.Collections;

public class Stormy extends WeatherObject {

    public Stormy() {
        super("STORMY",
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.stormy.name"),
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.stormy.message"),
                true, true,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.stormy.chance"),
                Collections.singletonList(Season.getSeasonByID("FALL")), false);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
