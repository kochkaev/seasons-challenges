package ru.kochkaev.seasons;

import net.fabricmc.api.ClientModInitializer;
import ru.kochkaev.api.seasons.Register;
import ru.kochkaev.api.seasons.object.ConfigObject;
import ru.kochkaev.api.seasons.provider.Config;

public class SeasonsChallengesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Config.regModConfig(new ConfigObject("Seasons Challenges", "en_US"));
        Register.registerAllInPackage("ru.kochkaev.seasons.config");
        Register.register();
    }
}
