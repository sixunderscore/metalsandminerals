package net.sixunderscore.metalsandminerals.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    RUBY(MiningLevels.IRON, 500, 7.0f, 2.5f, 12, () -> Ingredient.ofItems(ModItems.RUBY)),
    JADE(MiningLevels.DIAMOND, 650, 8.0f, 3.0f, 14, () -> Ingredient.ofItems(ModItems.JADE)),
    TIN(MiningLevels.STONE, 180, 5.0f, 1.5f, 7, () -> Ingredient.ofItems(ModItems.TIN_INGOT)),
    TOPAZ(MiningLevels.IRON, 580, 7.5f, 2.7f, 13, () -> Ingredient.ofItems(ModItems.TOPAZ)),
    PERIDOT(MiningLevels.DIAMOND, 800, 8.0f, 3.0f, 15, () -> Ingredient.ofItems(ModItems.PERIDOT))
    ;
    private final int mininglevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;
    ModToolMaterial(int mininglevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.mininglevel = mininglevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }
    @Override
    public int getDurability() {
        return this.itemDurability;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }
    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }
    @Override
    public int getMiningLevel() {
        return this.mininglevel;
    }
    @Override
    public int getEnchantability() {
        return this.enchantability;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
