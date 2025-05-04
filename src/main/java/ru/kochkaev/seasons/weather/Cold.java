package ru.kochkaev.seasons.weather;

import ru.kochkaev.api.seasons.provider.Config;
import ru.kochkaev.api.seasons.object.WeatherObject;
import ru.kochkaev.api.seasons.provider.Season;
import net.minecraft.server.MinecraftServer;

import java.util.Collections;

public class Cold extends WeatherObject {

    public Cold() {
        super(
                () -> Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.cold.name"),
                "COLD",
                false, false,
                Config.getModConfig("Seasons Challenges").getConfig("chances").getInt("conf.weather.cold.chance"),
                Collections.singletonList(Season.getSeasonByID("FALL")), false);
    }

    @Override
    public void onWeatherSet() {
        sendMessage(Config.getModConfig("Seasons Challenges").getLang().getText("lang.weather.cold.message"));
    }

    @Override
    public void onWeatherRemove() {

    }
}
