package ru.kochkaev.seasons;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kochkaev.api.seasons.Register;
import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.seasons.config.DefaultTXTConfig;
import ru.kochkaev.seasons.config.lang.DefaultTXTLangRU;

public class Main implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Seasons Challenges");

	@Override
	public void onInitialize() {
		Config.regModConfig(new Config("Seasons Challenges", "EN_us"));
		Register.registerAllInPackage("ru.kochkaev.seasons.config");
		Register.registerAllInPackage("ru.kochkaev.seasons.season");
		Register.registerAllInPackage("ru.kochkaev.seasons.weather");
		Register.registerAllInPackage("ru.kochkaev.seasons.challenge");
	}

	public static Logger getLogger() { return LOGGER; }
}