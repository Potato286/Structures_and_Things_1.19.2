package com.bull.things.entity.client;


import com.bull.things.Things;
import com.bull.things.entity.custom.PharoahEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PharoahModel extends AnimatedGeoModel<PharoahEntity> {
    @Override
    public ResourceLocation getModelResource(PharoahEntity object) {
        return new ResourceLocation(Things.MOD_ID, "geo/pharoah.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PharoahEntity object) {
        return new ResourceLocation(Things.MOD_ID, "textures/entity/pharoah.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PharoahEntity animatable) {
        return new ResourceLocation(Things.MOD_ID, "animations/pharoah.animation.json");
    }
}
