package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.provider.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Collections;

public class Snowy extends WeatherObject {

    public Snowy() {
        super(
                () -> Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.snowy.name"),
                "SNOWY",
                true, false,
                Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.weather.snowy.chance"),
                Collections.singletonList(Season.getSeasonByID("WINTER")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.snowy.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
