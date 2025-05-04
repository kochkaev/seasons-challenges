package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.provider.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Collections;

public class Stormy extends WeatherObject {

    public Stormy() {
        super(
                () -> Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.stormy.name"),
                "STORMY",
                true, true,
                Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.weather.stormy.chance"),
                Collections.singletonList(Season.getSeasonByID("FALL")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.stormy.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
