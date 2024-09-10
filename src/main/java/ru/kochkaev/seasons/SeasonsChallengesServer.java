package ru.kochkaev.seasons;

import net.fabricmc.api.DedicatedServerModInitializer;
import ru.kochkaev.api.seasons.Register;
import ru.kochkaev.api.seasons.object.ConfigObject;
import ru.kochkaev.api.seasons.provider.Config;

public class SeasonsChallengesServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        Config.regModConfig(new ConfigObject("Seasons Challenges", "en_US"));
        Register.registerAllInPackage("ru.kochkaev.seasons.config");
        Register.register();
    }
}
