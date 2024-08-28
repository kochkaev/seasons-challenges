# Seasons Challenges

Differentiate your gameplay by adding **new weather** depending on the current season, and **weather-set Challenges** that you have to complete throughout the day!

## How does it work?
When a new day arrives, new weather specific to the current season is set, and weather-specific Challenges are set. For instance, in summer, when the "scorching" weather arrives, you can't hold metal objects in your hands or walk on sand without taking damage.

***

## What's in this extension for the Seasons API?
### Seasons:
- **Winter**;
- **Spring**;
- **Summer**;
- **Fall**.
### Weather:
- **Beautiful** _(Spring and Summer, clear)_;
- **Breezy** _(Spring and Fall, clear)_;
- **Chilly** _(Spring, clear)_;
- **Cold** _(Fall, clear)_;
- **Freezing** _(Winter, clear)_;
- **Hot** _(Summer, clear)_;
- **Night** _(All seasons, depends on previous weather)_;
- **Rainy** _(Spring and Fall, rainy)_;
- **Scorching** _(Summer, clear)_;
- **Snowy** _(Winter, rainy)_;
- **Stormy** _(Fall, thunderstorms)_;
- **Warm** _(Summer, clear)_.
### Challenges:
- **Devastation** _(Stormy)_ - Disables regeneration with no regeneration effect.
- **Feels Good** _(Warm)_ - gives a speed effect if you is not wearing armor.
- **Fluffy Coat** _(Snowy)_ - gives a resistance effect if you is not wearing armor.
- **Frostbite** _(Snowy and Freezing)_ - gives an froze effect if you in the water or not wearing armor.
- **Hold Onto Your Hat** _(Breezy)_ - drops your leather helmet with some probability.
- **Hot Sand** _(Scorching)_ - Hits you when you stand on sand.
- **Icy** _(Freezing)_ - prevents you from pouring and emptying a bucket of water.
- **Primitive Heating** _(Cold)_ - gives a resistance effect if you have something hot in your inventory.
- **Revitalized** _(Beautiful)_ - gives a regeneration effect if you is in overworld.
- **Soldering Iron** _(Scorching)_ - Hits you when you hold iron.
- **Strong Current** _(Stormy)_ - Sinks your boats and gives you fatigue and nausea effects when you are in the water.
- **Sweating** _(Hot)_ - Hits you and imposes a fatigue effect when you is fully armored.
- **The Shivers** _(Chilly)_ - deals damage to you when in water.
- **Warming Stew** _(Cold)_ - gives a regeneration effect when you eat any soup or stew.
- **Wet Mud** _(Rainy)_ - slows you down when you walk on the ground.
- **Wind In Your Boots** _(Breezy)_ - gives you a speed effect with some chance.

## Command Syntax:
- `/seasons get season` - get current season.
- `/seasons get weather` - get the current weather.
- `/seasons get lang` - get the currently set language.
- `/seasons get challenges` - get the list of active challenges.
- `/seasons set season <season>` - set season.
- `/seasons set weather <weather>` - set weather.
- `/seasons set lang <language>` - set language.
- `/seasons set challenge <forceAllow | forceDisable> <challenge>` - force start or end a challenge.
- `/seasons reload` - reload configs.

***

## Additional info
### Links
- [Sources](https://github.com/kochkaev/seasons-challenges)
- [Issues](https://github.com/kochkaev/seasons-challenges/issues)
- [Modrinth](https://modrinth.com/mod/seasons-challenges)
### Dependencieses
- [Seasons API](https://modrinth.com/mod/seasons-api) (Required)
- [Fabric API](https://modrinth.com/mod/fabric-api) (Required)
- [Text Placeholder API](https://modrinth.com/mod/placeholder-api) (Optional)
### Idea by Harieo
- Harieo on GitHub: https://github.com/Harieo/
- Original plugin on GitHub: https://github.com/Harieo/Seasons/
- Original plugin on SpigotMC: https://www.spigotmc.org/resources/seasons.39298/
### Created by kochkaev
- GitHub: https://github.com/kochkaev/
- VK: https://vk.com/kleverdi/
- YouTube: https://youtube.com/@kochkaev/
- Contact email: kleverdi@vk.com
### WARN: It's only server-side mod.