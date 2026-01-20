package net.codingseal.animotion.entity.client.renderers;


import com.google.common.collect.Maps;
import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.client.models.Leopard_SealModel;
import net.codingseal.animotion.entity.custom.Leopard_SealEntity;
import net.codingseal.animotion.entity.custom.Leopard_SealVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class Leopard_SealRenderer extends MobEntityRenderer<Leopard_SealEntity, Leopard_SealModel<Leopard_SealEntity>> {
    private static final Map<Leopard_SealVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(Leopard_SealVariant.class), map -> {
                map.put(Leopard_SealVariant.DEFAULT,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/seals/leopard_seal/leopard_seal.png"));
                map.put(Leopard_SealVariant.VARIANT_1,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/seals/leopard_seal/leopard_seal_variant_1.png"));
            });
    public Leopard_SealRenderer(EntityRendererFactory.Context context) {
        super(context, new Leopard_SealModel<>(context.getPart(Leopard_SealModel.LEOPARD_SEAL)), 0.75f);
    }

    @Override
    public Identifier getTexture(Leopard_SealEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(Leopard_SealEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
