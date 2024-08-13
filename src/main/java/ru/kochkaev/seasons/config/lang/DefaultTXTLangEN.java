package ru.kochkaev.seasons.config.lang;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.TXTConfigObject;

public class DefaultTXTLangEN extends TXTConfigObject {

    public DefaultTXTLangEN() {
        super("Seasons Challenges", "EN_us", "lang");
    }

    public void generate() {

        String copyright = Config.getCopyright() + "#\n# It's mod lang!\n#" +
                "\n# ** NAME = Display name of the Weather/Season\n# ** MESSAGE = Message, sends to chat on trigger\n#\n# Placeholders:\n#   - %season% - replaces to current season.\n" +
                "#   - %weather% - replaces to current weather.\n#   - & - replaces to \"§\" (colour codes).\n#\n# Other config files:\n#   - current.json - information about the current Weather/Season,\n#     is updated when the server is turned off.\n#   - lang - directory, contains translations of mod names/messages.\n\n\n";
        addString(copyright);

        /// SEASON
        addComment("* SEASON");
        // Winter
        addComment("Winter");
        addValueAndCommentDefault("lang.season.winter.name", "&bWinter");
        addValueAndCommentDefault("lang.season.winter.message", "&eA few snowflakes fall and the world grows cold, time for %season% to make its mark...");
        // Spring
        addComment("Spring");
        addValueAndCommentDefault("lang.season.spring.name", "&2Spring");
        addValueAndCommentDefault("lang.season.spring.message", "&eThe sun rises, the flowers smell fresh and there is a %season% in your step... literally!");
        // Summer
        addComment("Summer");
        addValueAndCommentDefault("lang.season.summer.name", "&aSummer");
        addValueAndCommentDefault("lang.season.summer.message", "&eToday feels warmer than the others, maybe even too warm... %season% has arrived!");
        // Fall
        addComment("Fall");
        addValueAndCommentDefault("lang.season.fall.name", "&6Fall");
        addValueAndCommentDefault("lang.season.fall.message", "&eA cool breeze whispers to the leaves that fall from the trees, it is %season%!");

        /// WEATHER
        addVoid();
        addComment("* WEATHER");
        // Night
        addComment("Night");
        addValueAndCommentDefault("lang.weather.night.name", "&7Calm");
        addValueAndCommentDefault("lang.weather.night.message", "&7The world rests with the sun and all is calm... Until the mobs come to eat you!");
        // Snowy
        addComment("Snowy");
        addValueAndCommentDefault("lang.weather.snowy.name", "&7Snowy");
        addValueAndCommentDefault("lang.weather.snowy.message", "&7A great white blanket covers the world, it is %weather%");
        // Freezing
        addComment("Freezing");
        addValueAndCommentDefault("lang.weather.freezing.name", "&9Freezing");
        addValueAndCommentDefault("lang.weather.freezing.message", "&3The water freezes with a sheet of ice and you feel a great cold, it is %weather%");
        // Stormy
        addComment("Stormy");
        addValueAndCommentDefault("lang.weather.stormy.name", "&cStormy");
        addValueAndCommentDefault("lang.weather.stormy.message", "&cA great %weather% &cbrews, the Gods are angry... Brace yourself!");
        // Cold
        addComment("Cold");
        addValueAndCommentDefault("lang.weather.cold.name", "&9Cold");
        addValueAndCommentDefault("lang.weather.cold.message", "&3&3The water is so very %weather% &3today");
        // Warm
        addComment("Warm");
        addValueAndCommentDefault("lang.weather.warm.name", "&eWarm");
        addValueAndCommentDefault("lang.weather.warm.message", "A soothing warmth hugs you as you move, it is a %weather% &eday");
        // Hot
        addComment("Hot");
        addValueAndCommentDefault("lang.weather.hot.name", "&eHot");
        addValueAndCommentDefault("lang.weather.hot.message", "&eIt is going to be very %weather% &etoday");
        // Scorching
        addComment("Scorching");
        addValueAndCommentDefault("lang.weather.scorching.name", "&eScorching");
        addValueAndCommentDefault("lang.weather.scorching.message", "&eThe sun burns your skin and the ground hurts to touch, it is %weather%");
        // Rainy
        addComment("Rainy");
        addValueAndCommentDefault("lang.weather.rainy.name", "&9Rainy");
        addValueAndCommentDefault("lang.weather.rainy.message", "&3A loud rain falls and wets the ground, it is %weather%");
        // Chilly
        addComment("Chilly");
        addValueAndCommentDefault("lang.weather.chilly.name", "&9Chilly");
        addValueAndCommentDefault("lang.weather.chilly.message", "&3You shiver as frost glistens around you, it is very %weather%");
        // Breezy
        addComment("Breezy");
        addValueAndCommentDefault("lang.weather.breezy.name", "&7Breezy");
        addValueAndCommentDefault("lang.weather.breezy.message", "&7A cool breeze touches your skin, it is going to be %weather%");
        // Beautiful
        addComment("Beautiful");
        addValueAndCommentDefault("lang.weather.beautiful.name", "&aBeautiful");
        addValueAndCommentDefault("lang.weather.beautiful.message", "&aThe sun is shining, the grass is green and the weather is %weather%");

        /// CHALLENGES
        addVoid();
        addComment("* CHALLENGES");
        // Feels good
        addComment("Feels good");
        addValueAndCommentDefault("lang.effect.feelsGood.message.trigger", "&aThe breeze feels so good on your skin, armour would just ruin the effect...");
        addValueAndCommentDefault("lang.effect.feelsGood.message.get", "&aThe sun on your skin without armour gives you energy, Feels Good!");
        addValueAndCommentDefault("lang.effect.feelsGood.message.remove", "&eAs you leave the world behind, the energising sunlight wears off...");
        // Fluffy Coat
        addComment("Fluffy Coat");
        addValueAndCommentDefault("lang.effect.fluffyCoat.message.trigger", "&aYour armour gives you a soothing warmth, making you resistant to the harsh cold!");
        addValueAndCommentDefault("lang.effect.fluffyCoat.message.get", "&aYour armour gives you a soothing warmth and makes you more Resistant to the world");
        addValueAndCommentDefault("lang.effect.fluffyCoat.message.remove", "&cWithout armour, your body feels the cold once again and is no longer resistant to it");
        // Primitive Heating
        addComment("Primitive Heating");
        addValueAndCommentDefault("lang.effect.primitiveHeating.message.trigger", "&9A source of heat would be great to carry around in this cold!");
        addValueAndCommentDefault("lang.effect.primitiveHeating.message.get", "&aA hot item in your inventory warms your heart and makes you Resistant to the cold world");
        addValueAndCommentDefault("lang.effect.primitiveHeating.message.remove", "&eYour body is no longer warmed and its Resistance wears away...");
        // Revitalized
        addComment("Revitalized");
        addValueAndCommentDefault("lang.effect.revitalized.message.trigger", "&aThis weather is so revitalizing!");
        addValueAndCommentDefault("lang.effect.revitalized.message.get", "&aThe sun from this world is so &eRevitalising&a, it is Regenerating you!");
        addValueAndCommentDefault("lang.effect.revitalized.message.remove", "&eAs the light of the world light leaves your skin, the &6Revitalising &eenergy leaves too...");
        // Warming Stew
        addComment("Warming Stew");
        addValueAndCommentDefault("lang.effect.warmingStew.message.trigger", "&7Your stomach starts to grumble and you begin to crave some hearty soup...");
        addValueAndCommentDefault("lang.effect.warmingStew.message.get", "&aThat hit the spot, the delicious stew makes your wounds a little more bearable...");
        // Wind In Your Boots
        addComment("Wind In Your Boots");
        addValueAndCommentDefault("lang.effect.windInYourBoots.message.trigger", "&7You feel the wind in your favour today!");
        addValueAndCommentDefault("lang.effect.windInYourBoots.message.get", "&aYou feel a rush of Wind in your Boots and go hurtling forwards!");
        // Devastation
        addComment("Devastation");
        addValueAndCommentDefault("lang.effect.devastation.message.trigger", "&cYour hearts beats rapidly, yours legs tremble and you find you cannot regenerate health until this Devastation passes!");
        // Frostbite
        addComment("Frostbite");
        addValueAndCommentDefault("lang.effect.frostbite.message.trigger", "&cThe world is freezing over and so will you if you fail to get armour on!");
        // Hold Onto Your Hat
        addComment("Hold Onto Your Hat");
        addValueAndCommentDefault("lang.effect.holdOntoYourHat.message.trigger", "&7Be careful with your hat, the wind is getting up...");
        addValueAndCommentDefault("lang.effect.holdOntoYourHat.message.get", "&eYour hat just blew off, oh dear!");
        // Hot Sand
        addComment("Hot Sand");
        addValueAndCommentDefault("lang.effect.hotSand.message.trigger", "&eWalking on sand in this heat must be painful!");
        addValueAndCommentDefault("lang.effect.hotSand.message.get", "&eAuch! Sand is too hot!");
        // Icy
        addComment("Icy");
        addValueAndCommentDefault("lang.effect.icy.message.trigger", "&9A chill runs down your spine as water turns to ice!");
        addValueAndCommentDefault("lang.effect.icy.message.get", "&cThe water freezes in your bucket...");
        // Soldering Iron
        addComment("Soldering Iron");
        addValueAndCommentDefault("lang.effect.solderingIron.message.trigger", "&eThe nearby iron starts to sizzle, better put it down for now...");
        addValueAndCommentDefault("lang.effect.solderingIron.message.get", "&cThe iron is soldering hot, try not to hold it for too long!");
        // Strong Current
        addComment("Strong Current");
        addValueAndCommentDefault("lang.effect.strongCurrent.message.trigger", "&9The water flows with a strong current, it will be hard to wade through!");
        addValueAndCommentDefault("lang.effect.strongCurrent.message.get", "&cThe current crashes against you and your muscles cry in pain...");
        addValueAndCommentDefault("lang.effect.strongCurrent.message.remove", "&aSeasickness passes, the waters no longer bother you...");
        // Sweating
        addComment("Sweating");
        addValueAndCommentDefault("lang.effect.sweating.message.trigger", "&eThis is most definitely NOT the weather for full armour...");
        addValueAndCommentDefault("lang.effect.sweating.message.get", "&cSweat drips from your forehead, it is too Hot for armour today...");
        addValueAndCommentDefault("lang.effect.sweating.message.remove", "&aThe air turns cooler and you wipe the sweat from your forehead...");
        // The Shivers
        addComment("The Shivers");
        addValueAndCommentDefault("lang.effect.theShivers.message.trigger", "&cThe water is near ice and dangerously cold to the touch...");
        addValueAndCommentDefault("lang.effect.theShivers.message.get", "&cThe freezing water is killing you, get out of it if you want to live!");
        // Wet Mud
        addComment("Wet Mud");
        addValueAndCommentDefault("lang.effect.wetMud.message.trigger", "&7The dirt coats your boots and becomes hard to move through in this weather...");
        addValueAndCommentDefault("lang.effect.wetMud.message.get", "&eThe mud sticks to your boots, slowing you down...");
    }
}
