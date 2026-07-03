package net.tbbtly.emeraldequipment;

import net.fabricmc.api.ModInitializer;

import net.tbbtly.emeraldequipment.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmeraldEquipment implements ModInitializer {
	public static final String MOD_ID = "emerald-equipment";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Emerald Equipment Initialized.");
		ModItems.registerModItems();

	}
}
