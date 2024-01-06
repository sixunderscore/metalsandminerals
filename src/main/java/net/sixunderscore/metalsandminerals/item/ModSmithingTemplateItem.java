package net.sixunderscore.metalsandminerals.item;

import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

public class ModSmithingTemplateItem {
    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    private static final Text PLATINUM_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier("platinum_upgrade"))).formatted(TITLE_FORMATTING);
    private static final Text PLATINUM_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.platinum_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text PLATINUM_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.platinum_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text PLATINUM_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.platinum_upgrade.base_slot_description")));
    private static final Text PLATINUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.platinum_upgrade.additions_slot_description")));
    private static final Text TITANIUM_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier("titanium_upgrade"))).formatted(TITLE_FORMATTING);
    private static final Text TITANIUM_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.titanium_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text TITANIUM_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.titanium_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text TITANIUM_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.titanium_upgrade.base_slot_description")));
    private static final Text TITANIUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.titanium_upgrade.additions_slot_description")));
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE = new Identifier("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE = new Identifier("item/empty_slot_sword");
    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = new Identifier("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = new Identifier("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = new Identifier("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = new Identifier("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_ROD_TEXTURE = new Identifier("metalsandminerals:item/empty_slot_rod");
    private static final Identifier EMPTY_SLOT_PLATE_TEXTURE = new Identifier("metalsandminerals:item/empty_slot_plate");
    public static SmithingTemplateItem createPlatinumUpgrade() {
        return new SmithingTemplateItem(PLATINUM_UPGRADE_APPLIES_TO_TEXT, PLATINUM_UPGRADE_INGREDIENTS_TEXT, PLATINUM_UPGRADE_TEXT, PLATINUM_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, PLATINUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, ModSmithingTemplateItem.getPlatinumUpgradeEmptyBaseSlotTextures(), ModSmithingTemplateItem.getPlatinumUpgradeEmptyAdditionsSlotTextures());
    }
    public static SmithingTemplateItem createTitaniumUpgrade() {
        return new SmithingTemplateItem(TITANIUM_UPGRADE_APPLIES_TO_TEXT, TITANIUM_UPGRADE_INGREDIENTS_TEXT, TITANIUM_UPGRADE_TEXT, TITANIUM_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, TITANIUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, ModSmithingTemplateItem.getTitaniumUpgradeEmptyBaseSlotTextures(), ModSmithingTemplateItem.getTitaniumUpgradeEmptyAdditionsSlotTextures());
    }
    private static List<Identifier> getPlatinumUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_SLOT_SWORD_TEXTURE, EMPTY_SLOT_AXE_TEXTURE);
    }
    private static List<Identifier> getTitaniumUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE);
    }
    private static List<Identifier> getPlatinumUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_ROD_TEXTURE);
    }
    private static List<Identifier> getTitaniumUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_PLATE_TEXTURE);
    }
}
