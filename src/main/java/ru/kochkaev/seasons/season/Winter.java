package ru.kochkaev.seasons.season;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.SeasonObject;

public class Winter extends SeasonObject {

    public Winter() {
        super("WINTER", Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.winter.name"), Config.getModConfig("Seasons Challenges").getLang().getString("lang.season.winter.message"));
    }

    @Override
    public void onSeasonSet() {

    }
    @Override
    public void onSeasonRemove() {

    }
}
