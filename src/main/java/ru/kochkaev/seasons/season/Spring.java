package ru.kochkaev.seasons.season;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.SeasonObject;

public class Spring extends SeasonObject {

    public Spring() {
        super("SPRING", Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.spring.name"), Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.spring.message"));
    }

    @Override
    public void onSeasonSet() {

    }
    @Override
    public void onSeasonRemove() {

    }
}
