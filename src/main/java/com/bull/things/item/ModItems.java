package com.bull.things.item;

import com.bull.things.Things;
import com.bull.things.entity.ModEntityTypes;
import com.bull.things.item.custom.Trident;
import com.bull.things.sound.ModSounds;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Things.MOD_ID);


    public static final RegistryObject<Item> SCYTHE = ITEMS.register("scythe",
            () -> new HoeItem(ModToolTiers.RHODIUM, 9, -2.4f,
                    new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> TLALOC_SPAWN_EGG = ITEMS.register("tlaloc_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.TLALOC, 0x00FF00, 0x32CBF1,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> STRONKZOMBIE_SPAWN_EGG = ITEMS.register("stronkzombie_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.STRONKZOMBIE, 0x00D100, 0x00A300,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> PHAROAH_SPAWN_EGG = ITEMS.register("pharoah_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PHAROAH, 0xf9cb9c, 0xf6b26b,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> DR_HAKIM_SPAWN_EGG = ITEMS.register("dr_hakim_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.DR_HAKIM, 0x8b0000, 0xF51720,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> PICKAXE = ITEMS.register("pickaxe",
            () -> new PickaxeItem(ModToolTiers.RHODIUM,1, -2.8f,
                    new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> AXE = ITEMS.register("axe",
            () -> new AxeItem(ModToolTiers.RHODIUM,5, -2.8f,
                    new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> TRIDENT = ITEMS.register("trident",
            () -> new Trident(new Item.Properties().stacksTo(1).durability(2531).tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> DIE_MUSIC_DISC = ITEMS.register("die_music_disc",
            () -> new RecordItem(4, ModSounds.DIE,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB).stacksTo(1), 3140));

    public static final RegistryObject<Item> DIE_MUSIC_DISC_2 = ITEMS.register("die_music_disc_2",
            () -> new RecordItem(4, ModSounds.DIE_2,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB).stacksTo(1), 3000));

    public static final RegistryObject<Item> LAPIS_HELMET = ITEMS.register("lapis_helmet",
            () -> new ArmorItem(LapisArmor.LAPIS, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate",
            () -> new ArmorItem(LapisArmor.LAPIS, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> LAPIS_LEGGING = ITEMS.register("lapis_leggings",
            () -> new ArmorItem(LapisArmor.LAPIS, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> LAPIS_BOOTS = ITEMS.register("lapis_boots",
            () -> new ArmorItem(LapisArmor.LAPIS, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> LAPIS_SWORD = ITEMS.register("lapis_sword",
            () -> new SwordItem(ModToolTiers.LAPIS, 2, -1.9f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LAPIS, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> LAPIS_SHOVEL = ITEMS.register("lapis_shovel",
            () -> new ShovelItem(ModToolTiers.LAPIS, 1, -2.5f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> LAPIS_AXE = ITEMS.register("lapis_axe",
            () -> new AxeItem(ModToolTiers.LAPIS, 5, -2.5f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> LAPIS_HOE = ITEMS.register("lapis_hoe",
            () -> new HoeItem(ModToolTiers.LAPIS, 0, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> REDSTONE_HELMET = ITEMS.register("redstone_helmet",
            () -> new ArmorItem(RedstoneArmor.REDSTONE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REDSTONE_CHESTPLATE = ITEMS.register("redstone_chestplate",
            () -> new ArmorItem(RedstoneArmor.REDSTONE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REDSTONE_LEGGING = ITEMS.register("redstone_leggings",
            () -> new ArmorItem(RedstoneArmor.REDSTONE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REDSTONE_BOOTS = ITEMS.register("redstone_boots",
            () -> new ArmorItem(RedstoneArmor.REDSTONE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword",
            () -> new SwordItem(ModToolTiers.REDSTONE, 2, -1.9f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.REDSTONE, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel",
            () -> new ShovelItem(ModToolTiers.REDSTONE, 1, -2.5f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REDSTONE_AXE = ITEMS.register("redstone_axe",
            () -> new AxeItem(ModToolTiers.REDSTONE, 5, -2.5f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe",
            () -> new HoeItem(ModToolTiers.REDSTONE, 0, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> TEST_HOE = ITEMS.register("test_hoe",
            () -> new PickaxeItem(ModToolTiers.TEST, -500, 300000f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(EmeraldArmor.EMERALD, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(EmeraldArmor.EMERALD, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> EMERALD_LEGGING = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(EmeraldArmor.EMERALD, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(EmeraldArmor.EMERALD, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModToolTiers.EMERALD, 3, -2.0f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EMERALD, 2, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModToolTiers.EMERALD, 0, -3.0f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModToolTiers.EMERALD, 5, -3.0f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModToolTiers.EMERALD, -3, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(CopperArmor.COPPER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(CopperArmor.COPPER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> COPPER_LEGGING = ITEMS.register("copper_leggings",
            () -> new ArmorItem(CopperArmor.COPPER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(CopperArmor.COPPER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModToolTiers.COPPER, 2, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, 1, -3.0f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, 6, -3.1f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, -3, -1f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> REINFORCED_GOLD_HELMET = ITEMS.register("reinforced_gold_helmet",
            () -> new ArmorItem(ReinforcedGoldArmor.REINFORCED_GOLD, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REINFORCED_GOLD_CHESTPLATE = ITEMS.register("reinforced_gold_chestplate",
            () -> new ArmorItem(ReinforcedGoldArmor.REINFORCED_GOLD, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REINFORCED_GOLD_LEGGING = ITEMS.register("reinforced_gold_leggings",
            () -> new ArmorItem(ReinforcedGoldArmor.REINFORCED_GOLD, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REINFORCED_GOLD_BOOTS = ITEMS.register("reinforced_gold_boots",
            () -> new ArmorItem(ReinforcedGoldArmor.REINFORCED_GOLD, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> REINFORCED_GOLD_SWORD = ITEMS.register("reinforced_gold_sword",
            () -> new SwordItem(ModToolTiers.REINFORCED_GOLD, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REINFORCED_GOLD_PICKAXE = ITEMS.register("reinforced_gold_pickaxe",
            () -> new PickaxeItem(ModToolTiers.REINFORCED_GOLD, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REINFORCED_GOLD_SHOVEL = ITEMS.register("reinforced_gold_shovel",
            () -> new ShovelItem(ModToolTiers.REINFORCED_GOLD, 1, -3.0f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REINFORCED_GOLD_AXE = ITEMS.register("reinforced_gold_axe",
            () -> new AxeItem(ModToolTiers.REINFORCED_GOLD, 6, -3.1f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> REINFORCED_GOLD_HOE = ITEMS.register("reinforced_gold_hoe",
            () -> new HoeItem(ModToolTiers.REINFORCED_GOLD, -2, -1f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
