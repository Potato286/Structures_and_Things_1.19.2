package com.bull.things.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab THING_TAB = new CreativeModeTab("thingtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SCYTHE.get());
        }
    };
}
