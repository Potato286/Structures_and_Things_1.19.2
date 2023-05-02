package com.bull.things.item;

import com.bull.things.Things;
import com.bull.things.entity.ModEntityTypes;
import com.bull.things.item.custom.Trident;
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




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
