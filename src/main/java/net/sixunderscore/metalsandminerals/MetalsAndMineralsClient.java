package net.sixunderscore.metalsandminerals;

import net.fabricmc.api.ClientModInitializer;
import net.sixunderscore.metalsandminerals.block.ModBlocks;

public class MetalsAndMineralsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModBlocks.renderTransparentBlocks();
    }
}
