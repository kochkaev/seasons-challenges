package ru.kochkaev.seasons.config.lang;

import ru.kochkaev.api.seasons.object.ConfigContentObject;
import ru.kochkaev.api.seasons.object.ConfigFileObject;
import ru.kochkaev.api.seasons.provider.Config;

public class DefaultTXTLangRU extends ConfigFileObject {

    private static final String copyright = Config.getCopyright() + "\nIt's mod config!\n" +
            "\n** NAME = Display name of the Weather/Season\n** MESSAGE = Message, sends to chat on trigger\n\nOther config files:\n  - current.json - information about the current Weather/Season,\n    is updated when the server is turned off.\n  - lang - directory, contains translations of mod names/messages.\n" +
            "\nYou can use placeholders: \n  - & - insert color (replaces to paragraph symbol)\n  - %message% - will be replaced to message in specific context" +
            "\n  - %seasons:weather% - insert current weather name (from langs)\n  - %seasons:weather-previous% - insert previous weather name (from langs)\n  - %seasons:season% - insert current season name (from langs)" +
            "\n  - %seasons:lang% - insert current lang key\n  - %seasons:display-name% - insert Seasons mod display name (lang.message.seasonsModDisplayName in langs)" +
            "\n  - %seasons:title-new-day% - insert new day title message (from langs)\n  - %seasons:title-info% - insert new day info title message (from langs)" +
            "\n  - %seasons:actionbar% - insert actionbar title message format\n  - And others if you have installed PlaceholderAPI.";
    
    public DefaultTXTLangRU() {
        super("Seasons Challenges", "ru_RU", "lang", copyright);
    }

