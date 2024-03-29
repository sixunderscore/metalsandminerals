package net.sixunderscore.metalsandminerals.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Rarity;
import net.sixunderscore.metalsandminerals.MetalsAndMinerals;
import net.sixunderscore.metalsandminerals.item.custom.ModTotemItem;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY, 3, -2.4f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item RUBY_PICKAXE= registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterial.RUBY, 1, -2.8f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(ModToolMaterial.RUBY, 5.5f, -3.0f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterial.RUBY, -2, -1.0f, new FabricItemSettings()));
    public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item RAW_PLATINUM = registerItem("raw_platinum", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_APPLE = registerItem("platinum_apple", new Item(new FabricItemSettings().rarity(Rarity.RARE).food(ModFoodComponents.PLATINUM_APPLE)));
    public static final Item PLATINUM_ROD = registerItem("platinum_rod", new Item(new FabricItemSettings()));
    public static final Item PLATINUM_UPGRADE_SMITHING_TEMPLATE = registerItem("platinum_upgrade_smithing_template", ModSmithingTemplateItem.createPlatinumUpgrade());
    public static final Item PLATINUM_SWORD = registerItem("platinum_sword", new SwordItem(ModToolMaterial.PLATINUM, 3, -2.4f, new FabricItemSettings()));
    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel", new ShovelItem(ModToolMaterial.PLATINUM, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item PLATINUM_PICKAXE= registerItem("platinum_pickaxe", new PickaxeItem(ModToolMaterial.PLATINUM, 1, -2.8f, new FabricItemSettings()));
    public static final Item PLATINUM_AXE = registerItem("platinum_axe", new AxeItem(ModToolMaterial.PLATINUM, 6.0f, -3.0f, new FabricItemSettings()));
    public static final Item PLATINUM_HOE = registerItem("platinum_hoe", new HoeItem(ModToolMaterial.PLATINUM, 0, -3.0f, new FabricItemSettings()));
    public static final Item PLATINUM_HELMET = registerItem("platinum_helmet", new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PLATINUM_CHESTPLATE = registerItem("platinum_chestplate", new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PLATINUM_LEGGINGS = registerItem("platinum_leggings", new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PLATINUM_BOOTS = registerItem("platinum_boots", new ArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item JADE = registerItem("jade", new Item(new FabricItemSettings()));
    public static final Item JADE_SWORD = registerItem("jade_sword", new SwordItem(ModToolMaterial.JADE, 3, -2.4f, new FabricItemSettings()));
    public static final Item JADE_SHOVEL = registerItem("jade_shovel", new ShovelItem(ModToolMaterial.JADE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item JADE_PICKAXE= registerItem("jade_pickaxe", new PickaxeItem(ModToolMaterial.JADE, 1, -2.8f, new FabricItemSettings()));
    public static final Item JADE_AXE = registerItem("jade_axe", new AxeItem(ModToolMaterial.JADE, 5, -3.0f, new FabricItemSettings()));
    public static final Item JADE_HOE = registerItem("jade_hoe", new HoeItem(ModToolMaterial.JADE, -3, 0.0f, new FabricItemSettings()));
    public static final Item JADE_HELMET = registerItem("jade_helmet", new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item JADE_CHESTPLATE = registerItem("jade_chestplate", new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item JADE_LEGGINGS = registerItem("jade_leggings", new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item JADE_BOOTS = registerItem("jade_boots", new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item TIN_SWORD = registerItem("tin_sword", new SwordItem(ModToolMaterial.TIN, 3, -2.4f, new FabricItemSettings()));
    public static final Item TIN_SHOVEL = registerItem("tin_shovel", new ShovelItem(ModToolMaterial.TIN, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item TIN_PICKAXE= registerItem("tin_pickaxe", new PickaxeItem(ModToolMaterial.TIN, 1, -2.8f, new FabricItemSettings()));
    public static final Item TIN_AXE = registerItem("tin_axe", new AxeItem(ModToolMaterial.TIN, 6.5f, -3.1f, new FabricItemSettings()));
    public static final Item TIN_HOE = registerItem("tin_hoe", new HoeItem(ModToolMaterial.TIN, -1, -2.0f, new FabricItemSettings()));
    public static final Item TIN_HELMET = registerItem("tin_helmet", new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TIN_CHESTPLATE = registerItem("tin_chestplate", new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TIN_LEGGINGS = registerItem("tin_leggings", new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TIN_BOOTS = registerItem("tin_boots", new ArmorItem(ModArmorMaterials.TIN, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item TOPAZ = registerItem("topaz", new Item(new FabricItemSettings()));
    public static final Item TOPAZ_SWORD = registerItem("topaz_sword", new SwordItem(ModToolMaterial.TOPAZ, 3, -2.4f, new FabricItemSettings()));
    public static final Item TOPAZ_SHOVEL = registerItem("topaz_shovel", new ShovelItem(ModToolMaterial.TOPAZ, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item TOPAZ_PICKAXE= registerItem("topaz_pickaxe", new PickaxeItem(ModToolMaterial.TOPAZ, 1, -2.8f, new FabricItemSettings()));
    public static final Item TOPAZ_AXE = registerItem("topaz_axe", new AxeItem(ModToolMaterial.TOPAZ, 5.3f, -3.0f, new FabricItemSettings()));
    public static final Item TOPAZ_HOE = registerItem("topaz_hoe", new HoeItem(ModToolMaterial.TOPAZ, -2, -1.0f, new FabricItemSettings()));
    public static final Item TOPAZ_HELMET = registerItem("topaz_helmet", new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TOPAZ_CHESTPLATE = registerItem("topaz_chestplate", new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TOPAZ_LEGGINGS = registerItem("topaz_leggings", new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TOPAZ_BOOTS = registerItem("topaz_boots", new ArmorItem(ModArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_APPLE = registerItem("titanium_apple", new Item(new FabricItemSettings().rarity(Rarity.RARE).food(ModFoodComponents.TITANIUM_APPLE)));
    public static final Item TITANIUM_PLATE = registerItem("titanium_plate", new Item(new FabricItemSettings()));
    public static final Item TITANIUM_UPGRADE_SMITHING_TEMPLATE = registerItem("titanium_upgrade_smithing_template", ModSmithingTemplateItem.createTitaniumUpgrade());
    public static final Item PERIDOT = registerItem("peridot", new Item(new FabricItemSettings()));
    public static final Item PERIDOT_SWORD = registerItem("peridot_sword", new SwordItem(ModToolMaterial.PERIDOT, 3, -2.4f, new FabricItemSettings()));
    public static final Item PERIDOT_SHOVEL = registerItem("peridot_shovel", new ShovelItem(ModToolMaterial.PERIDOT, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item PERIDOT_PICKAXE= registerItem("peridot_pickaxe", new PickaxeItem(ModToolMaterial.PERIDOT, 1, -2.8f, new FabricItemSettings()));
    public static final Item PERIDOT_AXE = registerItem("peridot_axe", new AxeItem(ModToolMaterial.PERIDOT, 5, -3.0f, new FabricItemSettings()));
    public static final Item PERIDOT_HOE = registerItem("peridot_hoe", new HoeItem(ModToolMaterial.PERIDOT, -3, 0.0f, new FabricItemSettings()));
    public static final Item PERIDOT_HELMET = registerItem("peridot_helmet", new ArmorItem(ModArmorMaterials.PERIDOT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PERIDOT_CHESTPLATE = registerItem("peridot_chestplate", new ArmorItem(ModArmorMaterials.PERIDOT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item PERIDOT_LEGGINGS = registerItem("peridot_leggings", new ArmorItem(ModArmorMaterials.PERIDOT, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PERIDOT_BOOTS = registerItem("peridot_boots", new ArmorItem(ModArmorMaterials.PERIDOT, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item SPINEL = registerItem("spinel", new Item(new FabricItemSettings()));
    public static final Item SPINEL_SWORD = registerItem("spinel_sword", new SwordItem(ModToolMaterial.SPINEL, 3, -2.4f, new FabricItemSettings()));
    public static final Item SPINEL_SHOVEL = registerItem("spinel_shovel", new ShovelItem(ModToolMaterial.SPINEL, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item SPINEL_PICKAXE= registerItem("spinel_pickaxe", new PickaxeItem(ModToolMaterial.SPINEL, 1, -2.8f, new FabricItemSettings()));
    public static final Item SPINEL_AXE = registerItem("spinel_axe", new AxeItem(ModToolMaterial.SPINEL, 5.7f, -3.0f, new FabricItemSettings()));
    public static final Item SPINEL_HOE = registerItem("spinel_hoe", new HoeItem(ModToolMaterial.SPINEL, -2, -1.0f, new FabricItemSettings()));
    public static final Item SPINEL_HELMET = registerItem("spinel_helmet", new ArmorItem(ModArmorMaterials.SPINEL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SPINEL_CHESTPLATE = registerItem("spinel_chestplate", new ArmorItem(ModArmorMaterials.SPINEL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SPINEL_LEGGINGS = registerItem("spinel_leggings", new ArmorItem(ModArmorMaterials.SPINEL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SPINEL_BOOTS = registerItem("spinel_boots", new ArmorItem(ModArmorMaterials.SPINEL, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item CITRINE = registerItem("citrine", new Item(new FabricItemSettings()));
    public static final Item CITRINE_SWORD = registerItem("citrine_sword", new SwordItem(ModToolMaterial.CITRINE, 3, -2.4f, new FabricItemSettings()));
    public static final Item CITRINE_SHOVEL = registerItem("citrine_shovel", new ShovelItem(ModToolMaterial.CITRINE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item CITRINE_PICKAXE= registerItem("citrine_pickaxe", new PickaxeItem(ModToolMaterial.CITRINE, 1, -2.8f, new FabricItemSettings()));
    public static final Item CITRINE_AXE = registerItem("citrine_axe", new AxeItem(ModToolMaterial.CITRINE, 6.5f, -3.1f, new FabricItemSettings()));
    public static final Item CITRINE_HOE = registerItem("citrine_hoe", new HoeItem(ModToolMaterial.CITRINE, -1, -2.0f, new FabricItemSettings()));
    public static final Item CITRINE_HELMET = registerItem("citrine_helmet", new ArmorItem(ModArmorMaterials.CITRINE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item CITRINE_CHESTPLATE = registerItem("citrine_chestplate", new ArmorItem(ModArmorMaterials.CITRINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item CITRINE_LEGGINGS = registerItem("citrine_leggings", new ArmorItem(ModArmorMaterials.CITRINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item CITRINE_BOOTS = registerItem("citrine_boots", new ArmorItem(ModArmorMaterials.CITRINE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item AQUAMARINE = registerItem("aquamarine", new Item(new FabricItemSettings()));
    public static final Item AQUAMARINE_SWORD = registerItem("aquamarine_sword", new SwordItem(ModToolMaterial.AQUAMARINE, 3, -2.4f, new FabricItemSettings()));
    public static final Item AQUAMARINE_SHOVEL = registerItem("aquamarine_shovel", new ShovelItem(ModToolMaterial.AQUAMARINE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item AQUAMARINE_PICKAXE= registerItem("aquamarine_pickaxe", new PickaxeItem(ModToolMaterial.AQUAMARINE, 1, -2.8f, new FabricItemSettings()));
    public static final Item AQUAMARINE_AXE = registerItem("aquamarine_axe", new AxeItem(ModToolMaterial.AQUAMARINE, 5.5f, -3.0f, new FabricItemSettings()));
    public static final Item AQUAMARINE_HOE = registerItem("aquamarine_hoe", new HoeItem(ModToolMaterial.AQUAMARINE, -2, -1.0f, new FabricItemSettings()));
    public static final Item AQUAMARINE_HELMET = registerItem("aquamarine_helmet", new ArmorItem(ModArmorMaterials.AQUAMARINE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AQUAMARINE_CHESTPLATE = registerItem("aquamarine_chestplate", new ArmorItem(ModArmorMaterials.AQUAMARINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AQUAMARINE_LEGGINGS = registerItem("aquamarine_leggings", new ArmorItem(ModArmorMaterials.AQUAMARINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AQUAMARINE_BOOTS = registerItem("aquamarine_boots", new ArmorItem(ModArmorMaterials.AQUAMARINE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item EMPTY_TOTEM = registerItem("empty_totem", new Item(new FabricItemSettings()));
    public static final Item JADE_TOTEM = registerItem("jade_totem", new ModTotemItem(StatusEffects.LUCK, 1, new FabricItemSettings().maxCount(1)));
    public static final Item PLATINUM_TOTEM = registerItem("platinum_totem", new ModTotemItem(StatusEffects.SPEED, 0, new FabricItemSettings().maxCount(1)));
    public static final Item TITANIUM_TOTEM = registerItem("titanium_totem", new ModTotemItem(StatusEffects.RESISTANCE, 0, new FabricItemSettings().maxCount(1)));
    public static final Item AQUAMARINE_TOTEM = registerItem("aquamarine_totem", new ModTotemItem(StatusEffects.WATER_BREATHING, 0, new FabricItemSettings().maxCount(1)));
    public static final Item PLATINUM_UPGRADED_DIAMOND_SWORD = registerItem("platinum_upgraded_diamond_sword", new SwordItem(ToolMaterials.DIAMOND, 3, -2.1f, new FabricItemSettings()));
    public static final Item PLATINUM_UPGRADED_DIAMOND_AXE = registerItem("platinum_upgraded_diamond_axe", new AxeItem(ToolMaterials.DIAMOND, 5.0f, -2.7f, new FabricItemSettings()));
    public static final Item PLATINUM_UPGRADED_NETHERITE_SWORD = registerItem("platinum_upgraded_netherite_sword", new SwordItem(ToolMaterials.NETHERITE, 3, -2.1f, new FabricItemSettings()));
    public static final Item PLATINUM_UPGRADED_NETHERITE_AXE = registerItem("platinum_upgraded_netherite_axe", new AxeItem(ToolMaterials.NETHERITE, 5.0f, -2.7f, new FabricItemSettings()));
    public static final Item TITANIUM_REINFORCED_NETHERITE_HELMET = registerItem("titanium_reinforced_netherite_helmet", new ArmorItem(ModArmorMaterials.TITANIUM_REINFORCED_NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item TITANIUM_REINFORCED_NETHERITE_CHESTPLATE = registerItem("titanium_reinforced_netherite_chestplate", new ArmorItem(ModArmorMaterials.TITANIUM_REINFORCED_NETHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item TITANIUM_REINFORCED_NETHERITE_LEGGINGS = registerItem("titanium_reinforced_netherite_leggings", new ArmorItem(ModArmorMaterials.TITANIUM_REINFORCED_NETHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item TITANIUM_REINFORCED_NETHERITE_BOOTS = registerItem("titanium_reinforced_netherite_boots", new ArmorItem(ModArmorMaterials.TITANIUM_REINFORCED_NETHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    
    public static void registerModItems() {
        MetalsAndMinerals.LOGGER.info("Registering mod items for " + MetalsAndMinerals.MOD_ID);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MetalsAndMinerals.MOD_ID, name), item);
    }
}