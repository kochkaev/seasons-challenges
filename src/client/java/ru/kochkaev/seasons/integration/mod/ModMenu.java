package ru.kochkaev.seasons.integration.mod;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.minecraft.client.gui.screen.Screen;
import ru.kochkaev.api.seasons.SeasonsAPI;
import ru.kochkaev.api.seasons.integration.mod.ClothConfig;
import ru.kochkaev.api.seasons.provider.Config;

public class ModMenu implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> {
            if (SeasonsAPI.getClothConfig()!=null) {
                return (Screen) ClothConfig.getClient().getConfigScreen(parent, Config.getModConfig("Seasons Challenges"));
                // Return the screen here with the one you created from Cloth Config Builder
            }
            return null;
        };
    }

}
