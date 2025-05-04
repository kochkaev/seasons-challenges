package ru.kochkaev.seasons.config.lang;

import ru.kochkaev.api.seasons.object.ConfigContentObject;
import ru.kochkaev.api.seasons.object.ConfigFileObject;
import ru.kochkaev.api.seasons.provider.Config;

public class DefaultTXTLangEN extends ConfigFileObject {

    private static final String copyright = Config.getCopyright() + "\nIt's mod lang!\n" +
            "\n** NAME = Display name of the Weather/Season\n** MESSAGE = Message, sends to chat on trigger\n\nOther config files:\n  - current.json - information about the current Weather/Season,\n    is updated when the server is turned off.\n  - lang - directory, contains translations of mod names/messages.\n" +
            "\nYou can use placeholders:\n  - %message% - will be replaced to message in specific context" +
            "\n  - %seasons:weather% - insert current weather name (from langs)\n  - %seasons:weather-previous% - insert previous weather name (from langs)\n  - %seasons:season% - insert current season name (from langs)" +
            "\n  - %seasons:lang% - insert current lang key\n  - %seasons:display-name% - insert Seasons mod display name (lang.message.seasonsModDisplayName in langs)" +
            "\n  - %seasons:title-new-day% - insert new day title message (from langs)\n  - %seasons:title-info% - insert new day info title message (from langs)" +
            "\n  - %seasons:actionbar% - insert actionbar title message format\n  - And others if you have installed PlaceholderAPI." +
            "\nYou can format your messages using MiniMessage! Details: https://docs.advntr.dev/minimessage/format.html";

    public DefaultTXTLangEN() {
        super("Seasons Challenges", "en_US", "lang", copyright, 2);
    }

