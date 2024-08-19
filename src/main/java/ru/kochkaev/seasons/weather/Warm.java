package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Collections;

public class Warm extends WeatherObject {

    public Warm() {
        super("WARM",
                () -> Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.warm.name"),
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.warm.chance"),
                Collections.singletonList(Season.getSeasonByID("SUMMER")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.warm.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
