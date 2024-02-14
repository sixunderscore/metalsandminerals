package net.sixunderscore.metalsandminerals.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.sixunderscore.metalsandminerals.MetalsAndMinerals;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    RUBY("ruby", 20, new int[] { 2, 7, 5, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0, 0, () -> Ingredient.ofItems(ModItems.RUBY)),
    JADE("jade", 25, new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0, 0, () -> Ingredient.ofItems(ModItems.JADE)),
    PLATINUM("platinum", 7, new int[] { 2, 5, 3, 1 }, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0, 0, () -> Ingredient.ofItems(ModItems.PLATINUM_INGOT)),
    TIN("tin", 10, new int[] { 2, 5, 4, 1 }, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0, 0, () -> Ingredient.ofItems(ModItems.TIN_INGOT)),
    TOPAZ("topaz", 22, new int[] { 3, 7, 6, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0, 0, () -> Ingredient.ofItems(ModItems.TOPAZ)),
    PERIDOT("peridot", 25, new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f, 0, () -> Ingredient.ofItems(ModItems.PERIDOT)),
    SPINEL("spinel", 17, new int[] { 2, 7, 5, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0, 0, () -> Ingredient.ofItems(ModItems.SPINEL)),
    CITRINE("citrine", 12, new int[] { 2, 5, 4, 2 }, 11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0, 0, () -> Ingredient.ofItems(ModItems.CITRINE)),
    AQUAMARINE("aquamarine", 22, new int[] { 2, 7, 5, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0, 0, () -> Ingredient.ofItems(ModItems.AQUAMARINE)),
    TITANIUM_REINFORCED_NETHERITE("titanium_reinforced_netherite", 38, new int[] { 3, 8, 6, 3 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.5f, 0.1f, () -> Ingredient.ofItems(Items.NETHERITE_INGOT))
    ;
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };
    private final Supplier<Ingredient> repairIngredient;
    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmmounts, int enchantability, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmmounts = protectionAmmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }
    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }
    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmmounts[type.ordinal()];
    }
    @Override
    public int getEnchantability() {
        return this.enchantability;
    }
    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
    @Override
    public String getName() {
        return MetalsAndMinerals.MOD_ID + ":" + this.name;
    }
    @Override
    public float getToughness() {
        return this.toughness;
    }
    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
