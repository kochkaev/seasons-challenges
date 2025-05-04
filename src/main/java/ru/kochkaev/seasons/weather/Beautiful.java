package ru.kochkaev.seasons.weather;

import net.minecraft.server.MinecraftServer;
import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.provider.Season;

import java.util.Arrays;

public class Beautiful extends WeatherObject {

    public Beautiful() {
        super(
                () -> Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.beautiful.name"),
                "BEAUTIFUL",
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.weather.beautiful.chance"),
                Arrays.asList(Season.getSeasonByID("SPRING"), Season.getSeasonByID("SUMMER")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.beautiful.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
