package net.codingseal.animotion.entity.client.renderers;


import com.google.common.collect.Maps;
import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.client.models.Great_White_SharkModel;
import net.codingseal.animotion.entity.custom.Great_White_SharkEntity;
import net.codingseal.animotion.entity.custom.Great_White_SharkVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class Great_White_SharkRenderer extends MobEntityRenderer<Great_White_SharkEntity, Great_White_SharkModel<Great_White_SharkEntity>> {
    private static final Map<Great_White_SharkVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(Great_White_SharkVariant.class), map -> {
                map.put(Great_White_SharkVariant.DEFAULT,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/sharks/great_white_shark/great_white_shark.png"));
                map.put(Great_White_SharkVariant.VARIANT_1,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/sharks/great_white_shark/great_white_shark_variant_1.png"));
            });

    public Great_White_SharkRenderer(EntityRendererFactory.Context context) {
        super(context, new Great_White_SharkModel<>(context.getPart(Great_White_SharkModel.GREAT_WHITE_SHARK)), 0.75f);
    }

    @Override
    public Identifier getTexture(Great_White_SharkEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(Great_White_SharkEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
