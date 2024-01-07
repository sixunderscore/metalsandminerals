package net.sixunderscore.metalsandminerals.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.sixunderscore.metalsandminerals.MetalsAndMinerals;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2, 5)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(2, 5)));
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block", new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK)));
    public static final Block PLATINUM_ORE = registerBlock("platinum_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2, 5)));
    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(2, 5)));
    public static final Block JADE_BLOCK = registerBlock("jade_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block JADE_ORE = registerBlock("jade_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2, 5)));
    public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(2, 5)));
    public static final Block TIN_BLOCK = registerBlock("tin_block", new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK)));
    public static final Block TIN_ORE = registerBlock("tin_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2, 5)));
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(2, 5)));
    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block TOPAZ_ORE = registerBlock("topaz_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2, 5)));
    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(2, 5)));
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).strength(20, 900)));
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block", new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).strength(20, 900)));
    public static final Block TITANIUM_DEPOSIT = registerBlock("titanium_deposit", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).strength(15, 800) , UniformIntProvider.create(2, 5)));
    public static final Block TITANIUM_REINFORCED_GLASS = registerBlock("titanium_reinforced_glass", new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).requiresTool().strength(12, 800)));
    public static final Block TITANIUM_REINFORCED_GLASS_PANE = registerBlock("titanium_reinforced_glass_pane", new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).requiresTool().strength(12, 800)));
    public static final Block TITANIUM_DOOR = registerBlock("titanium_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR).strength(20, 900), BlockSetType.IRON));
    public static final Block TITANIUM_TRAPDOOR = registerBlock("titanium_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR).strength(20, 900), BlockSetType.IRON));
    public static final Block PERIDOT_BLOCK = registerBlock("peridot_block", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block PERIDOT_ORE = registerBlock("peridot_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2, 5)));
    public static final Block DEEPSLATE_PERIDOT_ORE = registerBlock("deepslate_peridot_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f), UniformIntProvider.create(2, 5)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MetalsAndMinerals.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MetalsAndMinerals.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        MetalsAndMinerals.LOGGER.info("Registering mod blocks for " + MetalsAndMinerals.MOD_ID);
    }
    public static void renderTransparentBlocks() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TITANIUM_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TITANIUM_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TITANIUM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TITANIUM_TRAPDOOR, RenderLayer.getCutout());
    }
}