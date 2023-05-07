package com.bull.things;

import com.bull.things.block.ModBlocks;
import com.bull.things.enchantment.ModEnchantments;
import com.bull.things.entity.ModEntityTypes;
import com.bull.things.entity.client.DrHakimRenderer;
import com.bull.things.entity.client.PharoahRenderer;
import com.bull.things.entity.client.StronkZombieRenderer;
import com.bull.things.entity.client.TlalocRenderer;
import com.bull.things.item.ModItems;
import com.bull.things.painting.ModPaintings;
import com.bull.things.sound.ModSounds;
import com.bull.things.world.feature.ModConfiguredFeatures;
import com.bull.things.world.feature.ModPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Things.MOD_ID)
public class Things {
    public static final String MOD_ID = "things";

    private static final Logger LOGGER = LogUtils.getLogger();

    public Things() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModEnchantments.register(modEventBus);
        ModEntityTypes.register(modEventBus);
        GeckoLib.initialize();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModPaintings.register(modEventBus);
        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);
        ModSounds.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LILY.getId(), ModBlocks.POTTED_LILY);
        });
    }
    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntityTypes.TLALOC.get(), TlalocRenderer::new);
            EntityRenderers.register(ModEntityTypes.STRONKZOMBIE.get(), StronkZombieRenderer::new);
            EntityRenderers.register(ModEntityTypes.PHAROAH.get(), PharoahRenderer::new);
            EntityRenderers.register(ModEntityTypes.DR_HAKIM.get(), DrHakimRenderer::new);
        }
    }
}
