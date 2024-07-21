package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Collections;

public class Freezing extends WeatherObject {

    public Freezing() {
        super("FREEZING",
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.freezing.name"),
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.freezing.chance"),
                Collections.singletonList(Season.getSeasonByID("WINTER")), false);
    }

    @Override
    public void onWeatherSet(MinecraftServer server) {
        sendMessage(server, Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.freezing.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
