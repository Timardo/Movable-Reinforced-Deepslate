package net.timardo.movablereinforceddeepslate;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MovableReinforcedDeepslate implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("movablereinforceddeepslate");

    @Override
    public void onInitialize() {
        LOGGER.info("Doing what Mojang should have done. Making Reinforced Deepslate movable by pistons");
    }
}
