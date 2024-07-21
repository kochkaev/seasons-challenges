package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Collections;

public class Cold extends WeatherObject {

    public Cold() {
        super("COLD",
                Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.cold.name"),
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.cold.chance"),
                Collections.singletonList(Season.getSeasonByID("FALL")), false);
    }

    @Override
    public void onWeatherSet(MinecraftServer server) {
        sendMessage(server, Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.cold.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
