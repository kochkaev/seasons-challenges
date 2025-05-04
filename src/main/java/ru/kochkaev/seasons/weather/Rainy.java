package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.provider.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Arrays;

public class Rainy extends WeatherObject {

    public Rainy() {
        super(
                () -> Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.rainy.name"),
                "RAINY",
                true, false,
                Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.weather.rainy.chance"),
                Arrays.asList(Season.getSeasonByID("SPRING"), Season.getSeasonByID("FALL")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.rainy.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
