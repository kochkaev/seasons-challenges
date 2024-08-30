package ru.kochkaev.seasons.config;

import ru.kochkaev.api.seasons.service.Config;
import ru.kochkaev.api.seasons.object.TXTConfigObject;

public class DefaultTXTConfig extends TXTConfigObject{

    public DefaultTXTConfig() {
        super("Seasons Challenges", "config", "config");
    }

    public void generate() {

        String copyright = Config.getCopyright() + "#\n# It's mod config!\n#" +
                "\n# ** CHANCE =  chance of this weather coming on a new day (less than 100)\n#" +
                "\n# Other config files:\n#   - current.json - information about the current Weather/Season,\n#     is updated when the server is turned off.\n#   - lang - directory, contains translations of mod names/messages.\n\n\n";
        addString(copyright);

        /// Chances of weather
        addVoid();
        addHeader("WEATHER CHANCE");
        // Night
        addComment("Night");
        addTypedValueAndCommentDefault("conf.weather.night.chance", 1);
        // Snowy
        addComment("Snowy");
        addTypedValueAndCommentDefault("conf.weather.snowy.chance", 15);
        // Freezing
        addComment("Freezing");
        addTypedValueAndCommentDefault("conf.weather.freezing.chance", 15);
        // Stormy
        addComment("Stormy");
        addTypedValueAndCommentDefault("conf.weather.stormy.chance", 10);
        // Cold
        addComment("Cold");
        addTypedValueAndCommentDefault("conf.weather.cold.chance", 40);
        // Warm
        addComment("Warm");
        addTypedValueAndCommentDefault("conf.weather.warm.chance", 25);
        // Hot
        addComment("Hot");
        addTypedValueAndCommentDefault("conf.weather.hot.chance", 20);
        // Scorching
        addComment("Scorching");
        addTypedValueAndCommentDefault("conf.weather.scorching.chance", 10);
        // Rainy
        addComment("Rainy");
        addTypedValueAndCommentDefault("conf.weather.rainy.chance", 10);
        // Chilly
        addComment("Chilly");
        addTypedValueAndCommentDefault("conf.weather.chilly.chance", 15);
        // Breezy
        addComment("Breezy");
        addTypedValueAndCommentDefault("conf.weather.breezy.chance", 15);
        // Beautiful
        addComment("Beautiful");
        addTypedValueAndCommentDefault("conf.weather.beautiful.chance", 20);

    }
}
