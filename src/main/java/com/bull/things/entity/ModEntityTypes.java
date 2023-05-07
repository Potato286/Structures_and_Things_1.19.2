package com.bull.things.entity;

import com.bull.things.Things;
import com.bull.things.entity.custom.DrHakimEntity;
import com.bull.things.entity.custom.PharoahEntity;
import com.bull.things.entity.custom.StronkZombieEntity;
import com.bull.things.entity.custom.TlalocEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Things.MOD_ID);

    public static final RegistryObject<EntityType<TlalocEntity>> TLALOC = ENTITY_TYPES.register("tlaloc", () ->
            EntityType.Builder.of(TlalocEntity::new, MobCategory.MONSTER).sized(0.9f, 3.0f)
                    .build(new ResourceLocation(Things.MOD_ID, "tlaloc").toString()));

    public static final RegistryObject<EntityType<StronkZombieEntity>> STRONKZOMBIE = ENTITY_TYPES.register("stronkzombie", () ->
            EntityType.Builder.of(StronkZombieEntity::new, MobCategory.MONSTER).sized(2.0f, 3.9f)
                    .build(new ResourceLocation(Things.MOD_ID, "stronkzombie").toString()));

    public static final RegistryObject<EntityType<PharoahEntity>> PHAROAH = ENTITY_TYPES.register("pharoah", () ->
            EntityType.Builder.of(PharoahEntity::new, MobCategory.MONSTER).sized(1.0f, 2.0f)
                    .build(new ResourceLocation(Things.MOD_ID, "pharoah").toString()));

    public static final RegistryObject<EntityType<DrHakimEntity>> DR_HAKIM = ENTITY_TYPES.register("dr_hakim", () ->
            EntityType.Builder.of(DrHakimEntity::new, MobCategory.MONSTER).sized(1.5f, 3.5f)
                    .build(new ResourceLocation(Things.MOD_ID, "dr_hakim").toString()));
    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
