package ru.kochkaev.seasons.season;

import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.SeasonObject;

public class Winter extends SeasonObject {

    public Winter() {
        super("WINTER", Config.getLang().getString("lang.season.winter.name"), Config.getLang().getString("lang.season.winter.message"));
    }

    @Override
    public void onSeasonSet() {

    }
    @Override
    public void onSeasonRemove() {

    }
}
