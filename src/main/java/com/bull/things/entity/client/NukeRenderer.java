package com.bull.things.entity.client;

import com.bull.things.Things;
import com.bull.things.entity.item.PrimedNuke;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class NukeRenderer extends EntityRenderer<PrimedNuke> {
    private final BlockRenderDispatcher blockRenderer;

    public NukeRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
        this.shadowRadius = 0.5F;
        this.blockRenderer = pContext.getBlockRenderDispatcher();
    }

    public void render(PrimedNuke pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.pushPose();
        pMatrixStack.translate(0.0D, 0.5D, 0.0D);
        int i = pEntity.getFuse();
        if ((float)i - pPartialTicks + 1.0F < 10.0F) {
            float f = 1.0F - ((float)i - pPartialTicks + 1.0F) / 10.0F;
            f = Mth.clamp(f, 0.0F, 1.0F);
            f *= f;
            f *= f;
            float f1 = 1.0F + f * 0.3F;
            pMatrixStack.scale(f1, f1, f1);
        }

        pMatrixStack.mulPose(Vector3f.YP.rotationDegrees(-90.0F));
        pMatrixStack.translate(-0.5D, -0.5D, 0.5D);
        pMatrixStack.mulPose(Vector3f.YP.rotationDegrees(90.0F));
        pMatrixStack.popPose();
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

    /**
     * Returns the location of an entity's texture.
     */
    public ResourceLocation getTextureLocation(PrimedNuke pEntity) {
        return TextureAtlas.LOCATION_BLOCKS;
    } /*{
        return new ResourceLocation(Things.MOD_ID, "textures/block/nuke_side.png");
    }
    */
}