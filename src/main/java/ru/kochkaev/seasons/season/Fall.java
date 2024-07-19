package ru.kochkaev.seasons.season;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.SeasonObject;

public class Fall extends SeasonObject {

    public Fall() {
        super("FALL", Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.fall.name"), Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.fall.message"));
    }

    @Override
    public void onSeasonSet() {

    }
    @Override
    public void onSeasonRemove() {

    }
}
