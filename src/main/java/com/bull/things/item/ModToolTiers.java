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

    public static Tier REDSTONE;
    public static Tier EMERALD;

    public static Tier COPPER;

    public static Tier REINFORCED_GOLD;

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
        REDSTONE = TierSortingRegistry.registerTier(new ForgeTier(0, 120, 8.0F, 0.0F, 15,
                        Tags.Blocks.NEEDS_GOLD_TOOL, () -> Ingredient.of(Items.REDSTONE)),
                new ResourceLocation(Things.MOD_ID, "redstone"), List.of(Tiers.GOLD), List.of());
        EMERALD = TierSortingRegistry.registerTier(new ForgeTier(3, 1261, 9.0F, 2.5F, 12,
                        Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Items.EMERALD)),
                new ResourceLocation(Things.MOD_ID, "emerald"), List.of(Tiers.DIAMOND), List.of());
        COPPER = TierSortingRegistry.registerTier(new ForgeTier(2, 200, 7.0F, 2.0F, 14,
                        Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
                new ResourceLocation(Things.MOD_ID, "copper"), List.of(Tiers.IRON), List.of());
        REINFORCED_GOLD = TierSortingRegistry.registerTier(new ForgeTier(2, 282, 15.0F, 2.0F, 36,
                        Tags.Blocks.NEEDS_NETHERITE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT)),
                new ResourceLocation(Things.MOD_ID, "reinforced_gold"), List.of(Tiers.IRON), List.of());
    }
}
