package ru.kochkaev.seasons.season;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.SeasonObject;

public class Summer extends SeasonObject {

    public Summer() {
        super("SUMMER", Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.summer.name"), Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.summer.message"));
    }

    @Override
    public void onSeasonSet() {

    }
    @Override
    public void onSeasonRemove() {

    }
}
