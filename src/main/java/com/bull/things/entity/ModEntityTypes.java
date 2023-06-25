package com.bull.things.entity;

import com.bull.things.Things;
import com.bull.things.entity.custom.*;
import com.bull.things.entity.item.PrimedNuke;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.item.PrimedTnt;
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

    public static final RegistryObject<EntityType<EthanBossEntity>> ETHAN_BOSS = ENTITY_TYPES.register("ethan_boss", () ->
            EntityType.Builder.of(EthanBossEntity::new, MobCategory.MONSTER).sized(1.0f, 2.0f)
                    .build(new ResourceLocation(Things.MOD_ID, "ethan_boss").toString()));

    /*public static final RegistryObject<EntityType<PrimedNuke>> NUKE = ENTITY_TYPES.register("nuke", () ->
            EntityType.Builder.<PrimedNuke>of(PrimedNuke::new, MobCategory.MISC).fireImmune().sized(0.98F, 0.98F)
                    .clientTrackingRange(10).updateInterval(10)
                    .build(new ResourceLocation(Things.MOD_ID, "nuke").toString()));

     */

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
