package com.bull.things.item;

import com.bull.things.Things;
import com.bull.things.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static Tier RHODIUM;
    public static Tier LAPIS;

    public static Tier TEST;

    static {
        RHODIUM = TierSortingRegistry.registerTier(new ForgeTier(5, 2531, 39.0f, 5.0f, 300
        , ModTags.Blocks.NEEDS_RHODIUM_TOOL, () -> Ingredient.of(Items.DRAGON_EGG)),
                new ResourceLocation(Things.MOD_ID, "rhodium"), List.of(Tiers.NETHERITE), List.of());
        LAPIS = TierSortingRegistry.registerTier(new ForgeTier(0, 50, 10.0F, 0.0F, 22,
                        Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(Items.LAPIS_LAZULI)),
                new ResourceLocation(Things.MOD_ID, "lapis"), List.of(Tiers.GOLD), List.of());
        TEST = TierSortingRegistry.registerTier(new ForgeTier(5, 0, 42069.0f, 500.0f, 6942069
                        , ModTags.Blocks.NEEDS_RHODIUM_TOOL, () -> Ingredient.of(Items.DRAGON_EGG)),
                new ResourceLocation(Things.MOD_ID, "test"), List.of(Tiers.NETHERITE), List.of());
    }
}
