package com.bull.things.entity.client;

import com.bull.things.Things;
import com.bull.things.entity.custom.DrHakimEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DrHakimRenderer extends GeoEntityRenderer<DrHakimEntity> {
    public DrHakimRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DrHakimModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(DrHakimEntity animatable) {
        return new ResourceLocation(Things.MOD_ID, "textures/entity/dr_hakim.png");
    }

    @Override
    public RenderType getRenderType(DrHakimEntity animatable, float partialTick, PoseStack poseStack,
                                    @Nullable MultiBufferSource bufferSource,
                                    @Nullable VertexConsumer buffer, int packedLight, ResourceLocation texture) {
        poseStack.scale(3, 3, 3);
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
