package com.bull.things.entity.client;


import com.bull.things.Things;
import com.bull.things.entity.custom.DrHakimEntity;
import com.bull.things.entity.custom.TlalocEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DrHakimModel extends AnimatedGeoModel<DrHakimEntity> {
    @Override
    public ResourceLocation getModelResource(DrHakimEntity object) {
        return new ResourceLocation(Things.MOD_ID, "geo/dr_hakim.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DrHakimEntity object) {
        return new ResourceLocation(Things.MOD_ID, "textures/entity/dr_hakim.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DrHakimEntity animatable) {
        return new ResourceLocation(Things.MOD_ID, "animations/dr_hakim.animation.json");
    }
}
