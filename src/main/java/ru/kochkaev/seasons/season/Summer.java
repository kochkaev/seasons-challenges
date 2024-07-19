package ru.kochkaev.seasons.season;

import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.SeasonObject;

public class Summer extends SeasonObject {

    public Summer() {
        super("SUMMER", Config.getLang().getString("lang.season.summer.name"), Config.getLang().getString("lang.season.summer.message"));
    }

    @Override
    public void onSeasonSet() {

    }
    @Override
    public void onSeasonRemove() {

    }
}
