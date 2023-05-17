package com.bull.things.entity.client;


import com.bull.things.Things;
import com.bull.things.entity.custom.EthanBossEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EthanBossModel extends AnimatedGeoModel<EthanBossEntity> {
    @Override
    public ResourceLocation getModelResource(EthanBossEntity object) {
        return new ResourceLocation(Things.MOD_ID, "geo/ethan_boss.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EthanBossEntity object) {
        return new ResourceLocation(Things.MOD_ID, "textures/entity/ethan_boss.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EthanBossEntity animatable) {
        return new ResourceLocation(Things.MOD_ID, "animations/ethan_boss.animation.json");
    }
}
