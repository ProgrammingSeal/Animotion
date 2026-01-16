package net.codingseal.animotion.entity.client;


import com.google.common.collect.Maps;
import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.custom.Crabeater_SealEntity;
import net.codingseal.animotion.entity.custom.Crabeater_SealVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class Crabeater_SealRenderer extends MobEntityRenderer<Crabeater_SealEntity, Crabeater_SealModel<Crabeater_SealEntity>> {
    private static final Map<Crabeater_SealVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(Crabeater_SealVariant.class), map -> {
                Identifier put = map.put(Crabeater_SealVariant.DEFAULT,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/seals/crabeater_seal/crabeater_seal.png"));
                map.put(Crabeater_SealVariant.VARIANT_1,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/seals/crabeater_seal/crabeater_seal_variant_1.png"));
            });
    public Crabeater_SealRenderer(EntityRendererFactory.Context context) {
        super(context, new Crabeater_SealModel<>(context.getPart(Crabeater_SealModel.CRABEATER_SEAL)), 0.75f);
    }

    @Override
    public Identifier getTexture(Crabeater_SealEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(Crabeater_SealEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
