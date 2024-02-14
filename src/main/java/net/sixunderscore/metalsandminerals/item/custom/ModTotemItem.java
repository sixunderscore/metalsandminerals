package net.sixunderscore.metalsandminerals.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModTotemItem extends Item {
    private static final int DELAY_TICKS = 40;
    private int tickCounter = 0;
    private final StatusEffect itemStatusEffect;
    private final int amplifier;

    public ModTotemItem(StatusEffect totemStatusEffect, int effectAmplifier, Settings settings) {
        super(settings);
        this.itemStatusEffect = totemStatusEffect;
        this.amplifier = effectAmplifier;
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient() && entity instanceof PlayerEntity player) {
            if (player.getMainHandStack().getItem() == this || player.getOffHandStack().getItem() == this) {
                if (tickCounter >= DELAY_TICKS) {
                    player.addStatusEffect(new StatusEffectInstance(itemStatusEffect, 120, amplifier, false, true));
                    tickCounter = 0;
                } else {
                    tickCounter++;
                }
            }
        }
    }
}
