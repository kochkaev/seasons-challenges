package ru.kochkaev.seasons.config.lang;

import ru.kochkaev.api.seasons.object.ConfigContentObject;
import ru.kochkaev.api.seasons.object.ConfigFileObject;
import ru.kochkaev.api.seasons.provider.Config;

public class DefaultTXTLangZH extends ConfigFileObject {

    private static final String copyright = Config.getCopyright() + "\nIt's mod lang!\n" +
            "\n** NAME = Display name of the Weather/Season\n** MESSAGE = Message, sends to chat on trigger\n\nOther config files:\n  - current.json - information about the current Weather/Season,\n    is updated when the server is turned off.\n  - lang - directory, contains translations of mod names/messages.\n" +
            "\nYou can use placeholders:\n  - %message% - will be replaced to message in specific context" +
            "\n  - %seasons:weather% - insert current weather name (from langs)\n  - %seasons:weather-previous% - insert previous weather name (from langs)\n  - %seasons:season% - insert current season name (from langs)" +
            "\n  - %seasons:lang% - insert current lang key\n  - %seasons:display-name% - insert Seasons mod display name (lang.message.seasonsModDisplayName in langs)" +
            "\n  - %seasons:title-new-day% - insert new day title message (from langs)\n  - %seasons:title-info% - insert new day info title message (from langs)" +
            "\n  - %seasons:actionbar% - insert actionbar title message format\n  - And others if you have installed PlaceholderAPI." +
            "\nYou can format your messages using MiniMessage! Details: https://docs.advntr.dev/minimessage/format.html";

    public DefaultTXTLangZH() {
        super("Seasons Challenges", "zh_CN", "lang", copyright, 2);
    }