    public void generate(ConfigContentObject content) {
        // SEASON
        content.addHeader("SEASON")
                // Winter
                .addTextValue("lang.season.winter.name", "<aqua>Winter", "Winter display name.")
                .addTextValue("lang.season.winter.message", "<yellow>A few snowflakes fall and the world grows cold, time for %seasons:season% to make its mark...", "Winter onSet chat message.")
                // Spring
                .addTextValue("lang.season.spring.name", "<dark_green>Spring", "Spring display name.")
                .addTextValue("lang.season.spring.message", "<yellow>The sun rises, the flowers smell fresh and there is a %seasons:season% in your step... literally!", "Spring onSet chat message.")
                // Summer
                .addTextValue("lang.season.summer.name", "<green>Summer", "Summer display name.")
                .addTextValue("lang.season.summer.message", "<yellow>Today feels warmer than the others, maybe even too warm... %seasons:season% has arrived!", "Summer onSet chat message.")
                // Fall
                .addTextValue("lang.season.fall.name", "<gold>Fall", "Fall display name.")
                .addTextValue("lang.season.fall.message", "<yellow>A cool breeze whispers to the leaves that fall from the trees, it is %seasons:season%!", "Fall onSet chat message.");

        // WEATHER
        content.addHeader("WEATHER")
                // Night
                .addTextValue("lang.weather.night.name", "<gray>Calm", "Night display name.")
                .addTextValue("lang.weather.night.message", "<gray>The world rests with the sun and all is calm... Until the mobs come to eat you!", "Night onSet chat message.")
                // Snowy
                .addTextValue("lang.weather.snowy.name", "<gray>Snowy", "Snowy display name.")
                .addTextValue("lang.weather.snowy.message", "<gray>A great white blanket covers the world, it is %seasons:weather%", "Snowy onSet chat message.")
                // Freezing
                .addTextValue("lang.weather.freezing.name", "<blue>Freezing", "Freezing display name.")
                .addTextValue("lang.weather.freezing.message", "<dark_aqua>The water freezes with a sheet of ice and you feel a great cold, it is %seasons:weather%", "Freezing onSet chat message.")
                // Stormy
                .addTextValue("lang.weather.stormy.name", "<red>Stormy", "Stormy display name.")
                .addTextValue("lang.weather.stormy.message", "<red>A great %seasons:weather% <red>brews, the Gods are angry... Brace yourself!", "Stormy onSet chat message.")
                // Cold
                .addTextValue("lang.weather.cold.name", "<blue>Cold", "Cold display name.")
                .addTextValue("lang.weather.cold.message", "<dark_aqua><dark_aqua>The water is so very %seasons:weather% <dark_aqua>today", "Cold onSet chat message.")
                // Warm
                .addTextValue("lang.weather.warm.name", "<yellow>Warm", "Warm display name.")
                .addTextValue("lang.weather.warm.message", "A soothing warmth hugs you as you move, it is a %seasons:weather% <yellow>day", "Warm onSet chat message.")
                // Hot
                .addTextValue("lang.weather.hot.name", "<yellow>Hot", "Hot display name.")
                .addTextValue("lang.weather.hot.message", "<yellow>It is going to be very %seasons:weather% <yellow>today", "Hot onSet chat message.")
                // Scorching
                .addTextValue("lang.weather.scorching.name", "<yellow>Scorching", "Scorching display name.")
                .addTextValue("lang.weather.scorching.message", "<yellow>The sun burns your skin and the ground hurts to touch, it is %seasons:weather%", "Scorching onSet chat message.")
                // Rainy
                .addTextValue("lang.weather.rainy.name", "<blue>Rainy", "Rainy display name.")
                .addTextValue("lang.weather.rainy.message", "<dark_aqua>A loud rain falls and wets the ground, it is %seasons:weather%", "Rainy onSet chat message.")
                // Chilly
                .addTextValue("lang.weather.chilly.name", "<blue>Chilly", "Chilly display name.")
                .addTextValue("lang.weather.chilly.message", "<dark_aqua>You shiver as frost glistens around you, it is very %seasons:weather%", "Chilly onSet chat message.")
                // Breezy
                .addTextValue("lang.weather.breezy.name", "<gray>Breezy", "Breezy display name.")
                .addTextValue("lang.weather.breezy.message", "<gray>A cool breeze touches your skin, it is going to be %seasons:weather%", "Breezy onSet chat message.")
                // Beautiful
                .addTextValue("lang.weather.beautiful.name", "<green>Beautiful", "Beautiful display name.")
                .addTextValue("lang.weather.beautiful.message", "<green>The sun is shining, the grass is green and the weather is %seasons:weather%", "Beautiful onSet chat message.");

        // CHALLENGES
        content.addHeader("CHALLENGES")
                // Feels good
                .addTextValue("lang.challenge.feelsGood.message.trigger", "<green>The breeze feels so good on your skin, armour would just ruin the effect...", "Feels Good trigger message.")
                .addTextValue("lang.challenge.feelsGood.message.get", "<green>The sun on your skin without armour gives you energy, Feels Good!", "Feels Good onGet (apply) message.")
                .addTextValue("lang.challenge.feelsGood.message.remove", "<yellow>As you leave the world behind, the energising sunlight wears off...", "Feels Good remove message.")
                // Fluffy Coat
                .addTextValue("lang.challenge.fluffyCoat.message.trigger", "<green>Your armour gives you a soothing warmth, making you resistant to the harsh cold!", "Fluffy Coat trigger message.")
                .addTextValue("lang.challenge.fluffyCoat.message.get", "<green>Your armour gives you a soothing warmth and makes you more Resistant to the world", "Fluffy Coat onGet (apply) message.")
                .addTextValue("lang.challenge.fluffyCoat.message.remove", "<red>Without armour, your body feels the cold once again and is no longer resistant to it", "Fluffy Coat remove message.")
                // Primitive Heating
                .addTextValue("lang.challenge.primitiveHeating.message.trigger", "<blue>A source of heat would be great to carry around in this cold!", "Primitive Heating trigger message.")
                .addTextValue("lang.challenge.primitiveHeating.message.get", "<green>A hot item in your inventory warms your heart and makes you Resistant to the cold world", "Primitive Heating onGet (apply) message.")
                .addTextValue("lang.challenge.primitiveHeating.message.remove", "<yellow>Your body is no longer warmed and its Resistance wears away...", "Primitive Heating remove message.")
                // Revitalized
                .addTextValue("lang.challenge.revitalized.message.trigger", "<green>This weather is so revitalizing!", "Revitalized trigger message.")
                .addTextValue("lang.challenge.revitalized.message.get", "<green>The sun from this world is so <yellow>Revitalising<green>, it is Regenerating you!", "Revitalized onGet (apply) message.")
                .addTextValue("lang.challenge.revitalized.message.remove", "<yellow>As the light of the world light leaves your skin, the <gold>Revitalising <yellow>energy leaves too...", "Revitalized remove message.")
                // Warming Stew
                .addTextValue("lang.challenge.warmingStew.message.trigger", "<gray>Your stomach starts to grumble and you begin to crave some hearty soup...", "Warming Stew trigger message.")
                .addTextValue("lang.challenge.warmingStew.message.get", "<green>That hit the spot, the delicious stew makes your wounds a little more bearable...", "Warming Stew onGet (apply) message.")
                // Wind In Your Boots
                .addTextValue("lang.challenge.windInYourBoots.message.trigger", "<gray>You feel the wind in your favour today!", "Wind In Your Boots trigger message.")
                .addTextValue("lang.challenge.windInYourBoots.message.get", "<green>You feel a rush of Wind in your Boots and go hurtling forwards!", "Wind In Your Boots onGet (apply) message.")
                // Devastation
                .addTextValue("lang.challenge.devastation.message.trigger", "<red>Your hearts beats rapidly, yours legs tremble and you find you cannot regenerate health until this Devastation passes!", "Devastation trigger message.")
                // Frostbite
                .addTextValue("lang.challenge.frostbite.message.trigger", "<red>The world is freezing over and so will you if you fail to get armour on!", "Frostbite trigger message.")
                // Hold Onto Your Hat
                .addTextValue("lang.challenge.holdOntoYourHat.message.trigger", "<gray>Be careful with your hat, the wind is getting up...", "Hold Onto Your Hat trigger message.")
                .addTextValue("lang.challenge.holdOntoYourHat.message.get", "<yellow>Your hat just blew off, oh dear!", "Hold Onto Your Hat onGet (apply) message.")
                // Hot Sand
                .addTextValue("lang.challenge.hotSand.message.trigger", "<yellow>Walking on sand in this heat must be painful!", "Hot Sand trigger message.")
                .addTextValue("lang.challenge.hotSand.message.get", "<yellow>Auch! Sand is too hot!", "Hot Sand onGet (apply) message.")
                // Icy
                .addTextValue("lang.challenge.icy.message.trigger", "<blue>A chill runs down your spine as water turns to ice!", "Icy trigger message.")
                .addTextValue("lang.challenge.icy.message.get", "<red>The water freezes in your bucket...", "Icy onGet (apply) message.")
                // Soldering Iron
                .addTextValue("lang.challenge.solderingIron.message.trigger", "<yellow>The nearby iron starts to sizzle, better put it down for now...", "Soldering Iron trigger message.")
                .addTextValue("lang.challenge.solderingIron.message.get", "<red>The iron is soldering hot, try not to hold it for too long!", "Soldering Iron onGet (apply) message.")
                // Strong Current
                .addTextValue("lang.challenge.strongCurrent.message.trigger", "<blue>The water flows with a strong current, it will be hard to wade through!", "Strong Current trigger message.")
                .addTextValue("lang.challenge.strongCurrent.message.get", "<red>The current crashes against you and your muscles cry in pain...", "Strong Current onGet (apply) message.")
                .addTextValue("lang.challenge.strongCurrent.message.remove", "<green>Seasickness passes, the waters no longer bother you...", "Strong Current remove message.")
                // Sweating
                .addTextValue("lang.challenge.sweating.message.trigger", "<yellow>This is most definitely NOT the weather for full armour...", "Sweating trigger message.")
                .addTextValue("lang.challenge.sweating.message.get", "<red>Sweat drips from your forehead, it is too Hot for armour today...", "Sweating onGet (apply) message.")
                .addTextValue("lang.challenge.sweating.message.remove", "<green>The air turns cooler and you wipe the sweat from your forehead...", "Sweating remove message.")
                // The Shivers
                .addTextValue("lang.challenge.theShivers.message.trigger", "<red>The water is near ice and dangerously cold to the touch...", "The Shivers trigger message.")
                .addTextValue("lang.challenge.theShivers.message.get", "<red>The freezing water is killing you, get out of it if you want to live!", "The Shivers onGet (apply) message.")
                // Wet Mud
                .addTextValue("lang.challenge.wetMud.message.trigger", "<gray>The dirt coats your boots and becomes hard to move through in this weather...", "Wet Mud trigger message.")
                .addTextValue("lang.challenge.wetMud.message.get", "<yellow>The mud sticks to your boots, slowing you down...", "Wet Mud onGet (apply) message.");
    }

    @Override
    public Boolean update(ConfigContentObject content, Integer targetVersion, Integer currentVersion) {
        return ru.kochkaev.api.seasons.config.DefaultTXTConfig.configUpdate(content, targetVersion, currentVersion);
    }
}
