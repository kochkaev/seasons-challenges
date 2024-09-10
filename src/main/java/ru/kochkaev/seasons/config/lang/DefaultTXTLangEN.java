package ru.kochkaev.seasons.config.lang;

import ru.kochkaev.api.seasons.object.ConfigContentObject;
import ru.kochkaev.api.seasons.object.ConfigFileObject;
import ru.kochkaev.api.seasons.provider.Config;

public class DefaultTXTLangEN extends ConfigFileObject {

    private static final String copyright = Config.getCopyright() + "\nIt's mod config!\n" +
            "\n** NAME = Display name of the Weather/Season\n** MESSAGE = Message, sends to chat on trigger\n\nOther config files:\n  - current.json - information about the current Weather/Season,\n    is updated when the server is turned off.\n  - lang - directory, contains translations of mod names/messages.\n" +
            "\nYou can use placeholders: \n  - & - insert color (replaces to paragraph symbol)\n  - %message% - will be replaced to message in specific context" +
            "\n  - %seasons:weather% - insert current weather name (from langs)\n  - %seasons:weather-previous% - insert previous weather name (from langs)\n  - %seasons:season% - insert current season name (from langs)" +
            "\n  - %seasons:lang% - insert current lang key\n  - %seasons:display-name% - insert Seasons mod display name (lang.message.seasonsModDisplayName in langs)" +
            "\n  - %seasons:title-new-day% - insert new day title message (from langs)\n  - %seasons:title-info% - insert new day info title message (from langs)" +
            "\n  - %seasons:actionbar% - insert actionbar title message format\n  - And others if you have installed PlaceholderAPI.";

    public DefaultTXTLangEN() {
        super("Seasons Challenges", "en_US", "lang", copyright);
    }

