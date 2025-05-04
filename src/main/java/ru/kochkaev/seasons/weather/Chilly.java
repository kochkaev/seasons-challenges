package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.provider.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Collections;

public class Chilly extends WeatherObject {

    public Chilly() {
        super(
                () -> Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.chilly.name"),
                "CHILLY",
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.weather.chilly.chance"),
                Collections.singletonList(Season.getSeasonByID("SPRING")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.chilly.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
