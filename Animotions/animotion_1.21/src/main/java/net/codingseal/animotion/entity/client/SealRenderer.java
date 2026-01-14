package net.codingseal.animotion.entity.client;


import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.custom.SealEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SealRenderer extends MobEntityRenderer<SealEntity, SealModel<SealEntity>> {
    public SealRenderer(EntityRendererFactory.Context context) {
        super(context, new SealModel<>(context.getPart(SealModel.SEAL)), 0.75f);
    }

    @Override
    public Identifier getTexture(SealEntity entity) {
        return Identifier.of(Animotion.MOD_ID, "textures/entity/seals/seal/seal.png");
    }

    @Override
    public void render(SealEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
