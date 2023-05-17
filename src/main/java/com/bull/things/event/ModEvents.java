package com.bull.things.event;

import com.bull.things.Things;
import com.bull.things.enchantment.ExperienceEnchantment;
import com.bull.things.entity.ModEntityTypes;
import com.bull.things.entity.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jline.utils.Log;


public class ModEvents {
    public static final Enchantment EXPERIENCE_BOOST = new ExperienceEnchantment(Enchantment.Rarity.RARE, EnchantmentCategory.BREAKABLE, EquipmentSlot.MAINHAND);
    @Mod.EventBusSubscriber(modid = Things.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents{
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event){
            event.put(ModEntityTypes.TLALOC.get(), TlalocEntity.setAttributes());
            event.put(ModEntityTypes.STRONKZOMBIE.get(), StronkZombieEntity.setAttributes());
            event.put(ModEntityTypes.PHAROAH.get(), PharoahEntity.setAttributes());
            event.put(ModEntityTypes.DR_HAKIM.get(), DrHakimEntity.setAttributes());
            event.put(ModEntityTypes.ETHAN_BOSS.get(), EthanBossEntity.setAttributes());
        }
        /*@SubscribeEvent
        public void onLivingExperienceDrop(LivingExperienceDropEvent event) {

            Player player = event.getAttackingPlayer();
            if (player != null) {
                ItemStack heldItem = player.getMainHandItem();
                int enchantmentLevel = EnchantmentHelper.getItemEnchantmentLevel(EXPERIENCE_BOOST, heldItem);
                if (enchantmentLevel > 0) {
                    int extraExperience = calculateExtraExperience(event.getOriginalExperience(), enchantmentLevel);
                    event.setDroppedExperience(event.getDroppedExperience() + extraExperience);
                    Log.debug(extraExperience, event.getDroppedExperience(), event.getOriginalExperience(), enchantmentLevel);
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
                Log.debug(experience, extraExperience, event.getExpToDrop(), enchantmentLevel);
            }
        }

        private int calculateExtraExperience(int originalExperience, int enchantmentLevel) {
            // Calculate extra experience based on original experience and enchantment level
            return originalExperience * enchantmentLevel;
        }

         */
    }

}
