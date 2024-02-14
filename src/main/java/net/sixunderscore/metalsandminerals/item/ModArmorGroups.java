package net.sixunderscore.metalsandminerals.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sixunderscore.metalsandminerals.MetalsAndMinerals;

public class ModArmorGroups {
    public static final ItemGroup ARMOR_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MetalsAndMinerals.MOD_ID, "ruby_chestplate"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.armor"))
                    .icon(() -> new ItemStack(ModItems.RUBY_CHESTPLATE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);
                        entries.add(ModItems.JADE_HELMET);
                        entries.add(ModItems.JADE_CHESTPLATE);
                        entries.add(ModItems.JADE_LEGGINGS);
                        entries.add(ModItems.JADE_BOOTS);
                        entries.add(ModItems.PLATINUM_HELMET);
                        entries.add(ModItems.PLATINUM_CHESTPLATE);
                        entries.add(ModItems.PLATINUM_LEGGINGS);
                        entries.add(ModItems.PLATINUM_BOOTS);
                        entries.add(ModItems.TIN_HELMET);
                        entries.add(ModItems.TIN_CHESTPLATE);
                        entries.add(ModItems.TIN_LEGGINGS);
                        entries.add(ModItems.TIN_BOOTS);
                        entries.add(ModItems.TOPAZ_HELMET);
                        entries.add(ModItems.TOPAZ_CHESTPLATE);
                        entries.add(ModItems.TOPAZ_LEGGINGS);
                        entries.add(ModItems.TOPAZ_BOOTS);
                        entries.add(ModItems.PERIDOT_HELMET);
                        entries.add(ModItems.PERIDOT_CHESTPLATE);
                        entries.add(ModItems.PERIDOT_LEGGINGS);
                        entries.add(ModItems.PERIDOT_BOOTS);
                        entries.add(ModItems.SPINEL_HELMET);
                        entries.add(ModItems.SPINEL_CHESTPLATE);
                        entries.add(ModItems.SPINEL_LEGGINGS);
                        entries.add(ModItems.SPINEL_BOOTS);
                        entries.add(ModItems.CITRINE_HELMET);
                        entries.add(ModItems.CITRINE_CHESTPLATE);
                        entries.add(ModItems.CITRINE_LEGGINGS);
                        entries.add(ModItems.CITRINE_BOOTS);
                        entries.add(ModItems.AQUAMARINE_HELMET);
                        entries.add(ModItems.AQUAMARINE_CHESTPLATE);
                        entries.add(ModItems.AQUAMARINE_LEGGINGS);
                        entries.add(ModItems.AQUAMARINE_BOOTS);
                        entries.add(ModItems.TITANIUM_REINFORCED_NETHERITE_HELMET);
                        entries.add(ModItems.TITANIUM_REINFORCED_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_REINFORCED_NETHERITE_LEGGINGS);
                        entries.add(ModItems.TITANIUM_REINFORCED_NETHERITE_BOOTS);
                    }).build());
    public static void registerArmorGroups() {
        MetalsAndMinerals.LOGGER.info("Registering armor groups for " + MetalsAndMinerals.MOD_ID);
    }
}