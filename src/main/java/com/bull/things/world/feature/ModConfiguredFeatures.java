package com.bull.things.world.feature;

import com.bull.things.Things;
import com.bull.things.block.ModBlocks;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES
            = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Things.MOD_ID);
    /*public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RHODIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RHODIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RHODIUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> END_RHODIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModBlocks.ENDSTONE_RHODIUM_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_RHODIUM_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHERRACK_RHODIUM_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> RHODIUM_ORE = CONFIGURED_FEATURES.register("rhodium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_RHODIUM_ORES.get(), 7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHERRACK_RHODIUM_ORE = CONFIGURED_FEATURES.register("netherrack_rhodium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_RHODIUM_ORES.get(), 9)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDSTONE_RHODIUM_ORE = CONFIGURED_FEATURES.register("endstone_rhodium_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(END_RHODIUM_ORES.get(), 9)));
*/
    public static final RegistryObject<ConfiguredFeature<?, ?>> LILY = CONFIGURED_FEATURES.register("lily",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(32, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LILY.get()))))));


    public static void register(IEventBus eventBus){CONFIGURED_FEATURES.register(eventBus);}
}
