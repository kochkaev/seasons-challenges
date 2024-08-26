package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.service.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Arrays;

public class Breezy extends WeatherObject {

    public Breezy() {
        super("BREEZY",
                () -> Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.breezy.name"),
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.breezy.chance"),
                Arrays.asList(Season.getSeasonByID("SPRING"), Season.getSeasonByID("FALL")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.breezy.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
