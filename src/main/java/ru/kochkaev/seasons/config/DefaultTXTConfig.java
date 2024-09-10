package ru.kochkaev.seasons.config;

import ru.kochkaev.api.seasons.object.ConfigContentObject;
import ru.kochkaev.api.seasons.object.ConfigFileObject;
import ru.kochkaev.api.seasons.provider.Config;

public class DefaultTXTConfig extends ConfigFileObject {

    private static final String copyright = Config.getCopyright() + "\nIt's mod config!\n" +
            "\n** CHANCE =  chance of this weather coming on a new day (less than 100)\n" +
            "\nOther config files:\n  - current.json - information about the current Weather/Season,\n    is updated when the server is turned off.\n  - lang - directory, contains translations of mod names/messages.";

    public DefaultTXTConfig() {
        super("Seasons Challenges", "chances", "config", copyright);
    }

    public void generate(ConfigContentObject content) {
        // Chances of weather
        content.addHeader("SEASON CHANCE")
                // Winter
                .addValue("conf.season.winter.chance", 20, "Winter")
                // Spring
                .addValue("conf.season.spring.chance", 20, "Spring")
                // Summer
                .addValue("conf.season.summer.chance", 20, "Summer")
                // Fall
                .addValue("conf.season.fall.chance", 20, "Fall");

        // Chances of weather
        content.addHeader("WEATHER CHANCE")
                // Night
                .addValue("conf.weather.night.chance", 1, "Night")
                // Snowy
                .addValue("conf.weather.snowy.chance", 15, "Snowy")
                // Freezing
                .addValue("conf.weather.freezing.chance", 15, "Freezing")
                // Stormy
                .addValue("conf.weather.stormy.chance", 10, "Stormy")
                // Cold
                .addValue("conf.weather.cold.chance", 40, "Cold")
                // Warm
                .addValue("conf.weather.warm.chance", 25, "Warm")
                // Hot
                .addValue("conf.weather.hot.chance", 20, "Hot")
                // Scorching
                .addValue("conf.weather.scorching.chance", 10, "Scorching")
                // Rainy
                .addValue("conf.weather.rainy.chance", 10, "Rainy")
                // Chilly
                .addValue("conf.weather.chilly.chance", 15, "Chilly")
                // Breezy
                .addValue("conf.weather.breezy.chance", 15, "Breezy")
                // Beautiful
                .addValue("conf.weather.beautiful.chance", 20, "Beautiful");

    }
}
