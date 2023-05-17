package com.bull.things.enchantment;

import com.bull.things.Things;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS
            = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Things.MOD_ID);

    public static RegistryObject<Enchantment> WINGARDIUM_LEVIOSA =
            ENCHANTMENTS.register("wingardium_leviosa", () -> new WingardiumLeviosaEnchantment(
                    Enchantment.Rarity.RARE, EnchantmentCategory.BREAKABLE, EquipmentSlot.MAINHAND));

    /*public static RegistryObject<Enchantment> EXPERIENCE_BOOST =
            ENCHANTMENTS.register("experience", () -> new ExperienceEnchantment(
                    Enchantment.Rarity.RARE, EnchantmentCategory.BREAKABLE, EquipmentSlot.MAINHAND));

     */

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
