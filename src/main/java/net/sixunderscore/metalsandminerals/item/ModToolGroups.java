package net.sixunderscore.metalsandminerals.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sixunderscore.metalsandminerals.MetalsAndMinerals;

public class ModToolGroups {
    public static final ItemGroup TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MetalsAndMinerals.MOD_ID, "ruby_pickaxe"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tools"))
                    .icon(() -> new ItemStack(ModItems.RUBY_PICKAXE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.JADE_SWORD);
                        entries.add(ModItems.JADE_SHOVEL);
                        entries.add(ModItems.JADE_PICKAXE);
                        entries.add(ModItems.JADE_AXE);
                        entries.add(ModItems.JADE_HOE);
                        entries.add(ModItems.PLATINUM_SWORD);
                        entries.add(ModItems.PLATINUM_SHOVEL);
                        entries.add(ModItems.PLATINUM_PICKAXE);
                        entries.add(ModItems.PLATINUM_AXE);
                        entries.add(ModItems.PLATINUM_HOE);
                        entries.add(ModItems.TIN_SWORD);
                        entries.add(ModItems.TIN_SHOVEL);
                        entries.add(ModItems.TIN_PICKAXE);
                        entries.add(ModItems.TIN_AXE);
                        entries.add(ModItems.TIN_HOE);
                        entries.add(ModItems.TOPAZ_SWORD);
                        entries.add(ModItems.TOPAZ_SHOVEL);
                        entries.add(ModItems.TOPAZ_PICKAXE);
                        entries.add(ModItems.TOPAZ_AXE);
                        entries.add(ModItems.TOPAZ_HOE);
                        entries.add(ModItems.PERIDOT_SWORD);
                        entries.add(ModItems.PERIDOT_SHOVEL);
                        entries.add(ModItems.PERIDOT_PICKAXE);
                        entries.add(ModItems.PERIDOT_AXE);
                        entries.add(ModItems.PERIDOT_HOE);
                        entries.add(ModItems.SPINEL_SWORD);
                        entries.add(ModItems.SPINEL_SHOVEL);
                        entries.add(ModItems.SPINEL_PICKAXE);
                        entries.add(ModItems.SPINEL_AXE);
                        entries.add(ModItems.SPINEL_HOE);
                        entries.add(ModItems.CITRINE_SWORD);
                        entries.add(ModItems.CITRINE_SHOVEL);
                        entries.add(ModItems.CITRINE_PICKAXE);
                        entries.add(ModItems.CITRINE_AXE);
                        entries.add(ModItems.CITRINE_HOE);
                        entries.add(ModItems.AQUAMARINE_SWORD);
                        entries.add(ModItems.AQUAMARINE_SHOVEL);
                        entries.add(ModItems.AQUAMARINE_PICKAXE);
                        entries.add(ModItems.AQUAMARINE_AXE);
                        entries.add(ModItems.AQUAMARINE_HOE);
                        entries.add(ModItems.PLATINUM_UPGRADED_DIAMOND_SWORD);
                        entries.add(ModItems.PLATINUM_UPGRADED_DIAMOND_AXE);
                        entries.add(ModItems.PLATINUM_UPGRADED_NETHERITE_SWORD);
                        entries.add(ModItems.PLATINUM_UPGRADED_NETHERITE_AXE);
                    }).build());
    public static void  registerToolGroups() {
        MetalsAndMinerals.LOGGER.info("Registering tool groups for " + MetalsAndMinerals.MOD_ID);
    }
}