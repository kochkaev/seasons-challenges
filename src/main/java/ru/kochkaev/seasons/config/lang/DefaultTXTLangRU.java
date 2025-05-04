package ru.kochkaev.seasons.config.lang;

import ru.kochkaev.api.seasons.object.ConfigContentObject;
import ru.kochkaev.api.seasons.object.ConfigFileObject;
import ru.kochkaev.api.seasons.provider.Config;

public class DefaultTXTLangRU extends ConfigFileObject {

    private static final String copyright = Config.getCopyright() + "\nIt's mod lang!\n" +
            "\n** NAME = Display name of the Weather/Season\n** MESSAGE = Message, sends to chat on trigger\n\nOther config files:\n  - current.json - information about the current Weather/Season,\n    is updated when the server is turned off.\n  - lang - directory, contains translations of mod names/messages.\n" +
            "\nYou can use placeholders:\n  - %message% - will be replaced to message in specific context" +
            "\n  - %seasons:weather% - insert current weather name (from langs)\n  - %seasons:weather-previous% - insert previous weather name (from langs)\n  - %seasons:season% - insert current season name (from langs)" +
            "\n  - %seasons:lang% - insert current lang key\n  - %seasons:display-name% - insert Seasons mod display name (lang.message.seasonsModDisplayName in langs)" +
            "\n  - %seasons:title-new-day% - insert new day title message (from langs)\n  - %seasons:title-info% - insert new day info title message (from langs)" +
            "\n  - %seasons:actionbar% - insert actionbar title message format\n  - And others if you have installed PlaceholderAPI." +
            "\nYou can format your messages using MiniMessage! Details: https://docs.advntr.dev/minimessage/format.html";
    
    public DefaultTXTLangRU() {
        super("Seasons Challenges", "ru_RU", "lang", copyright, 2);
    }

