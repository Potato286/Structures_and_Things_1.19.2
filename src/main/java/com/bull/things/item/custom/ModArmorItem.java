package com.bull.things.item.custom;

import com.bull.things.effect.ModEffects;
import com.bull.things.item.ModItems;
import com.bull.things.item.NetherStarReinforcedNetheriteArmor;
import com.google.common.collect.ImmutableMap;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.Map;

public class ModArmorItem extends ArmorItem {
    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if (player.getInventory().getArmor(3) != null &&  player.getInventory().getArmor(3).getItem() == ModItems.NETHER_STAR_REINFORCED_NETHERITE_HELMET.get()) {
                player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 20, 0));
            }
            if (player.getInventory().getArmor(2) != null && player.getInventory().getArmor(2).getItem() == ModItems.NETHER_STAR_REINFORCED_NETHERITE_CHESTPLATE.get()) {
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0));
            }
            if (player.getInventory().getArmor(1) != null && player.getInventory().getArmor(1).getItem() == ModItems.NETHER_STAR_REINFORCED_NETHERITE_LEGGINGS.get()) {
                player.addEffect(new MobEffectInstance(MobEffects.JUMP, 20, 1));
            }
            if (player.getInventory().getArmor(0) != null && player.getInventory().getArmor(0).getItem() == ModItems.NETHER_STAR_REINFORCED_NETHERITE_BOOTS.get()) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1));
            }
        }
    }
}