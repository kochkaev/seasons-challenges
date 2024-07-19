package ru.kochkaev.seasons.season;

import ru.kochkaev.seasons.config.Config;
import ru.kochkaev.seasons.object.SeasonObject;

public class Fall extends SeasonObject {

    public Fall() {
        super("FALL", Config.getLang().getString("lang.season.fall.name"), Config.getLang().getString("lang.season.fall.message"));
    }

    @Override
    public void onSeasonSet() {

    }
    @Override
    public void onSeasonRemove() {

    }
}
