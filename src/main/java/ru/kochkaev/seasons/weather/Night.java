package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.provider.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Arrays;

public class Night extends WeatherObject {

    public Night() {
        super(
                () -> Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.night.name"),
                "NIGHT",
                null, null,
                Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.weather.night.chance"),
                Arrays.asList(Season.getSeasonByID("WINTER"), Season.getSeasonByID("SPRING"), Season.getSeasonByID("SUMMER"), Season.getSeasonByID("FALL")), true);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.night.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
