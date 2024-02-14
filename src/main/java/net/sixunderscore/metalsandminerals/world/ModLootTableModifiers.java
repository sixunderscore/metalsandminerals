package net.sixunderscore.metalsandminerals.world;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.sixunderscore.metalsandminerals.item.ModItems;
import java.util.ArrayList;

public class ModLootTableModifiers {
    private static final Identifier SIMPLE_DUNGEON_ID = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier ABANDONED_MINESHAFT_ID = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier DESERT_PYRAMID_ID = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier VILLAGE_TOOLSMITH_ID = new Identifier("minecraft", "chests/village/village_toolsmith");
    private static final Identifier VILLAGE_WEAPONSMITH_ID = new Identifier("minecraft", "chests/village/village_weaponsmith");
    private static final Identifier STRONGHOLD_CORRIDOR_ID = new Identifier("minecraft", "chests/stronghold_corridor");
    private static final Identifier STRONGHOLD_CROSSING_ID = new Identifier("minecraft", "chests/stronghold_crossing");
    static ArrayList<Identifier> chestIds = new ArrayList<>();

    private static void modifyLootTable(Identifier lootTableId, float chance, Item item, float maxCount) {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (lootTableId.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(chance))
                        .with(ItemEntry.builder(item))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, maxCount)).build());
                tableBuilder.pool(poolBuilder);
            }
        });
    }
    public static void modifyLootTables() {
        chestIds.add(STRONGHOLD_CORRIDOR_ID);
        chestIds.add(STRONGHOLD_CROSSING_ID);
        chestIds.add(VILLAGE_TOOLSMITH_ID);
        chestIds.add(VILLAGE_WEAPONSMITH_ID);
        chestIds.add(SIMPLE_DUNGEON_ID);
        chestIds.add(ABANDONED_MINESHAFT_ID);
        chestIds.add(DESERT_PYRAMID_ID);
        for (Identifier chestId : chestIds) {
            if (chestId.equals(STRONGHOLD_CORRIDOR_ID) || chestId.equals(STRONGHOLD_CROSSING_ID)) {
                modifyLootTable(chestId, 0.25f, ModItems.PLATINUM_APPLE, 1.0f);
                modifyLootTable(chestId, 0.2f, ModItems.TITANIUM_APPLE, 1.0f);
            } else if (chestId.equals(VILLAGE_TOOLSMITH_ID) || chestId.equals(VILLAGE_WEAPONSMITH_ID)) {
                modifyLootTable(chestId, 0.25f, ModItems.PLATINUM_INGOT, 2.0f);
                modifyLootTable(chestId, 0.25f, ModItems.TITANIUM_INGOT, 2.0f);
                modifyLootTable(chestId, 0.3f, ModItems.TIN_INGOT, 2.0f);
                modifyLootTable(chestId, 0.2f, ModItems.RUBY, 1.0f);
                modifyLootTable(chestId, 0.15f, ModItems.JADE, 1.0f);
                modifyLootTable(chestId, 0.15f, ModItems.TOPAZ, 1.0f);
                modifyLootTable(chestId, 0.15f, ModItems.PERIDOT, 1.0f);
                modifyLootTable(chestId, 0.2f, ModItems.SPINEL, 1.0f);
                modifyLootTable(chestId, 0.2f, ModItems.TIN_AXE, 1.0f);
                modifyLootTable(chestId, 0.2f, ModItems.TIN_PICKAXE, 1.0f);
                modifyLootTable(chestId, 0.2f, ModItems.TIN_SWORD, 1.0f);
                modifyLootTable(chestId, 0.12f, ModItems.PLATINUM_UPGRADE_SMITHING_TEMPLATE, 1.0f);
                modifyLootTable(chestId, 0.12f, ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE, 1.0f);
            } else {
                modifyLootTable(chestId, 0.2f, ModItems.PLATINUM_APPLE, 1.0f);
                modifyLootTable(chestId, 0.18f, ModItems.TITANIUM_APPLE, 1.0f);
                modifyLootTable(chestId, 0.25f, ModItems.PLATINUM_INGOT, 2.0f);
                modifyLootTable(chestId, 0.25f, ModItems.TITANIUM_INGOT, 2.0f);
                modifyLootTable(chestId, 0.3f, ModItems.TIN_INGOT, 2.0f);
                modifyLootTable(chestId, 0.23f, ModItems.RUBY, 1.0f);
                modifyLootTable(chestId, 0.18f, ModItems.JADE, 1.0f);
                modifyLootTable(chestId, 0.18f, ModItems.TOPAZ, 1.0f);
                modifyLootTable(chestId, 0.18f, ModItems.PERIDOT, 1.0f);
                modifyLootTable(chestId, 0.23f, ModItems.SPINEL, 1.0f);
                modifyLootTable(chestId, 0.15f, ModItems.EMPTY_TOTEM, 1.0f);
                modifyLootTable(chestId, 0.16f, ModItems.PLATINUM_UPGRADE_SMITHING_TEMPLATE, 1.0f);
                modifyLootTable(chestId, 0.16f, ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE, 1.0f);
            }
        }
    }
}