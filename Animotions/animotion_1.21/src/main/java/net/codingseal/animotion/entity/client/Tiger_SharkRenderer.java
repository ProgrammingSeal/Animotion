package net.codingseal.animotion.entity.client;


import com.google.common.collect.Maps;
import net.codingseal.animotion.Animotion;

import net.codingseal.animotion.entity.custom.Tiger_SharkEntity;
import net.codingseal.animotion.entity.custom.Tiger_SharkVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class Tiger_SharkRenderer extends MobEntityRenderer<Tiger_SharkEntity, Tiger_SharkModel<Tiger_SharkEntity>> {
    private static final Map<Tiger_SharkVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(Tiger_SharkVariant.class), map -> {
                map.put(Tiger_SharkVariant.DEFAULT,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/sharks/tiger_shark/tiger_shark.png"));
                map.put(Tiger_SharkVariant.VARIANT_1,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/sharks/tiger_shark/tiger_shark_variant_1.png"));
            });

    public Tiger_SharkRenderer(EntityRendererFactory.Context context) {
        super(context, new Tiger_SharkModel<>(context.getPart(Tiger_SharkModel.TIGER_SHARK)), 0.75f);
    }

    @Override
    public Identifier getTexture(Tiger_SharkEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(Tiger_SharkEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