    public void generate(ConfigContentObject content) {
        // SEASON
        content.addHeader("SEASON")
                // Winter
                .addValue("lang.season.winter.name", "&bЗима", "Winter display name.")
                .addValue("lang.season.winter.message", "&eДа свершится новогоднее чудо! Наступила %seasons:season%", "Winter onSet chat message.")
                // Spring
                .addValue("lang.season.spring.name", "&2Весна", "Spring display name.")
                .addValue("lang.season.spring.message", "&eС глаз долой весь снег! Наступила %seasons:season%", "Spring onSet chat message.")
                // Summer
                .addValue("lang.season.summer.name", "&aЛето", "Summer display name.")
                .addValue("lang.season.summer.message", "&eНастало время пекла! Наступило %seasons:season%", "Summer onSet chat message.")
                // Fall
                .addValue("lang.season.fall.name", "&6Осень", "Fall display name.")
                .addValue("lang.season.fall.message", "&eУнылая пора! Очей очарованье! Наступила %seasons:season%", "Fall onSet chat message.");

        // WEATHER
        content.addHeader("WEATHER")
                // Night
                .addValue("lang.weather.night.name", "&7Ночь", "Night display name.")
                .addValue("lang.weather.night.message", "&7Кажется темнеет... Наступает %seasons:weather%", "Night onSet chat message.")
                // Snowy
                .addValue("lang.weather.snowy.name", "&7Снежно", "Snowy display name.")
                .addValue("lang.weather.snowy.message", "&7Белый туман одеялом ложится на крыши и цветы. Сегодня %seasons:weather%", "Snowy onSet chat message.")
                // Freezing
                .addValue("lang.weather.freezing.name", "&9Морозно", "Freezing display name.")
                .addValue("lang.weather.freezing.message", "&3Вся вода замерзает! Сегодня %seasons:weather%", "Freezing onSet chat message.")
                // Stormy
                .addValue("lang.weather.stormy.name", "&cШторм", "Stormy display name.")
                .addValue("lang.weather.stormy.message", "&cГремит январская вьюга! Сегодня %seasons:weather%", "Stormy onSet chat message.")
                // Cold
                .addValue("lang.weather.cold.name", "&9Холодно", "Cold display name.")
                .addValue("lang.weather.cold.message", "&3На окнах появляется иней. Сегодня %seasons:weather%", "Cold onSet chat message.")
                // Warm
                .addValue("lang.weather.warm.name", "&eТепло", "Warm display name.")
                .addValue("lang.weather.warm.message", "&eПриятный тёплый ветерок обдувает вас. Сегодня %seasons:weather%", "Warm onSet chat message.")
                // Hot
                .addValue("lang.weather.hot.name", "&eЖарко", "Hot display name.")
                .addValue("lang.weather.hot.message", "&eНас как в печку поместили! Сегодня %seasons:weather%", "Hot onSet chat message.")
                // Scorching
                .addValue("lang.weather.scorching.name", "&eНевыносимо жарко", "Scorching display name.")
                .addValue("lang.weather.scorching.message", "&eСейчас на улице такое пекло, что кожа слазит. Сегодня %seasons:weather%", "Scorching onSet chat message.")
                // Rainy
                .addValue("lang.weather.rainy.name", "&9Дождливо", "Rainy display name.")
                .addValue("lang.weather.rainy.message", "&3Вы лицезреете сильнейший ливень! Сегодня %seasons:weather%", "Rainy onSet chat message.")
                // Chilly
                .addValue("lang.weather.chilly.name", "&9Прохладно", "Chilly display name.")
                .addValue("lang.weather.chilly.message", "&3Вы дрожите от холода! Сегодня %seasons:weather%", "Chilly onSet chat message.")
                // Breezy
                .addValue("lang.weather.breezy.name", "&7Свежо", "Breezy display name.")
                .addValue("lang.weather.breezy.message", "&7Вас обдувает лёгкий ветерок. Сегодня %seasons:weather%", "Breezy onSet chat message.")
                // Beautiful
                .addValue("lang.weather.beautiful.name", "&aКрасиво", "Beautiful display name.")
                .addValue("lang.weather.beautiful.message", "&aСолнце светит, жизнь прекрасна! Сегодня %seasons:weather%", "Beautiful onSet chat message.");

        // CHALLENGES
        content.addHeader("CHALLENGES")
                // Feels Good
                .addValue("lang.challenge.feelsGood.message.trigger", "&aЛёгкий ветерок прекрасно ощущается кожей, но броня может испортить этот эффект...", "Feels Good trigger message.")
                .addValue("lang.challenge.feelsGood.message.get", "&aЛучи солнца на вашей коже делают вас сильнее!", "Feels Good onGet (apply) message.")
                .addValue("lang.challenge.feelsGood.message.remove", "&eКогда вы уходите из этого мира, ваш солнечный запас энергии покидает вас...", "Feels Good remove message.")
                // Fluffy Coat
                .addValue("lang.challenge.fluffyCoat.message.trigger", "&aБроня вас согревает, делает вас сильнее перед страшными морозами", "Fluffy Coat trigger message.")
                .addValue("lang.challenge.fluffyCoat.message.get", "&aБроня согревает вас!", "Fluffy Coat onGet (apply) message.")
                .addValue("lang.challenge.fluffyCoat.message.remove", "&cБез брони ваше тело больше не может сопротивляться морозам!", "Fluffy Coat remove message.")
                // Primitive Heating
                .addValue("lang.challenge.primitiveHeating.message.trigger", "&9В такой холод хотелось бы иметь при себе что-нибудь тёплое", "Primitive Heating trigger message.")
                .addValue("lang.challenge.primitiveHeating.message.get", "&aТёплый предмет в вашем инвенторе помогает вам сопротивляться морозам", "Primitive Heating onGet (apply) message.")
                .addValue("lang.challenge.primitiveHeating.message.remove", "&eВы больше не можете согреться...", "Primitive Heating remove message.")
                // Revitalized
                .addValue("lang.challenge.revitalized.message.trigger", "&aЭта погода так бодрит!", "Revitalized trigger message")
                .addValue("lang.challenge.revitalized.message.get", "&aСолнце этого мира &eрегенирирует&a вас!", "Revitalized onGet (apply) message")
                .addValue("lang.challenge.revitalized.message.remove", "&eВместе с лечами солнца уходит и &6регенерация &e...", "Revitalized remove message.")
                // Warming Stew
                .addValue("lang.challenge.warmingStew.message.trigger", "&7А ведь мама говорила, что желудок будет требовать вкусный суп...", "Warming Stew trigger message.")
                .addValue("lang.challenge.warmingStew.message.get", "&aО-да, это было вкусно! Урчание в животе становится меньше...", "Warming Stew onGet (apply) message.")
                // Wind In Your Boots
                .addValue("lang.challenge.windInYourBoots.message.trigger", "&7Сегодня ваш попутный ветер!", "Wind In Your Boots trigger message")
                .addValue("lang.challenge.windInYourBoots.message.get", "&aПопутный ветер сопроваждает вас, время ускоряться!", "Wind In Your Boots onGet (apply) message.")
                // Devastation
                .addValue("lang.challenge.devastation.message.trigger", "&cВаше сердце колотится, а ноги дрожат. Вы не сможете регенерироваться!", "Devastation trigger message.")
                // Frostbite
                .addValue("lang.challenge.frostbite.message.trigger", "&cВесь мир промёрз насквозь... В след за ним инием покроетесь и вы, если вдруг решите снять броню!", "Frostbite trigger message.")
                // Hold Onto Your Hat
                .addValue("lang.challenge.holdOntoYourHat.message.trigger", "&7Будьте осторожны, ваша шляпа может улететь!", "Hold Onto Your Hat trigger message.")
                .addValue("lang.challenge.holdOntoYourHat.message.get", "&eВаша шляпа улетела, боже мой!", "Hold Onto Your Hat onGet (apply) message.")
                // Hot Sand
                .addValue("lang.challenge.hotSand.message.trigger", "&eХодить по песку может быть опасно!", "Hot Sand trigger message.")
                .addValue("lang.challenge.hotSand.message.get", "&eГорячо! Песок слишком горячий!", "Hot Sand onGet (apply) message.")
                // Icy
                .addValue("lang.challenge.icy.message.trigger", "&9Холодок обдувает вас, пока озёра леденеют", "Icy trigger message.")
                .addValue("lang.challenge.icy.message.get", "&cВода замёрзла в ведре...", "Icy onGet (apply) message.")
                // Soldering Iron
                .addValue("lang.challenge.solderingIron.message.trigger", "&eМеталл становится горячим, как вот-вот расплавится!", "Soldering Iron trigger message.")
                .addValue("lang.challenge.solderingIron.message.get", "&cЖелезо слишком горячее, не держите его в руках!", "Soldering Iron onGet (apply) message.")
                // Strong Current
                .addValue("lang.challenge.strongCurrent.message.trigger", "&9На воде начинается настоящий шторм, будте осторожны!", "Strong Current trigger message.")
                .addValue("lang.challenge.strongCurrent.message.get", "&cС водой шутки плохи! Волна накрывает вас...", "Strong Current onGet (apply) message.")
                .addValue("lang.challenge.strongCurrent.message.remove", "&aМорская болезнь проходит... Больше не играйте в Джека Воробья!", "Strong Current remove message.")
                // Sweating
                .addValue("lang.challenge.sweating.message.trigger", "&eЭта погода точно НЕ для ношения брони...", "Sweating trigger message.")
                .addValue("lang.challenge.sweating.message.get", "&cПродолжая носить броню, вы сваритесь...", "Sweating onGet (apply) message.")
                .addValue("lang.challenge.sweating.message.remove", "&aВоздух охлаждает вас, вы больше не рискуете быть сваренным заживо!", "Sweating remove message.")
                // The Shivers
                .addValue("lang.challenge.theShivers.message.trigger", "&cВся вода покрывается инием, и вас покроет, если вы захотите искупаться...", "The Shivers trigger message.")
                .addValue("lang.challenge.theShivers.message.get", "&cХолодная вода превратит вас в ледышку, вылезайте скорее!", "The Shivers onGet (apply) message.")
                // Wet Mud
                .addValue("lang.challenge.wetMud.message.trigger", "&7Землю размывает, ваши ноги увязают в ней как в болоте...", "Wet Mud trigger message.")
                .addValue("lang.challenge.wetMud.message.get", "&eГрязь облепила ваши ботинки, мешая вам передвигаться...", "Wet Mud onGet (apply) message.");
    }
}
