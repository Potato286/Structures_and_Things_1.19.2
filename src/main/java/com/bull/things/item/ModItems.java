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
            () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate",
            () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> LAPIS_LEGGING = ITEMS.register("lapis_leggings",
            () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));
    public static final RegistryObject<Item> LAPIS_BOOTS = ITEMS.register("lapis_boots",
            () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.FEET,
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
    public static final RegistryObject<Item> TEST_HOE = ITEMS.register("test_hoe",
            () -> new PickaxeItem(ModToolTiers.TEST, -500, 300000f,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