    public void generate(ConfigContentObject content) {
        // SEASON
        content.addHeader("SEASON")
                // Winter
                .addTextValue("lang.season.winter.name", "<aqua>Зима", "Winter display name.")
                .addTextValue("lang.season.winter.message", "<yellow>Да свершится новогоднее чудо! Наступила %seasons:season%", "Winter onSet chat message.")
                // Spring
                .addTextValue("lang.season.spring.name", "<dark_green>Весна", "Spring display name.")
                .addTextValue("lang.season.spring.message", "<yellow>С глаз долой весь снег! Наступила %seasons:season%", "Spring onSet chat message.")
                // Summer
                .addTextValue("lang.season.summer.name", "<green>Лето", "Summer display name.")
                .addTextValue("lang.season.summer.message", "<yellow>Настало время пекла! Наступило %seasons:season%", "Summer onSet chat message.")
                // Fall
                .addTextValue("lang.season.fall.name", "<gold>Осень", "Fall display name.")
                .addTextValue("lang.season.fall.message", "<yellow>Унылая пора! Очей очарованье! Наступила %seasons:season%", "Fall onSet chat message.");

        // WEATHER
        content.addHeader("WEATHER")
                // Night
                .addTextValue("lang.weather.night.name", "<gray>Ночь", "Night display name.")
                .addTextValue("lang.weather.night.message", "<gray>Кажется темнеет... Наступает %seasons:weather%", "Night onSet chat message.")
                // Snowy
                .addTextValue("lang.weather.snowy.name", "<gray>Снежно", "Snowy display name.")
                .addTextValue("lang.weather.snowy.message", "<gray>Белый туман одеялом ложится на крыши и цветы. Сегодня %seasons:weather%", "Snowy onSet chat message.")
                // Freezing
                .addTextValue("lang.weather.freezing.name", "<blue>Морозно", "Freezing display name.")
                .addTextValue("lang.weather.freezing.message", "<dark_aqua>Вся вода замерзает! Сегодня %seasons:weather%", "Freezing onSet chat message.")
                // Stormy
                .addTextValue("lang.weather.stormy.name", "<red>Шторм", "Stormy display name.")
                .addTextValue("lang.weather.stormy.message", "<red>Гремит январская вьюга! Сегодня %seasons:weather%", "Stormy onSet chat message.")
                // Cold
                .addTextValue("lang.weather.cold.name", "<blue>Холодно", "Cold display name.")
                .addTextValue("lang.weather.cold.message", "<dark_aqua>На окнах появляется иней. Сегодня %seasons:weather%", "Cold onSet chat message.")
                // Warm
                .addTextValue("lang.weather.warm.name", "<yellow>Тепло", "Warm display name.")
                .addTextValue("lang.weather.warm.message", "<yellow>Приятный тёплый ветерок обдувает вас. Сегодня %seasons:weather%", "Warm onSet chat message.")
                // Hot
                .addTextValue("lang.weather.hot.name", "<yellow>Жарко", "Hot display name.")
                .addTextValue("lang.weather.hot.message", "<yellow>Нас как в печку поместили! Сегодня %seasons:weather%", "Hot onSet chat message.")
                // Scorching
                .addTextValue("lang.weather.scorching.name", "<yellow>Невыносимо жарко", "Scorching display name.")
                .addTextValue("lang.weather.scorching.message", "<yellow>Сейчас на улице такое пекло, что кожа слазит. Сегодня %seasons:weather%", "Scorching onSet chat message.")
                // Rainy
                .addTextValue("lang.weather.rainy.name", "<blue>Дождливо", "Rainy display name.")
                .addTextValue("lang.weather.rainy.message", "<dark_aqua>Вы лицезреете сильнейший ливень! Сегодня %seasons:weather%", "Rainy onSet chat message.")
                // Chilly
                .addTextValue("lang.weather.chilly.name", "<blue>Прохладно", "Chilly display name.")
                .addTextValue("lang.weather.chilly.message", "<dark_aqua>Вы дрожите от холода! Сегодня %seasons:weather%", "Chilly onSet chat message.")
                // Breezy
                .addTextValue("lang.weather.breezy.name", "<gray>Свежо", "Breezy display name.")
                .addTextValue("lang.weather.breezy.message", "<gray>Вас обдувает лёгкий ветерок. Сегодня %seasons:weather%", "Breezy onSet chat message.")
                // Beautiful
                .addTextValue("lang.weather.beautiful.name", "<green>Красиво", "Beautiful display name.")
                .addTextValue("lang.weather.beautiful.message", "<green>Солнце светит, жизнь прекрасна! Сегодня %seasons:weather%", "Beautiful onSet chat message.");

        // CHALLENGES
        content.addHeader("CHALLENGES")
                // Feels Good
                .addTextValue("lang.challenge.feelsGood.message.trigger", "<green>Лёгкий ветерок прекрасно ощущается кожей, но броня может испортить этот эффект...", "Feels Good trigger message.")
                .addTextValue("lang.challenge.feelsGood.message.get", "<green>Лучи солнца на вашей коже делают вас сильнее!", "Feels Good onGet (apply) message.")
                .addTextValue("lang.challenge.feelsGood.message.remove", "<yellow>Когда вы уходите из этого мира, ваш солнечный запас энергии покидает вас...", "Feels Good remove message.")
                // Fluffy Coat
                .addTextValue("lang.challenge.fluffyCoat.message.trigger", "<green>Броня вас согревает, делает вас сильнее перед страшными морозами", "Fluffy Coat trigger message.")
                .addTextValue("lang.challenge.fluffyCoat.message.get", "<green>Броня согревает вас!", "Fluffy Coat onGet (apply) message.")
                .addTextValue("lang.challenge.fluffyCoat.message.remove", "<red>Без брони ваше тело больше не может сопротивляться морозам!", "Fluffy Coat remove message.")
                // Primitive Heating
                .addTextValue("lang.challenge.primitiveHeating.message.trigger", "<blue>В такой холод хотелось бы иметь при себе что-нибудь тёплое", "Primitive Heating trigger message.")
                .addTextValue("lang.challenge.primitiveHeating.message.get", "<green>Тёплый предмет в вашем инвенторе помогает вам сопротивляться морозам", "Primitive Heating onGet (apply) message.")
                .addTextValue("lang.challenge.primitiveHeating.message.remove", "<yellow>Вы больше не можете согреться...", "Primitive Heating remove message.")
                // Revitalized
                .addTextValue("lang.challenge.revitalized.message.trigger", "<green>Эта погода так бодрит!", "Revitalized trigger message")
                .addTextValue("lang.challenge.revitalized.message.get", "<green>Солнце этого мира <yellow>регенирирует<green> вас!", "Revitalized onGet (apply) message")
                .addTextValue("lang.challenge.revitalized.message.remove", "<yellow>Вместе с лечами солнца уходит и <gold>регенерация <yellow>...", "Revitalized remove message.")
                // Warming Stew
                .addTextValue("lang.challenge.warmingStew.message.trigger", "<gray>А ведь мама говорила, что желудок будет требовать вкусный суп...", "Warming Stew trigger message.")
                .addTextValue("lang.challenge.warmingStew.message.get", "<green>О-да, это было вкусно! Урчание в животе становится меньше...", "Warming Stew onGet (apply) message.")
                // Wind In Your Boots
                .addTextValue("lang.challenge.windInYourBoots.message.trigger", "<gray>Сегодня ваш попутный ветер!", "Wind In Your Boots trigger message")
                .addTextValue("lang.challenge.windInYourBoots.message.get", "<green>Попутный ветер сопроваждает вас, время ускоряться!", "Wind In Your Boots onGet (apply) message.")
                // Devastation
                .addTextValue("lang.challenge.devastation.message.trigger", "<red>Ваше сердце колотится, а ноги дрожат. Вы не сможете регенерироваться!", "Devastation trigger message.")
                // Frostbite
                .addTextValue("lang.challenge.frostbite.message.trigger", "<red>Весь мир промёрз насквозь... В след за ним инием покроетесь и вы, если вдруг решите снять броню!", "Frostbite trigger message.")
                // Hold Onto Your Hat
                .addTextValue("lang.challenge.holdOntoYourHat.message.trigger", "<gray>Будьте осторожны, ваша шляпа может улететь!", "Hold Onto Your Hat trigger message.")
                .addTextValue("lang.challenge.holdOntoYourHat.message.get", "<yellow>Ваша шляпа улетела, боже мой!", "Hold Onto Your Hat onGet (apply) message.")
                // Hot Sand
                .addTextValue("lang.challenge.hotSand.message.trigger", "<yellow>Ходить по песку может быть опасно!", "Hot Sand trigger message.")
                .addTextValue("lang.challenge.hotSand.message.get", "<yellow>Горячо! Песок слишком горячий!", "Hot Sand onGet (apply) message.")
                // Icy
                .addTextValue("lang.challenge.icy.message.trigger", "<blue>Холодок обдувает вас, пока озёра леденеют", "Icy trigger message.")
                .addTextValue("lang.challenge.icy.message.get", "<red>Вода замёрзла в ведре...", "Icy onGet (apply) message.")
                // Soldering Iron
                .addTextValue("lang.challenge.solderingIron.message.trigger", "<yellow>Металл становится горячим, как вот-вот расплавится!", "Soldering Iron trigger message.")
                .addTextValue("lang.challenge.solderingIron.message.get", "<red>Железо слишком горячее, не держите его в руках!", "Soldering Iron onGet (apply) message.")
                // Strong Current
                .addTextValue("lang.challenge.strongCurrent.message.trigger", "<blue>На воде начинается настоящий шторм, будте осторожны!", "Strong Current trigger message.")
                .addTextValue("lang.challenge.strongCurrent.message.get", "<red>С водой шутки плохи! Волна накрывает вас...", "Strong Current onGet (apply) message.")
                .addTextValue("lang.challenge.strongCurrent.message.remove", "<green>Морская болезнь проходит... Больше не играйте в Джека Воробья!", "Strong Current remove message.")
                // Sweating
                .addTextValue("lang.challenge.sweating.message.trigger", "<yellow>Эта погода точно НЕ для ношения брони...", "Sweating trigger message.")
                .addTextValue("lang.challenge.sweating.message.get", "<red>Продолжая носить броню, вы сваритесь...", "Sweating onGet (apply) message.")
                .addTextValue("lang.challenge.sweating.message.remove", "<green>Воздух охлаждает вас, вы больше не рискуете быть сваренным заживо!", "Sweating remove message.")
                // The Shivers
                .addTextValue("lang.challenge.theShivers.message.trigger", "<red>Вся вода покрывается инием, и вас покроет, если вы захотите искупаться...", "The Shivers trigger message.")
                .addTextValue("lang.challenge.theShivers.message.get", "<red>Холодная вода превратит вас в ледышку, вылезайте скорее!", "The Shivers onGet (apply) message.")
                // Wet Mud
                .addTextValue("lang.challenge.wetMud.message.trigger", "<gray>Землю размывает, ваши ноги увязают в ней как в болоте...", "Wet Mud trigger message.")
                .addTextValue("lang.challenge.wetMud.message.get", "<yellow>Грязь облепила ваши ботинки, мешая вам передвигаться...", "Wet Mud onGet (apply) message.");
    }

    @Override
    public Boolean update(ConfigContentObject content, Integer targetVersion, Integer currentVersion) {
        return ru.kochkaev.api.seasons.config.DefaultTXTConfig.configUpdate(content, targetVersion, currentVersion);
    }
}
