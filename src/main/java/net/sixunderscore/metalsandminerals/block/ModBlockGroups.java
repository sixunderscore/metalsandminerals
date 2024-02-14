package net.sixunderscore.metalsandminerals.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sixunderscore.metalsandminerals.MetalsAndMinerals;
import net.sixunderscore.metalsandminerals.item.ModItems;

public class ModBlockGroups {
    public static final ItemGroup BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MetalsAndMinerals.MOD_ID, "ruby_block"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blocks"))
                    .icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.PLATINUM_BLOCK);
                        entries.add(ModBlocks.RAW_PLATINUM_BLOCK);
                        entries.add(ModBlocks.PLATINUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);
                        entries.add(ModBlocks.JADE_BLOCK);
                        entries.add(ModBlocks.JADE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_JADE_ORE);
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModBlocks.TOPAZ_BLOCK);
                        entries.add(ModBlocks.TOPAZ_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TOPAZ_ORE);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_DEPOSIT);
                        entries.add(ModBlocks.TITANIUM_REINFORCED_GLASS);
                        entries.add(ModBlocks.TITANIUM_REINFORCED_GLASS_PANE);
                        entries.add(ModBlocks.TITANIUM_DOOR);
                        entries.add(ModBlocks.TITANIUM_TRAPDOOR);
                        entries.add(ModBlocks.PERIDOT_BLOCK);
                        entries.add(ModBlocks.PERIDOT_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PERIDOT_ORE);
                        entries.add(ModBlocks.SPINEL_BLOCK);
                        entries.add(ModBlocks.SPINEL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SPINEL_ORE);
                        entries.add(ModBlocks.CITRINE_BLOCK);
                        entries.add(ModBlocks.CITRINE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_CITRINE_ORE);
                        entries.add(ModBlocks.AQUAMARINE_BLOCK);
                        entries.add(ModBlocks.AQUAMARINE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_AQUAMARINE_ORE);
                    }).build());
    public static void registerBlockGroups() {
        MetalsAndMinerals.LOGGER.info("Registering block groups for " + MetalsAndMinerals.MOD_ID);
    }
}