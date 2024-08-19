package ru.kochkaev.seasons.config.lang;

import ru.kochkaev.api.seasons.config.Config;
import ru.kochkaev.api.seasons.object.TXTConfigObject;

public class DefaultTXTLangRU extends TXTConfigObject {
    
    public DefaultTXTLangRU() {
        super("Seasons Challenges", "RU_ru", "lang");
    }

    public void generate() {

        String copyright = Config.getCopyright() + "#\n# It's mod lang!\n#" +
                "\n# ** NAME = Display name of the Weather/Season\n# ** MESSAGE = Message, sends to chat on trigger\n#\n# Other config files:\n#   - current.json - information about the current Weather/Season,\n#     is updated when the server is turned off.\n#   - lang - directory, contains translations of mod names/messages.\n#" +
                "\n# You can use placeholders: \n#   - & - insert color (replaces to paragraph symbol)\n#   - %message% - will be replaced to message in specific context" +
                "\n#   - %seasons:weather% - insert current weather name (from langs)\n#   - %seasons:weather-previous% - insert previous weather name (from langs)\n#   - %seasons:season% - insert current season name (from langs)" +
                "\n#   - %seasons:lang% - insert current lang key\n#   - %seasons:display-name% - insert Seasons mod display name (lang.message.seasonsModDisplayName in langs)" +
                "\n#   - %seasons:title-new-day% - insert new day title message (from langs)\n#   - %seasons:title-info% - insert new day info title message (from langs)" +
                "\n#   - %seasons:actionbar% - insert actionbar title message format\n#   - And others if you have installed PlaceholderAPI\n\n\n";
        addString(copyright);

        /// SEASON
        addComment("* SEASON");
        // Winter
        addComment("Winter");
        addValueAndCommentDefault("lang.season.winter.name", "&bЗима");
        addValueAndCommentDefault("lang.season.winter.message", "&eДа свершится новогоднее чудо! Наступила %seasons:season%");
        // Spring
        addComment("Spring");
        addValueAndCommentDefault("lang.season.spring.name", "&2Весна");
        addValueAndCommentDefault("lang.season.spring.message", "&eС глаз долой весь снег! Наступила %seasons:season%");
        // Summer
        addComment("Summer");
        addValueAndCommentDefault("lang.season.summer.name", "&aЛето");
        addValueAndCommentDefault("lang.season.summer.message", "&eНастало время пекла! Наступило %seasons:season%");
        // Fall
        addComment("Fall");
        addValueAndCommentDefault("lang.season.fall.name", "&6Осень");
        addValueAndCommentDefault("lang.season.fall.message", "&eУнылая пора! Очей очарованье! Наступила %seasons:season%");

        /// WEATHER
        addVoid();
        addComment("* WEATHER");
        // Night
        addComment("Night");
        addValueAndCommentDefault("lang.weather.night.name", "&7Ночь");
        addValueAndCommentDefault("lang.weather.night.message", "&7Кажется темнеет... Наступает %seasons:weather%");
        // Snowy
        addComment("Snowy");
        addValueAndCommentDefault("lang.weather.snowy.name", "&7Снежно");
        addValueAndCommentDefault("lang.weather.snowy.message", "&7Белый туман одеялом ложится на крыши и цветы. Сегодня %seasons:weather%");
        // Freezing
        addComment("Freezing");
        addValueAndCommentDefault("lang.weather.freezing.name", "&9Морозно");
        addValueAndCommentDefault("lang.weather.freezing.message", "&3Вся вода замерзает! Сегодня %seasons:weather%");
        // Stormy
        addComment("Stormy");
        addValueAndCommentDefault("lang.weather.stormy.name", "&cШторм");
        addValueAndCommentDefault("lang.weather.stormy.message", "&cГремит январская вьюга! Сегодня %seasons:weather%");
        // Cold
        addComment("Cold");
        addValueAndCommentDefault("lang.weather.cold.name", "&9Холодно");
        addValueAndCommentDefault("lang.weather.cold.message", "&3На окнах появляется иней. Сегодня %seasons:weather%");
        // Warm
        addComment("Warm");
        addValueAndCommentDefault("lang.weather.warm.name", "&eТепло");
        addValueAndCommentDefault("lang.weather.warm.message", "&eПриятный тёплый ветерок обдувает вас. Сегодня %seasons:weather%");
        // Hot
        addComment("Hot");
        addValueAndCommentDefault("lang.weather.hot.name", "&eЖарко");
        addValueAndCommentDefault("lang.weather.hot.message", "&eНас как в печку поместили! Сегодня %seasons:weather%");
        // Scorching
        addComment("Scorching");
        addValueAndCommentDefault("lang.weather.scorching.name", "&eНевыносимо жарко");
        addValueAndCommentDefault("lang.weather.scorching.message", "&eСейчас на улице такое пекло, что кожа слазит. Сегодня %seasons:weather%");
        // Rainy
        addComment("Rainy");
        addValueAndCommentDefault("lang.weather.rainy.name", "&9Дождливо");
        addValueAndCommentDefault("lang.weather.rainy.message", "&3Вы лицезреете сильнейший ливень! Сегодня %seasons:weather%");
        // Chilly
        addComment("Chilly");
        addValueAndCommentDefault("lang.weather.chilly.name", "&9Прохладно");
        addValueAndCommentDefault("lang.weather.chilly.message", "&3Вы дрожите от холода! Сегодня %seasons:weather%");
        // Breezy
        addComment("Breezy");
        addValueAndCommentDefault("lang.weather.breezy.name", "&7Свежо");
        addValueAndCommentDefault("lang.weather.breezy.message", "&7Вас обдувает лёгкий ветерок. Сегодня %seasons:weather%");
        // Beautiful
        addComment("Beautiful");
        addValueAndCommentDefault("lang.weather.beautiful.name", "&aКрасиво");
        addValueAndCommentDefault("lang.weather.beautiful.message", "&aСолнце светит, жизнь прекрасна! Сегодня %seasons:weather%");

        /// CHALLENGES
        addVoid();
        addComment("* CHALLENGES");
        // Feels good
        addComment("Feels good");
        addValueAndCommentDefault("lang.effect.feelsGood.message.trigger", "&aЛёгкий ветерок прекрасно ощущается кожей, но броня может испортить этот эффект...");
        addValueAndCommentDefault("lang.effect.feelsGood.message.get", "&aЛучи солнца на вашей коже делают вас сильнее!");
        addValueAndCommentDefault("lang.effect.feelsGood.message.remove", "&eКогда вы уходите из этого мира, ваш солнечный запас энергии покидает вас...");
        // Fluffy Coat
        addComment("Fluffy Coat");
        addValueAndCommentDefault("lang.effect.fluffyCoat.message.trigger", "&aБроня вас согревает, делает вас сильнее перед страшными морозами");
        addValueAndCommentDefault("lang.effect.fluffyCoat.message.get", "&aБроня согревает вас!");
        addValueAndCommentDefault("lang.effect.fluffyCoat.message.remove", "&cБез брони ваше тело больше не может сопротивляться морозам!");
        // Primitive Heating
        addComment("Primitive Heating");
        addValueAndCommentDefault("lang.effect.primitiveHeating.message.trigger", "&9В такой холод хотелось бы иметь при себе что-нибудь тёплое");
        addValueAndCommentDefault("lang.effect.primitiveHeating.message.get", "&aТёплый предмет в вашем инвенторе помогает вам сопротивляться морозам");
        addValueAndCommentDefault("lang.effect.primitiveHeating.message.remove", "&eВы больше не можете согреться...");
        // Revitalized
        addComment("Revitalized");
        addValueAndCommentDefault("lang.effect.revitalized.message.trigger", "&aЭта погода так бодрит!");
        addValueAndCommentDefault("lang.effect.revitalized.message.get", "&aСолнце этого мира &eрегенирирует&a вас!");
        addValueAndCommentDefault("lang.effect.revitalized.message.remove", "&eВместе с лечами солнца уходит и &6регенерация &e...");
        // Warming Stew
        addComment("Warming Stew");
        addValueAndCommentDefault("lang.effect.warmingStew.message.trigger", "&7А ведь мама говорила, что желудок будет требовать вкусный суп...");
        addValueAndCommentDefault("lang.effect.warmingStew.message.get", "&aО-да, это было вкусно! Урчание в животе становится меньше...");
        // Wind In Your Boots
        addComment("Wind In Your Boots");
        addValueAndCommentDefault("lang.effect.windInYourBoots.message.trigger", "&7Сегодня ваш попутный ветер!");
        addValueAndCommentDefault("lang.effect.windInYourBoots.message.get", "&aПопутный ветер сопроваждает вас, время ускоряться!");
        // Devastation
        addComment("Devastation");
        addValueAndCommentDefault("lang.effect.devastation.message.trigger", "&cВаше сердце колотится, а ноги дрожат. Вы не сможете регенерироваться!");
        // Frostbite
        addComment("Frostbite");
        addValueAndCommentDefault("lang.effect.frostbite.message.trigger", "&cВесь мир промёрз насквозь... В след за ним инием покроетесь и вы, если вдруг решите снять броню!");
        // Hold Onto Your Hat
        addComment("Hold Onto Your Hat");
        addValueAndCommentDefault("lang.effect.holdOntoYourHat.message.trigger", "&7Будьте осторожны, ваша шляпа может улететь!");
        addValueAndCommentDefault("lang.effect.holdOntoYourHat.message.get", "&eВаша шляпа улетела, боже мой!");
        // Hot Sand
        addComment("Hot Sand");
        addValueAndCommentDefault("lang.effect.hotSand.message.trigger", "&eХодить по песку может быть опасно!");
        addValueAndCommentDefault("lang.effect.hotSand.message.get", "&eГорячо! Песок слишком горячий!");
        // Icy
        addComment("Icy");
        addValueAndCommentDefault("lang.effect.icy.message.trigger", "&9Холодок обдувает вас, пока озёра леденеют");
        addValueAndCommentDefault("lang.effect.icy.message.get", "&cВода замёрзла в ведре...");
        // Soldering Iron
        addComment("Soldering Iron");
        addValueAndCommentDefault("lang.effect.solderingIron.message.trigger", "&eМеталл становится горячим, как вот-вот расплавится!");
        addValueAndCommentDefault("lang.effect.solderingIron.message.get", "&cЖелезо слишком горячее, не держите его в руках!");
        // Strong Current
        addComment("Strong Current");
        addValueAndCommentDefault("lang.effect.strongCurrent.message.trigger", "&9На воде начинается настоящий шторм, будте осторожны!");
        addValueAndCommentDefault("lang.effect.strongCurrent.message.get", "&cС водой шутки плохи! Волна накрывает вас...");
        addValueAndCommentDefault("lang.effect.strongCurrent.message.remove", "&aМорская болезнь проходит... Больше не играйте в Джека Воробья!");
        // Sweating
        addComment("Sweating");
        addValueAndCommentDefault("lang.effect.sweating.message.trigger", "&eЭта погода точно НЕ для ношения брони...");
        addValueAndCommentDefault("lang.effect.sweating.message.get", "&cПродолжая носить броню, вы сваритесь...");
        addValueAndCommentDefault("lang.effect.sweating.message.remove", "&aВоздух охлаждает вас, вы больше не рискуете быть сваренным заживо!");
        // The Shivers
        addComment("The Shivers");
        addValueAndCommentDefault("lang.effect.theShivers.message.trigger", "&cВся вода покрывается инием, и вас покроет, если вы захотите искупаться...");
        addValueAndCommentDefault("lang.effect.theShivers.message.get", "&cХолодная вода превратит вас в ледышку, вылезайте скорее!");
        // Wet Mud
        addComment("Wet Mud");
        addValueAndCommentDefault("lang.effect.wetMud.message.trigger", "&7Землю размывает, ваши ноги увязают в ней как в болоте...");
        addValueAndCommentDefault("lang.effect.wetMud.message.get", "&eГрязь облепила ваши ботинки, мешая вам передвигаться...");
    }
}
