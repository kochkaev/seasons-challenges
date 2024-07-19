package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;

import java.util.Arrays;

public class Night extends WeatherObject {

    public Night() {
        super("NIGHT",
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.night.name"),
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.night.message"),
                null, null,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.night.chance"),
                Arrays.asList(Season.getSeasonByID("WINTER"), Season.getSeasonByID("SPRING"), Season.getSeasonByID("SUMMER"), Season.getSeasonByID("FALL")), true);
    }

    @Override
    public void onWeatherSet() {

    }

    @Override
    public void onWeatherRemove() {

    }
}
