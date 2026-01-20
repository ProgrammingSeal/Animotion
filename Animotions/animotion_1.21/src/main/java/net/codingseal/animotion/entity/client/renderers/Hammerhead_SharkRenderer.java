package net.codingseal.animotion.entity.client.renderers;


import com.google.common.collect.Maps;
import net.codingseal.animotion.Animotion;

import net.codingseal.animotion.entity.client.models.Hammerhead_SharkModel;
import net.codingseal.animotion.entity.custom.Hammerhead_SharkEntity;
import net.codingseal.animotion.entity.custom.Hammerhead_SharkVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class Hammerhead_SharkRenderer extends MobEntityRenderer<Hammerhead_SharkEntity, Hammerhead_SharkModel<Hammerhead_SharkEntity>> {
    private static final Map<Hammerhead_SharkVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(Hammerhead_SharkVariant.class), map -> {
                map.put(Hammerhead_SharkVariant.DEFAULT,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/sharks/hammerhead_shark/hammerhead_shark.png"));
                map.put(Hammerhead_SharkVariant.VARIANT_1,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/sharks/hammerhead_shark/hammerhead_shark_variant_1.png"));
            });

    public Hammerhead_SharkRenderer(EntityRendererFactory.Context context) {
        super(context, new Hammerhead_SharkModel<>(context.getPart(Hammerhead_SharkModel.HAMMERHEAD_SHARK)), 0.75f);
    }

    @Override
    public Identifier getTexture(Hammerhead_SharkEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(Hammerhead_SharkEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
