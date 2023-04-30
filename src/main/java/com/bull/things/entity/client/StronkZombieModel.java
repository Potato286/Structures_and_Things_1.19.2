package com.bull.things.entity.client;


import com.bull.things.Things;
import com.bull.things.entity.custom.StronkZombieEntity;
import com.bull.things.entity.custom.StronkZombieEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StronkZombieModel extends AnimatedGeoModel<StronkZombieEntity> {
    @Override
    public ResourceLocation getModelResource(StronkZombieEntity object) {
        return new ResourceLocation(Things.MOD_ID, "geo/stronkzombie.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(StronkZombieEntity object) {
        return new ResourceLocation(Things.MOD_ID, "textures/entity/stronkzombie.png");
    }

    @Override
    public ResourceLocation getAnimationResource(StronkZombieEntity animatable) {
        return new ResourceLocation(Things.MOD_ID, "animations/stronkzombie.animation.json");
    }
}
