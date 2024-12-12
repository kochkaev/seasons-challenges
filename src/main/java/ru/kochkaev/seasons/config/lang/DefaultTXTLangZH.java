package ru.kochkaev.seasons.config.lang;

import ru.kochkaev.api.seasons.object.ConfigContentObject;
import ru.kochkaev.api.seasons.object.ConfigFileObject;
import ru.kochkaev.api.seasons.provider.Config;

public class DefaultTXTLangZH extends ConfigFileObject {

    private static final String copyright = Config.getCopyright() + "\nIt's mod config!\n" +
            "\n** NAME = Display name of the Weather/Season\n** MESSAGE = Message, sends to chat on trigger\n\nOther config files:\n  - current.json - information about the current Weather/Season,\n    is updated when the server is turned off.\n  - lang - directory, contains translations of mod names/messages.\n" +
            "\nYou can use placeholders: \n  - & - insert color (replaces to paragraph symbol)\n  - %message% - will be replaced to message in specific context" +
            "\n  - %seasons:weather% - insert current weather name (from langs)\n  - %seasons:weather-previous% - insert previous weather name (from langs)\n  - %seasons:season% - insert current season name (from langs)" +
            "\n  - %seasons:lang% - insert current lang key\n  - %seasons:display-name% - insert Seasons mod display name (lang.message.seasonsModDisplayName in langs)" +
            "\n  - %seasons:title-new-day% - insert new day title message (from langs)\n  - %seasons:title-info% - insert new day info title message (from langs)" +
            "\n  - %seasons:actionbar% - insert actionbar title message format\n  - And others if you have installed PlaceholderAPI.";

    public DefaultTXTLangZH() {
        super("Seasons Challenges", "zh_CN", "lang", copyright);
    }

