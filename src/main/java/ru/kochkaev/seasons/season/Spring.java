package ru.kochkaev.seasons.season;

import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.SeasonObject;

public class Spring extends SeasonObject {

    public Spring() {
        super("SPRING", Config.getLang().getString("lang.season.spring.name"), Config.getLang().getString("lang.season.spring.message"));
    }

    @Override
    public void onSeasonSet() {

    }
    @Override
    public void onSeasonRemove() {

    }
}
