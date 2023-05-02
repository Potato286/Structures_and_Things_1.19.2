package com.bull.things.entity.client;

import com.bull.things.Things;
import com.bull.things.entity.custom.PharoahEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PharoahRenderer extends GeoEntityRenderer<PharoahEntity> {
    public PharoahRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PharoahModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(PharoahEntity animatable) {
        return new ResourceLocation(Things.MOD_ID, "textures/entity/pharoah.png");
    }

    @Override
    public RenderType getRenderType(PharoahEntity animatable, float partialTick, PoseStack poseStack,
                                    @Nullable MultiBufferSource bufferSource,
                                    @Nullable VertexConsumer buffer, int packedLight, ResourceLocation texture) {
        poseStack.scale(1, 1, 1);
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
