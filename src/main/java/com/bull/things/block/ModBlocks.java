package com.bull.things.block;

import com.bull.things.Things;
import com.bull.things.block.custom.ComputerBlock;
import com.bull.things.block.custom.NukeBlock;
import com.bull.things.item.ModCreativeModeTab;
import com.bull.things.item.ModItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Things.MOD_ID);
    public static final RegistryObject<Block> BONES_BLOCK = registerBlock("bones_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> COMPUTER = registerBlock("computer",
            () -> new ComputerBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.THING_TAB);

    public static final RegistryObject<Block> LILY = registerBlock("lily",
            () -> new FlowerBlock( () -> MobEffects.LEVITATION, 10,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)), ModCreativeModeTab.THING_TAB);

    public static final RegistryObject<Block> POTTED_LILY = BLOCKS.register("potted_lily",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.LILY,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    public static final RegistryObject<Block> CRACKED_STONE_BRICK_STAIRS = registerBlock("cracked_stone_brick_stairs",
            () -> new StairBlock(() -> Blocks.CRACKED_STONE_BRICKS.defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_SLAB = registerBlock("cracked_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> CRACKED_STONE_BRICK_WALL = registerBlock("cracked_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);

    public static final RegistryObject<Block> BLASTPROOF_GLASS = registerBlock("blastproof_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)
                    .noOcclusion().explosionResistance(100)), ModCreativeModeTab.THING_TAB);

    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);

    public static final RegistryObject<Block> CUT_COPPER_WALL = registerBlock("cut_copper_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_WALL = registerBlock("exposed_cut_copper_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_WALL = registerBlock("weathered_cut_copper_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_WALL = registerBlock("oxidized_cut_copper_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);

    public static final RegistryObject<Block> QUARTZ_WALL = registerBlock("quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> STONE_WALL = registerBlock("stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);

    public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);

    public static final RegistryObject<Block> DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);

    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> PURPUR_WALL = registerBlock("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);

    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            () -> new StairBlock(() -> Blocks.WHITE_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            () -> new StairBlock(() -> Blocks.ORANGE_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            () -> new StairBlock(() -> Blocks.MAGENTA_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            () -> new StairBlock(() -> Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            () -> new StairBlock(() -> Blocks.YELLOW_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            () -> new StairBlock(() -> Blocks.LIME_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            () -> new StairBlock(() -> Blocks.PINK_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            () -> new StairBlock(() -> Blocks.GRAY_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            () -> new StairBlock(() -> Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            () -> new StairBlock(() -> Blocks.CYAN_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            () -> new StairBlock(() -> Blocks.PURPLE_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            () -> new StairBlock(() -> Blocks.BLUE_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            () -> new StairBlock(() -> Blocks.BROWN_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            () -> new StairBlock(() -> Blocks.GREEN_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            () -> new StairBlock(() -> Blocks.RED_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);
    public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            () -> new StairBlock(() -> Blocks.BLACK_CONCRETE.defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);

    public static final RegistryObject<Block> NUKE = registerBlock("nuke",
            () -> new NukeBlock(BlockBehaviour.Properties.of(Material.EXPLOSIVE).destroyTime(1).instabreak()
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THING_TAB);








    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    };

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
