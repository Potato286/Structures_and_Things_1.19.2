package com.bull.things.item;

import com.bull.things.Things;
import com.bull.things.entity.ModEntityTypes;
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
            () -> new HoeItem(ModToolTiers.RHODIUM, 5, -2.4f,
                    new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> TLALOC_SPAWN_EGG = ITEMS.register("tlaloc_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.TLALOC, 0x22b341, 0x19732e,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> STRONKZOMBIE_SPAWN_EGG = ITEMS.register("stronkzombie_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.STRONKZOMBIE, 0x22b365, 0x19726e,
                    new Item.Properties().tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> PICKAXE = ITEMS.register("pickaxe",
            () -> new PickaxeItem(ModToolTiers.RHODIUM,1, -2.8f,
                    new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.THING_TAB)));

    public static final RegistryObject<Item> AXE = ITEMS.register("axe",
            () -> new AxeItem(ModToolTiers.RHODIUM,5, -2.8f,
                    new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.THING_TAB)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}