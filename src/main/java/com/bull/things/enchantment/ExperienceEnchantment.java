package com.bull.things.enchantment;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ExperienceEnchantment extends Enchantment {
    public ExperienceEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }
    /*@SubscribeEvent
    public void handleBlockBreakEvent(BlockEvent.BreakEvent event, int pLevel) {
        if (!event.getPlayer().level.isClientSide()) {
            if (pLevel >= 1) {
                event.setExpToDrop(event.getExpToDrop() + getRandomExpAmount(pLevel, event.getPlayer().level));
            }
        }
    }

    @SubscribeEvent
    public void handleEntityDropEvent(LivingExperienceDropEvent event, int pLevel) {
        if(event.getAttackingPlayer().level.isClientSide()) {
            if (pLevel >= 1) {
                event.setDroppedExperience(event.getDroppedExperience() + getRandomExpAmount(pLevel, event.getAttackingPlayer().level));
            }
        }
    }

    private int getRandomExpAmount(int level, Level world) {
        return world.random.nextInt(getMaxLevel()) * (level + 1);
    }

     */

    public static final Enchantment EXPERIENCE_BOOST = new ExperienceEnchantment(Enchantment.Rarity.RARE, EnchantmentCategory.BREAKABLE, EquipmentSlot.MAINHAND);
    @Override
    public int getMaxLevel() {
        return 10;
    }
    @SubscribeEvent
    public void onLivingExperienceDrop(LivingExperienceDropEvent event) {
        Player player = event.getAttackingPlayer();
        if (player != null) {
            ItemStack heldItem = player.getMainHandItem();
            int enchantmentLevel = EnchantmentHelper.getItemEnchantmentLevel(EXPERIENCE_BOOST, heldItem);
            if (enchantmentLevel > 0) {
                int extraExperience = calculateExtraExperience(event.getOriginalExperience(), enchantmentLevel);
                event.setDroppedExperience(event.getDroppedExperience() + extraExperience);
            }
        }
    }

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack heldItem = player.getMainHandItem();
        int enchantmentLevel = EnchantmentHelper.getItemEnchantmentLevel(EXPERIENCE_BOOST, heldItem);
        if (enchantmentLevel > 0) {
            int experience = event.getExpToDrop();
            int extraExperience = calculateExtraExperience(experience, enchantmentLevel);
            event.setExpToDrop(experience + extraExperience);
        }
    }

    private int calculateExtraExperience(int originalExperience, int enchantmentLevel) {
        // Calculate extra experience based on original experience and enchantment level
        return originalExperience * enchantmentLevel;
    }
}
