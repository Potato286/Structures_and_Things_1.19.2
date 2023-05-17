package com.bull.things.entity.client;

import com.bull.things.Things;
import com.bull.things.entity.custom.EthanBossEntity;
import com.bull.things.entity.custom.TlalocEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class EthanBossRenderer extends GeoEntityRenderer<EthanBossEntity> {
    public EthanBossRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new EthanBossModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(EthanBossEntity animatable) {
        return new ResourceLocation(Things.MOD_ID, "textures/entity/ethan_boss.png");
    }

    @Override
    public RenderType getRenderType(EthanBossEntity animatable, float partialTick, PoseStack poseStack,
                                    @Nullable MultiBufferSource bufferSource,
                                    @Nullable VertexConsumer buffer, int packedLight, ResourceLocation texture) {
        poseStack.scale(1, 1, 1);
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
