package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.service.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Collections;

public class Snowy extends WeatherObject {

    public Snowy() {
        super("SNOWY",
                () -> Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.snowy.name"),
                true, false,
                Config.getModConfig("Seasons Challenges").getConfig().getInt("conf.weather.snowy.chance"),
                Collections.singletonList(Season.getSeasonByID("WINTER")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getString("lang.weather.snowy.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
