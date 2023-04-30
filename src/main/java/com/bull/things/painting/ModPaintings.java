package com.bull.things.painting;

import com.bull.things.Things;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, Things.MOD_ID);

    public static final RegistryObject<PaintingVariant> METAL_PIPE = PAINTING_VARIANTS.register("metal_pipe",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> APPROACHING = PAINTING_VARIANTS.register("approaching",
            () -> new PaintingVariant(32, 16));

    public static final RegistryObject<PaintingVariant> THROWN = PAINTING_VARIANTS.register("thrown",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> GIGACHAD = PAINTING_VARIANTS.register("gigachad",
            () -> new PaintingVariant(16, 16));

    public static final RegistryObject<PaintingVariant> GRASS = PAINTING_VARIANTS.register("grass",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> CODER = PAINTING_VARIANTS.register("coder",
            () -> new PaintingVariant(32, 32));

    public static final RegistryObject<PaintingVariant> CODING = PAINTING_VARIANTS.register("coding",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> CHAD = PAINTING_VARIANTS.register("chad",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> RICK = PAINTING_VARIANTS.register("rick",
            () -> new PaintingVariant(32, 16));
    public static final RegistryObject<PaintingVariant> POTATO = PAINTING_VARIANTS.register("potato_painting",
            () -> new PaintingVariant(16, 16));

    public static void register(IEventBus eventBus){PAINTING_VARIANTS.register(eventBus);}
}