    public void generate(ConfigContentObject content) {
        // SEASON
        content.addHeader("SEASON")
                // Winter
                .addValue("lang.season.winter.name", "&b冬季", "Winter display name.")
                .addValue("lang.season.winter.message", "&e雪花落下，世界变得茫茫一片, 是时候让 %seasons:season% 留下印记了...", "Winter onSet chat message.")
                // Spring
                .addValue("lang.season.spring.name", "&2春季", "Spring display name.")
                .addValue("lang.season.spring.message", "&e大地复苏，花儿闻起来很不错，你身后的脚印里充满%seasons:season% ", "Spring onSet chat message.")
                // Summer
                .addValue("lang.season.summer.name", "&a夏季", "Summer display name.")
                .addValue("lang.season.summer.message", "&e今天感觉比昨天温暖，也许还会更一点.....是%seasons:season%！", "Summer onSet chat message.")
                // Fall
                .addValue("lang.season.fall.name", "&6秋天", "Fall display name.")
                .addValue("lang.season.fall.message", "&e冷风吹过，树上的叶子缓缓落下, 这是 %seasons:season%!", "Fall onSet chat message.");

        // WEATHER
        content.addHeader("WEATHER")
                // Night
                .addValue("lang.weather.night.name", "&7风平浪静", "Night display name.")
                .addValue("lang.weather.night.message", "&7今天的世界很平静，甚至一点风都没有……但也许这是暴风雨前的宁静...", "Night onSet chat message.")
                // Snowy
                .addValue("lang.weather.snowy.name", "&7降雪", "Snowy display name.")
                .addValue("lang.weather.snowy.message", "&7一条巨大的白色毯子覆盖了整个世界", "Snowy onSet chat message.")
                // Freezing
                .addValue("lang.weather.freezing.name", "&9霜冻", "Freezing display name.")
                .addValue("lang.weather.freezing.message", "&3你感到非常的寒冷，连水桶里的水都冻住了", "Freezing onSet chat message.")
                // Stormy
                .addValue("lang.weather.stormy.name", "&c风暴", "Stormy display name.")
                .addValue("lang.weather.stormy.message", "&c一场超大的%seasons:weather% &c灾难,这是上帝在发怒，当心了！!", "Stormy onSet chat message.")
                // Cold
                .addValue("lang.weather.cold.name", "&9寒潮", "Cold display name.")
                .addValue("lang.weather.cold.message", "&3今天的水很冷", "Cold onSet chat message.")
                // Warm
                .addValue("lang.weather.warm.name", "&e温和日", "Warm display name.")
                .addValue("lang.weather.warm.message", "&e一股温暖的风迎面吹来,这是春风的拥抱 ", "Warm onSet chat message.")
                // Hot
                .addValue("lang.weather.hot.name", "&e炽热", "Hot display name.")
                .addValue("lang.weather.hot.message", "&e今天真的是%seasons:weather% &e你要疯了", "Hot onSet chat message.")
                // Scorching
                .addValue("lang.weather.scorching.name", "&e烈日当空", "Scorching display name.")
                .addValue("lang.weather.scorching.message", "&e阳光灼伤你的皮肤，触摸地面会很痛，这是 %seasons:weather%", "Scorching onSet chat message.")
                // Rainy
                .addValue("lang.weather.rainy.name", "&9雨水", "Rainy display name.")
                .addValue("lang.weather.rainy.message", "&3一场大雨落下，打湿了地面, 这是 %seasons:weather%", "Rainy onSet chat message.")
                // Chilly
                .addValue("lang.weather.chilly.name", "&9霜冻", "Chilly display name.")
                .addValue("lang.weather.chilly.message", "&3霜晶在你周围闪闪发光，你冷的发抖...", "Chilly onSet chat message.")
                // Breezy
                .addValue("lang.weather.breezy.name", "&7回寒", "Breezy display name.")
                .addValue("lang.weather.breezy.message", "&7一股冷风吹来，可能是%seasons:weather%了...", "Breezy onSet chat message.")
                // Beautiful
                .addValue("lang.weather.beautiful.name", "&a完美的一天", "Beautiful display name.")
                .addValue("lang.weather.beautiful.message", "&a今天的阳光真好，温度适宜，简直太完美了", "Beautiful onSet chat message.");

        // CHALLENGES
        content.addHeader("CHALLENGES")
                // Feels good
                .addValue("lang.challenge.feelsGood.message.trigger", "&a微风吹拂你的皮肤感觉真好，感觉身上的盔甲今天应该休息一下...", "Feels Good trigger message.")
                .addValue("lang.challenge.feelsGood.message.get", "&a没有盔甲遮挡,阳光照在你的皮肤上给你能量，感觉很好!", "Feels Good onGet (apply) message.")
                .addValue("lang.challenge.feelsGood.message.remove", "&e当你离开世界时，充满活力的阳光会消失...", "Feels Good remove message.")
                // Fluffy Coat
                .addValue("lang.challenge.fluffyCoat.message.trigger", "&a你的盔甲给你带来舒缓的温暖，让你能抵抗严寒!", "Fluffy Coat trigger message.")
                .addValue("lang.challenge.fluffyCoat.message.get", "&a你的盔甲给你一种舒缓的温暖，让你更能抵抗世界", "Fluffy Coat onGet (apply) message.")
                .addValue("lang.challenge.fluffyCoat.message.remove", "&c没有盔甲，你的身体会再次感受到寒冷，不再抵抗它", "Fluffy Coat remove message.")
                // Primitive Heating
                .addValue("lang.challenge.primitiveHeating.message.trigger", "&9在这种寒冷中随身携带热源会很棒!", "Primitive Heating trigger message.")
                .addValue("lang.challenge.primitiveHeating.message.get", "&a你库存中的热门物品温暖你的心，让你抵抗寒冷的世界", "Primitive Heating onGet (apply) message.")
                .addValue("lang.challenge.primitiveHeating.message.remove", "&e你的身体不再温暖，它的抵抗力也消失了...", "Primitive Heating remove message.")
                // Revitalized
                .addValue("lang.challenge.revitalized.message.trigger", "&a这种天气真是令人振奋!", "Revitalized trigger message.")
                .addValue("lang.challenge.revitalized.message.get", "&a来自这个世界的太阳是如此&eRevitalising&a，它正在使你再生!", "Revitalized onGet (apply) message.")
                .addValue("lang.challenge.revitalized.message.remove", "&e当阳光光离开你的皮肤时，&6Revitalising &eenergy 的效果也会结束...", "Revitalized remove message.")
                // Warming Stew
                .addValue("lang.challenge.warmingStew.message.trigger", "&7你的肚子开始咕咕叫，你开始渴望喝点丰盛的汤...", "Warming Stew trigger message.")
                .addValue("lang.challenge.warmingStew.message.get", "&a恰到好处，美味的炖菜让你的伤口更容易忍受...", "Warming Stew onGet (apply) message.")
                // Wind In Your Boots
                .addValue("lang.challenge.windInYourBoots.message.trigger", "&7您今天感到风向对您有利!", "Wind In Your Boots trigger message.")
                .addValue("lang.challenge.windInYourBoots.message.get", "&a你感觉到一阵风在你的靴子里冲刺，然后向前飞驰!", "Wind In Your Boots onGet (apply) message.")
                // Devastation
                .addValue("lang.challenge.devastation.message.trigger", "&c你的心跳加速，你的双腿颤抖，你发现在这场毁灭过去之前，你无法恢复健康!", "Devastation trigger message.")
                // Frostbite
                .addValue("lang.challenge.frostbite.message.trigger", "&c世界正在冻结，如果你没有穿上盔甲，你也会冻结!", "Frostbite trigger message.")
                // Hold Onto Your Hat
                .addValue("lang.challenge.holdOntoYourHat.message.trigger", "&7小心你的帽子，风要起了...", "Hold Onto Your Hat trigger message.")
                .addValue("lang.challenge.holdOntoYourHat.message.get", "&e你的帽子刚刚被吹掉了!快去捡起来", "Hold Onto Your Hat onGet (apply) message.")
                // Hot Sand
                .addValue("lang.challenge.hotSand.message.trigger", "&e在这种炎热的天气里走在沙子上一定很痛苦!", "Hot Sand trigger message.")
                .addValue("lang.challenge.hotSand.message.get", "&e哎呀！现在的沙子太烫了!", "Hot Sand onGet (apply) message.")
                // Icy
                .addValue("lang.challenge.icy.message.trigger", "&9当水变成冰时，一股寒意顺着你的脊椎流下!", "Icy trigger message.")
                .addValue("lang.challenge.icy.message.get", "&c水桶的水开始结冰...", "Icy onGet (apply) message.")
                // Soldering Iron
                .addValue("lang.challenge.solderingIron.message.trigger", "&e附近的铁器开始发出嘶嘶声，最好暂时放下它...", "Soldering Iron trigger message.")
                .addValue("lang.challenge.solderingIron.message.get", "&c铁器都很烫手，尽量不要握持太久!", "Soldering Iron onGet (apply) message.")
                // Strong Current
                .addValue("lang.challenge.strongCurrent.message.trigger", "&9水流湍急，很难涉水而过!", "Strong Current trigger message.")
                .addValue("lang.challenge.strongCurrent.message.get", "&c水流撞击着你，你的肌肉在痛苦中哭泣...", "Strong Current onGet (apply) message.")
                .addValue("lang.challenge.strongCurrent.message.remove", "&a晕船过去了，海水不再打扰你...", "Strong Current remove message.")
                // Sweating
                .addValue("lang.challenge.sweating.message.trigger", "&e这绝对不是适合穿戴盔甲的天气...", "Sweating trigger message.")
                .addValue("lang.challenge.sweating.message.get", "&c汗水从你的额头滴落，今天穿盔甲太热了...", "Sweating onGet (apply) message.")
                .addValue("lang.challenge.sweating.message.remove", "&a空气变凉，你擦去额头上的汗水...", "Sweating remove message.")
                // The Shivers
                .addValue("lang.challenge.theShivers.message.trigger", "&c今天的水，摸起来很冷...", "The Shivers trigger message.")
                .addValue("lang.challenge.theShivers.message.get", "&cT水冰的像要了你的命，如果你想活下去，就快离开!", "The Shivers onGet (apply) message.")
                // Wet Mud
                .addValue("lang.challenge.wetMud.message.trigger", "&7污垢会覆盖你的靴子，在这种天气里很难行动...", "Wet Mud trigger message.")
                .addValue("lang.challenge.wetMud.message.get", "&e泥巴粘在你的靴子上，让你慢下来...", "Wet Mud onGet (apply) message.");
    }
}
