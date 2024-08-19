package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Collections;

public class Chilly extends WeatherObject {

    public Chilly() {
        super("CHILLY",
                () -> Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.chilly.name"),
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.chilly.chance"),
                Collections.singletonList(Season.getSeasonByID("SPRING")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.chilly.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
