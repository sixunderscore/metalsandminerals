package net.sixunderscore.metalsandminerals;

import net.fabricmc.api.ModInitializer;
import net.sixunderscore.metalsandminerals.block.ModBlockGroups;
import net.sixunderscore.metalsandminerals.block.ModBlocks;
import net.sixunderscore.metalsandminerals.item.ModArmorGroups;
import net.sixunderscore.metalsandminerals.item.ModItemGroups;
import net.sixunderscore.metalsandminerals.item.ModItems;
import net.sixunderscore.metalsandminerals.item.ModToolGroups;
import net.sixunderscore.metalsandminerals.world.ModLootTableModifiers;
import net.sixunderscore.metalsandminerals.world.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetalsAndMinerals implements ModInitializer {
	public static final String MOD_ID = "metalsandminerals";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlockGroups.registerBlockGroups();
		ModBlocks.registerModBlocks();
		ModToolGroups.registerToolGroups();
		ModArmorGroups.registerArmorGroups();
		ModOreGeneration.generateOres();
		ModLootTableModifiers.modifyLootTables();
	}
}