    public void generate(ConfigContentObject content) {
        // SEASON
        content.addHeader("SEASON")
                // Winter
                .addValue("lang.season.winter.name", "&bWinter", "Winter display name.")
                .addValue("lang.season.winter.message", "&eA few snowflakes fall and the world grows cold, time for %seasons:season% to make its mark...", "Winter onSet chat message.")
                // Spring
                .addValue("lang.season.spring.name", "&2Spring", "Spring display name.")
                .addValue("lang.season.spring.message", "&eThe sun rises, the flowers smell fresh and there is a %seasons:season% in your step... literally!", "Spring onSet chat message.")
                // Summer
                .addValue("lang.season.summer.name", "&aSummer", "Summer display name.")
                .addValue("lang.season.summer.message", "&eToday feels warmer than the others, maybe even too warm... %seasons:season% has arrived!", "Summer onSet chat message.")
                // Fall
                .addValue("lang.season.fall.name", "&6Fall", "Fall display name.")
                .addValue("lang.season.fall.message", "&eA cool breeze whispers to the leaves that fall from the trees, it is %seasons:season%!", "Fall onSet chat message.");

        // WEATHER
        content.addHeader("WEATHER")
                // Night
                .addValue("lang.weather.night.name", "&7Calm", "Night display name.")
                .addValue("lang.weather.night.message", "&7The world rests with the sun and all is calm... Until the mobs come to eat you!", "Night onSet chat message.")
                // Snowy
                .addValue("lang.weather.snowy.name", "&7Snowy", "Snowy display name.")
                .addValue("lang.weather.snowy.message", "&7A great white blanket covers the world, it is %seasons:weather%", "Snowy onSet chat message.")
                // Freezing
                .addValue("lang.weather.freezing.name", "&9Freezing", "Freezing display name.")
                .addValue("lang.weather.freezing.message", "&3The water freezes with a sheet of ice and you feel a great cold, it is %seasons:weather%", "Freezing onSet chat message.")
                // Stormy
                .addValue("lang.weather.stormy.name", "&cStormy", "Stormy display name.")
                .addValue("lang.weather.stormy.message", "&cA great %seasons:weather% &cbrews, the Gods are angry... Brace yourself!", "Stormy onSet chat message.")
                // Cold
                .addValue("lang.weather.cold.name", "&9Cold", "Cold display name.")
                .addValue("lang.weather.cold.message", "&3&3The water is so very %seasons:weather% &3today", "Cold onSet chat message.")
                // Warm
                .addValue("lang.weather.warm.name", "&eWarm", "Warm display name.")
                .addValue("lang.weather.warm.message", "A soothing warmth hugs you as you move, it is a %seasons:weather% &eday", "Warm onSet chat message.")
                // Hot
                .addValue("lang.weather.hot.name", "&eHot", "Hot display name.")
                .addValue("lang.weather.hot.message", "&eIt is going to be very %seasons:weather% &etoday", "Hot onSet chat message.")
                // Scorching
                .addValue("lang.weather.scorching.name", "&eScorching", "Scorching display name.")
                .addValue("lang.weather.scorching.message", "&eThe sun burns your skin and the ground hurts to touch, it is %seasons:weather%", "Scorching onSet chat message.")
                // Rainy
                .addValue("lang.weather.rainy.name", "&9Rainy", "Rainy display name.")
                .addValue("lang.weather.rainy.message", "&3A loud rain falls and wets the ground, it is %seasons:weather%", "Rainy onSet chat message.")
                // Chilly
                .addValue("lang.weather.chilly.name", "&9Chilly", "Chilly display name.")
                .addValue("lang.weather.chilly.message", "&3You shiver as frost glistens around you, it is very %seasons:weather%", "Chilly onSet chat message.")
                // Breezy
                .addValue("lang.weather.breezy.name", "&7Breezy", "Breezy display name.")
                .addValue("lang.weather.breezy.message", "&7A cool breeze touches your skin, it is going to be %seasons:weather%", "Breezy onSet chat message.")
                // Beautiful
                .addValue("lang.weather.beautiful.name", "&aBeautiful", "Beautiful display name.")
                .addValue("lang.weather.beautiful.message", "&aThe sun is shining, the grass is green and the weather is %seasons:weather%", "Beautiful onSet chat message.");

        // CHALLENGES
        content.addHeader("CHALLENGES")
                // Feels good
                .addValue("lang.challenge.feelsGood.message.trigger", "&aThe breeze feels so good on your skin, armour would just ruin the effect...", "Feels Good trigger message.")
                .addValue("lang.challenge.feelsGood.message.get", "&aThe sun on your skin without armour gives you energy, Feels Good!", "Feels Good onGet (apply) message.")
                .addValue("lang.challenge.feelsGood.message.remove", "&eAs you leave the world behind, the energising sunlight wears off...", "Feels Good remove message.")
                // Fluffy Coat
                .addValue("lang.challenge.fluffyCoat.message.trigger", "&aYour armour gives you a soothing warmth, making you resistant to the harsh cold!", "Fluffy Coat trigger message.")
                .addValue("lang.challenge.fluffyCoat.message.get", "&aYour armour gives you a soothing warmth and makes you more Resistant to the world", "Fluffy Coat onGet (apply) message.")
                .addValue("lang.challenge.fluffyCoat.message.remove", "&cWithout armour, your body feels the cold once again and is no longer resistant to it", "Fluffy Coat remove message.")
                // Primitive Heating
                .addValue("lang.challenge.primitiveHeating.message.trigger", "&9A source of heat would be great to carry around in this cold!", "Primitive Heating trigger message.")
                .addValue("lang.challenge.primitiveHeating.message.get", "&aA hot item in your inventory warms your heart and makes you Resistant to the cold world", "Primitive Heating onGet (apply) message.")
                .addValue("lang.challenge.primitiveHeating.message.remove", "&eYour body is no longer warmed and its Resistance wears away...", "Primitive Heating remove message.")
                // Revitalized
                .addValue("lang.challenge.revitalized.message.trigger", "&aThis weather is so revitalizing!", "Revitalized trigger message.")
                .addValue("lang.challenge.revitalized.message.get", "&aThe sun from this world is so &eRevitalising&a, it is Regenerating you!", "Revitalized onGet (apply) message.")
                .addValue("lang.challenge.revitalized.message.remove", "&eAs the light of the world light leaves your skin, the &6Revitalising &eenergy leaves too...", "Revitalized remove message.")
                // Warming Stew
                .addValue("lang.challenge.warmingStew.message.trigger", "&7Your stomach starts to grumble and you begin to crave some hearty soup...", "Warming Stew trigger message.")
                .addValue("lang.challenge.warmingStew.message.get", "&aThat hit the spot, the delicious stew makes your wounds a little more bearable...", "Warming Stew onGet (apply) message.")
                // Wind In Your Boots
                .addValue("lang.challenge.windInYourBoots.message.trigger", "&7You feel the wind in your favour today!", "Wind In Your Boots trigger message.")
                .addValue("lang.challenge.windInYourBoots.message.get", "&aYou feel a rush of Wind in your Boots and go hurtling forwards!", "Wind In Your Boots onGet (apply) message.")
                // Devastation
                .addValue("lang.challenge.devastation.message.trigger", "&cYour hearts beats rapidly, yours legs tremble and you find you cannot regenerate health until this Devastation passes!", "Devastation trigger message.")
                // Frostbite
                .addValue("lang.challenge.frostbite.message.trigger", "&cThe world is freezing over and so will you if you fail to get armour on!", "Frostbite trigger message.")
                // Hold Onto Your Hat
                .addValue("lang.challenge.holdOntoYourHat.message.trigger", "&7Be careful with your hat, the wind is getting up...", "Hold Onto Your Hat trigger message.")
                .addValue("lang.challenge.holdOntoYourHat.message.get", "&eYour hat just blew off, oh dear!", "Hold Onto Your Hat onGet (apply) message.")
                // Hot Sand
                .addValue("lang.challenge.hotSand.message.trigger", "&eWalking on sand in this heat must be painful!", "Hot Sand trigger message.")
                .addValue("lang.challenge.hotSand.message.get", "&eAuch! Sand is too hot!", "Hot Sand onGet (apply) message.")
                // Icy
                .addValue("lang.challenge.icy.message.trigger", "&9A chill runs down your spine as water turns to ice!", "Icy trigger message.")
                .addValue("lang.challenge.icy.message.get", "&cThe water freezes in your bucket...", "Icy onGet (apply) message.")
                // Soldering Iron
                .addValue("lang.challenge.solderingIron.message.trigger", "&eThe nearby iron starts to sizzle, better put it down for now...", "Soldering Iron trigger message.")
                .addValue("lang.challenge.solderingIron.message.get", "&cThe iron is soldering hot, try not to hold it for too long!", "Soldering Iron onGet (apply) message.")
                // Strong Current
                .addValue("lang.challenge.strongCurrent.message.trigger", "&9The water flows with a strong current, it will be hard to wade through!", "Strong Current trigger message.")
                .addValue("lang.challenge.strongCurrent.message.get", "&cThe current crashes against you and your muscles cry in pain...", "Strong Current onGet (apply) message.")
                .addValue("lang.challenge.strongCurrent.message.remove", "&aSeasickness passes, the waters no longer bother you...", "Strong Current remove message.")
                // Sweating
                .addValue("lang.challenge.sweating.message.trigger", "&eThis is most definitely NOT the weather for full armour...", "Sweating trigger message.")
                .addValue("lang.challenge.sweating.message.get", "&cSweat drips from your forehead, it is too Hot for armour today...", "Sweating onGet (apply) message.")
                .addValue("lang.challenge.sweating.message.remove", "&aThe air turns cooler and you wipe the sweat from your forehead...", "Sweating remove message.")
                // The Shivers
                .addValue("lang.challenge.theShivers.message.trigger", "&cThe water is near ice and dangerously cold to the touch...", "The Shivers trigger message.")
                .addValue("lang.challenge.theShivers.message.get", "&cThe freezing water is killing you, get out of it if you want to live!", "The Shivers onGet (apply) message.")
                // Wet Mud
                .addValue("lang.challenge.wetMud.message.trigger", "&7The dirt coats your boots and becomes hard to move through in this weather...", "Wet Mud trigger message.")
                .addValue("lang.challenge.wetMud.message.get", "&eThe mud sticks to your boots, slowing you down...", "Wet Mud onGet (apply) message.");
    }
}
