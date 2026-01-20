package net.codingseal.animotion.entity.client.renderers;


import com.google.common.collect.Maps;
import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.client.models.Harp_SealModel;
import net.codingseal.animotion.entity.custom.Harp_SealEntity;
import net.codingseal.animotion.entity.custom.Harp_SealVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class Harp_SealRenderer extends MobEntityRenderer<Harp_SealEntity, Harp_SealModel<Harp_SealEntity>> {
    private static final Map<Harp_SealVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(Harp_SealVariant.class), map -> {
                map.put(Harp_SealVariant.DEFAULT,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/seals/harp_seal/harp_seal.png"));
                map.put(Harp_SealVariant.VARIANT_1,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/seals/harp_seal/harp_seal_variant_1.png"));
            });
    public Harp_SealRenderer(EntityRendererFactory.Context context) {
        super(context, new Harp_SealModel<>(context.getPart(Harp_SealModel.HARP_SEAL)), 0.75f);
    }

    @Override
    public Identifier getTexture(Harp_SealEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(Harp_SealEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
