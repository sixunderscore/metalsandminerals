package net.sixunderscore.metalsandminerals.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PLATINUM_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 1),1.0f).alwaysEdible().build();
    public static final FoodComponent TITANIUM_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 400, 1), 1.0f).alwaysEdible().build();
}
