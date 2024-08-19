package ru.kochkaev.seasons.weather;

import net.minecraft.server.MinecraftServer;
import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;

import java.util.Arrays;

public class Beautiful extends WeatherObject {

    public Beautiful() {
        super("BEAUTIFUL",
                () -> Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.beautiful.name"),
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.beautiful.chance"),
                Arrays.asList(Season.getSeasonByID("SPRING"), Season.getSeasonByID("SUMMER")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.beautiful.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
