package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.provider.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Collections;

public class Hot extends WeatherObject {

    public Hot() {
        super("HOT",
                () -> Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.hot.name"),
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.weather.hot.chance"),
                Collections.singletonList(Season.getSeasonByID("SUMMER")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.hot.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
