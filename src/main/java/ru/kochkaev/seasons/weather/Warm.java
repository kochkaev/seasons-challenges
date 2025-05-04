package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.provider.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Collections;

public class Warm extends WeatherObject {

    public Warm() {
        super(
                () -> Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.warm.name"),
                "WARM",
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.weather.warm.chance"),
                Collections.singletonList(Season.getSeasonByID("SUMMER")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.warm.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
