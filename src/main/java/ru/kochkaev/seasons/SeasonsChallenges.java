package ru.kochkaev.seasons;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kochkaev.api.seasons.Register;
import ru.kochkaev.api.seasons.service.Config;
import ru.kochkaev.api.seasons.object.ConfigObject;

public class SeasonsChallenges implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Seasons Challenges");

	@Override
	public void onInitialize() {
		Config.regModConfig(new ConfigObject("Seasons Challenges", "en_US"));
		Register.registerAllInPackage("ru.kochkaev.seasons.config");
		Register.registerAllInPackage("ru.kochkaev.seasons.season");
		Register.registerAllInPackage("ru.kochkaev.seasons.weather");
		Register.registerAllInPackage("ru.kochkaev.seasons.challenge");
	}

	public static Logger getLogger() { return LOGGER; }
}