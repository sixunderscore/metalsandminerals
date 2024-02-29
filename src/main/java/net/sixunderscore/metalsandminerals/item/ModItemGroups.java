package net.sixunderscore.metalsandminerals.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sixunderscore.metalsandminerals.MetalsAndMinerals;

public class ModItemGroups {
    public static final ItemGroup MATERIALS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MetalsAndMinerals.MOD_ID, "ruby"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.materials"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_PLATINUM);
                        entries.add(ModItems.PLATINUM_INGOT);
                        entries.add(ModItems.PLATINUM_APPLE);
                        entries.add(ModItems.PLATINUM_ROD);
                        entries.add(ModItems.PLATINUM_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.JADE);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.TOPAZ);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.TITANIUM_APPLE);
                        entries.add(ModItems.TITANIUM_PLATE);
                        entries.add(ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.PERIDOT);
                        entries.add(ModItems.SPINEL);
                        entries.add(ModItems.CITRINE);
                        entries.add(ModItems.AQUAMARINE);
                        entries.add(ModItems.EMPTY_TOTEM);
                        entries.add(ModItems.JADE_TOTEM);
                        entries.add(ModItems.PLATINUM_TOTEM);
                        entries.add(ModItems.TITANIUM_TOTEM);
                        entries.add(ModItems.AQUAMARINE_TOTEM);
                    }).build());
    public static void registerItemGroups() {
        MetalsAndMinerals.LOGGER.info("Registering item groups for " + MetalsAndMinerals.MOD_ID);
    }
}