    public void generate(ConfigContentObject content) {
        // SEASON
        content.addHeader("SEASON")
                // Winter
                .addTextValue("lang.season.winter.name", "<aqua>冬季", "Winter display name.")
                .addTextValue("lang.season.winter.message", "<yellow>雪花落下，世界变得茫茫一片, 是时候让 %seasons:season% 留下印记了...", "Winter onSet chat message.")
                // Spring
                .addTextValue("lang.season.spring.name", "<dark_green>春季", "Spring display name.")
                .addTextValue("lang.season.spring.message", "<yellow>大地复苏，花儿闻起来很不错，你身后的脚印里充满%seasons:season% ", "Spring onSet chat message.")
                // Summer
                .addTextValue("lang.season.summer.name", "<green>夏季", "Summer display name.")
                .addTextValue("lang.season.summer.message", "<yellow>今天感觉比昨天温暖，也许还会更一点.....是%seasons:season%！", "Summer onSet chat message.")
                // Fall
                .addTextValue("lang.season.fall.name", "<gold>秋天", "Fall display name.")
                .addTextValue("lang.season.fall.message", "<yellow>冷风吹过，树上的叶子缓缓落下, 这是 %seasons:season%!", "Fall onSet chat message.");

        // WEATHER
        content.addHeader("WEATHER")
                // Night
                .addTextValue("lang.weather.night.name", "<gray>风平浪静", "Night display name.")
                .addTextValue("lang.weather.night.message", "<gray>今天的世界很平静，甚至一点风都没有……但也许这是暴风雨前的宁静...", "Night onSet chat message.")
                // Snowy
                .addTextValue("lang.weather.snowy.name", "<gray>降雪", "Snowy display name.")
                .addTextValue("lang.weather.snowy.message", "<gray>一条巨大的白色毯子覆盖了整个世界", "Snowy onSet chat message.")
                // Freezing
                .addTextValue("lang.weather.freezing.name", "<blue>霜冻", "Freezing display name.")
                .addTextValue("lang.weather.freezing.message", "<dark_aqua>你感到非常的寒冷，连水桶里的水都冻住了", "Freezing onSet chat message.")
                // Stormy
                .addTextValue("lang.weather.stormy.name", "<red>风暴", "Stormy display name.")
                .addTextValue("lang.weather.stormy.message", "<red>一场超大的%seasons:weather% <red>灾难,这是上帝在发怒，当心了！!", "Stormy onSet chat message.")
                // Cold
                .addTextValue("lang.weather.cold.name", "<blue>寒潮", "Cold display name.")
                .addTextValue("lang.weather.cold.message", "<dark_aqua>今天的水很冷", "Cold onSet chat message.")
                // Warm
                .addTextValue("lang.weather.warm.name", "<yellow>温和日", "Warm display name.")
                .addTextValue("lang.weather.warm.message", "<yellow>一股温暖的风迎面吹来,这是春风的拥抱 ", "Warm onSet chat message.")
                // Hot
                .addTextValue("lang.weather.hot.name", "<yellow>炽热", "Hot display name.")
                .addTextValue("lang.weather.hot.message", "<yellow>今天真的是%seasons:weather% <yellow>你要疯了", "Hot onSet chat message.")
                // Scorching
                .addTextValue("lang.weather.scorching.name", "<yellow>烈日当空", "Scorching display name.")
                .addTextValue("lang.weather.scorching.message", "<yellow>阳光灼伤你的皮肤，触摸地面会很痛，这是 %seasons:weather%", "Scorching onSet chat message.")
                // Rainy
                .addTextValue("lang.weather.rainy.name", "<blue>雨水", "Rainy display name.")
                .addTextValue("lang.weather.rainy.message", "<dark_aqua>一场大雨落下，打湿了地面, 这是 %seasons:weather%", "Rainy onSet chat message.")
                // Chilly
                .addTextValue("lang.weather.chilly.name", "<blue>霜冻", "Chilly display name.")
                .addTextValue("lang.weather.chilly.message", "<dark_aqua>霜晶在你周围闪闪发光，你冷的发抖...", "Chilly onSet chat message.")
                // Breezy
                .addTextValue("lang.weather.breezy.name", "<gray>回寒", "Breezy display name.")
                .addTextValue("lang.weather.breezy.message", "<gray>一股冷风吹来，可能是%seasons:weather%了...", "Breezy onSet chat message.")
                // Beautiful
                .addTextValue("lang.weather.beautiful.name", "<green>完美的一天", "Beautiful display name.")
                .addTextValue("lang.weather.beautiful.message", "<green>今天的阳光真好，温度适宜，简直太完美了", "Beautiful onSet chat message.");

        // CHALLENGES
        content.addHeader("CHALLENGES")
                // Feels good
                .addTextValue("lang.challenge.feelsGood.message.trigger", "<green>微风吹拂你的皮肤感觉真好，感觉身上的盔甲今天应该休息一下...", "Feels Good trigger message.")
                .addTextValue("lang.challenge.feelsGood.message.get", "<green>没有盔甲遮挡,阳光照在你的皮肤上给你能量，感觉很好!", "Feels Good onGet (apply) message.")
                .addTextValue("lang.challenge.feelsGood.message.remove", "<yellow>当你离开世界时，充满活力的阳光会消失...", "Feels Good remove message.")
                // Fluffy Coat
                .addTextValue("lang.challenge.fluffyCoat.message.trigger", "<green>你的盔甲给你带来舒缓的温暖，让你能抵抗严寒!", "Fluffy Coat trigger message.")
                .addTextValue("lang.challenge.fluffyCoat.message.get", "<green>你的盔甲给你一种舒缓的温暖，让你更能抵抗世界", "Fluffy Coat onGet (apply) message.")
                .addTextValue("lang.challenge.fluffyCoat.message.remove", "<red>没有盔甲，你的身体会再次感受到寒冷，不再抵抗它", "Fluffy Coat remove message.")
                // Primitive Heating
                .addTextValue("lang.challenge.primitiveHeating.message.trigger", "<blue>在这种寒冷中随身携带热源会很棒!", "Primitive Heating trigger message.")
                .addTextValue("lang.challenge.primitiveHeating.message.get", "<green>你库存中的热门物品温暖你的心，让你抵抗寒冷的世界", "Primitive Heating onGet (apply) message.")
                .addTextValue("lang.challenge.primitiveHeating.message.remove", "<yellow>你的身体不再温暖，它的抵抗力也消失了...", "Primitive Heating remove message.")
                // Revitalized
                .addTextValue("lang.challenge.revitalized.message.trigger", "<green>这种天气真是令人振奋!", "Revitalized trigger message.")
                .addTextValue("lang.challenge.revitalized.message.get", "<green>来自这个世界的太阳是如此<yellow>Revitalising<green>，它正在使你再生!", "Revitalized onGet (apply) message.")
                .addTextValue("lang.challenge.revitalized.message.remove", "<yellow>当阳光光离开你的皮肤时，<gold>Revitalising <yellow>energy 的效果也会结束...", "Revitalized remove message.")
                // Warming Stew
                .addTextValue("lang.challenge.warmingStew.message.trigger", "<gray>你的肚子开始咕咕叫，你开始渴望喝点丰盛的汤...", "Warming Stew trigger message.")
                .addTextValue("lang.challenge.warmingStew.message.get", "<green>恰到好处，美味的炖菜让你的伤口更容易忍受...", "Warming Stew onGet (apply) message.")
                // Wind In Your Boots
                .addTextValue("lang.challenge.windInYourBoots.message.trigger", "<gray>您今天感到风向对您有利!", "Wind In Your Boots trigger message.")
                .addTextValue("lang.challenge.windInYourBoots.message.get", "<green>你感觉到一阵风在你的靴子里冲刺，然后向前飞驰!", "Wind In Your Boots onGet (apply) message.")
                // Devastation
                .addTextValue("lang.challenge.devastation.message.trigger", "<red>你的心跳加速，你的双腿颤抖，你发现在这场毁灭过去之前，你无法恢复健康!", "Devastation trigger message.")
                // Frostbite
                .addTextValue("lang.challenge.frostbite.message.trigger", "<red>世界正在冻结，如果你没有穿上盔甲，你也会冻结!", "Frostbite trigger message.")
                // Hold Onto Your Hat
                .addTextValue("lang.challenge.holdOntoYourHat.message.trigger", "<gray>小心你的帽子，风要起了...", "Hold Onto Your Hat trigger message.")
                .addTextValue("lang.challenge.holdOntoYourHat.message.get", "<yellow>你的帽子刚刚被吹掉了!快去捡起来", "Hold Onto Your Hat onGet (apply) message.")
                // Hot Sand
                .addTextValue("lang.challenge.hotSand.message.trigger", "<yellow>在这种炎热的天气里走在沙子上一定很痛苦!", "Hot Sand trigger message.")
                .addTextValue("lang.challenge.hotSand.message.get", "<yellow>哎呀！现在的沙子太烫了!", "Hot Sand onGet (apply) message.")
                // Icy
                .addTextValue("lang.challenge.icy.message.trigger", "<blue>当水变成冰时，一股寒意顺着你的脊椎流下!", "Icy trigger message.")
                .addTextValue("lang.challenge.icy.message.get", "<red>水桶的水开始结冰...", "Icy onGet (apply) message.")
                // Soldering Iron
                .addTextValue("lang.challenge.solderingIron.message.trigger", "<yellow>附近的铁器开始发出嘶嘶声，最好暂时放下它...", "Soldering Iron trigger message.")
                .addTextValue("lang.challenge.solderingIron.message.get", "<red>铁器都很烫手，尽量不要握持太久!", "Soldering Iron onGet (apply) message.")
                // Strong Current
                .addTextValue("lang.challenge.strongCurrent.message.trigger", "<blue>水流湍急，很难涉水而过!", "Strong Current trigger message.")
                .addTextValue("lang.challenge.strongCurrent.message.get", "<red>水流撞击着你，你的肌肉在痛苦中哭泣...", "Strong Current onGet (apply) message.")
                .addTextValue("lang.challenge.strongCurrent.message.remove", "<green>晕船过去了，海水不再打扰你...", "Strong Current remove message.")
                // Sweating
                .addTextValue("lang.challenge.sweating.message.trigger", "<yellow>这绝对不是适合穿戴盔甲的天气...", "Sweating trigger message.")
                .addTextValue("lang.challenge.sweating.message.get", "<red>汗水从你的额头滴落，今天穿盔甲太热了...", "Sweating onGet (apply) message.")
                .addTextValue("lang.challenge.sweating.message.remove", "<green>空气变凉，你擦去额头上的汗水...", "Sweating remove message.")
                // The Shivers
                .addTextValue("lang.challenge.theShivers.message.trigger", "<red>今天的水，摸起来很冷...", "The Shivers trigger message.")
                .addTextValue("lang.challenge.theShivers.message.get", "<red>T水冰的像要了你的命，如果你想活下去，就快离开!", "The Shivers onGet (apply) message.")
                // Wet Mud
                .addTextValue("lang.challenge.wetMud.message.trigger", "<gray>污垢会覆盖你的靴子，在这种天气里很难行动...", "Wet Mud trigger message.")
                .addTextValue("lang.challenge.wetMud.message.get", "<yellow>泥巴粘在你的靴子上，让你慢下来...", "Wet Mud onGet (apply) message.");
    }

    @Override
    public Boolean update(ConfigContentObject content, Integer targetVersion, Integer currentVersion) {
        return ru.kochkaev.api.seasons.config.DefaultTXTConfig.configUpdate(content, targetVersion, currentVersion);
    }
}
