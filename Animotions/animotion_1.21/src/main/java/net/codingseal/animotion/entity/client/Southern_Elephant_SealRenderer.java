package net.codingseal.animotion.entity.client;


import com.google.common.collect.Maps;
import net.codingseal.animotion.Animotion;

import net.codingseal.animotion.entity.custom.Southern_Elephant_SealEntity;
import net.codingseal.animotion.entity.custom.Southern_Elephant_SealVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class Southern_Elephant_SealRenderer extends MobEntityRenderer<Southern_Elephant_SealEntity,
        Southern_Elephant_SealModel<Southern_Elephant_SealEntity>> {
    private static final Map<Southern_Elephant_SealVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(Southern_Elephant_SealVariant.class), map -> {
                map.put(Southern_Elephant_SealVariant.DEFAULT,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/seals/southern_elephant_seal/southern_elephant_seal.png"));
                map.put(Southern_Elephant_SealVariant.VARIANT_1,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/seals/southern_elephant_seal/southern_elephant_seal_variant_1.png"));
            });
    public Southern_Elephant_SealRenderer(EntityRendererFactory.Context context) {
        super(context, new Southern_Elephant_SealModel<>(context.getPart(Southern_Elephant_SealModel.SOUTHERN_ELEPHANT_SEAL)), 0.75f);
    }

    @Override
    public Identifier getTexture(Southern_Elephant_SealEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(Southern_Elephant_SealEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
