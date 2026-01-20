package net.codingseal.animotion.entity.client.renderers;


import com.google.common.collect.Maps;
import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.client.models.Gray_Reef_SharkModel;
import net.codingseal.animotion.entity.custom.Gray_Reef_SharkEntity;
import net.codingseal.animotion.entity.custom.Gray_Reef_SharkVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class Gray_Reef_SharkRenderer extends MobEntityRenderer<Gray_Reef_SharkEntity, Gray_Reef_SharkModel<Gray_Reef_SharkEntity>> {
    private static final Map<Gray_Reef_SharkVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(Gray_Reef_SharkVariant.class), map -> {
                map.put(Gray_Reef_SharkVariant.DEFAULT,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/sharks/gray_reef_shark/gray_reef_shark.png"));
                map.put(Gray_Reef_SharkVariant.VARIANT_1,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/sharks/gray_reef_shark/gray_reef_shark_variant_1.png"));
            });

    public Gray_Reef_SharkRenderer(EntityRendererFactory.Context context) {
        super(context, new Gray_Reef_SharkModel<>(context.getPart(Gray_Reef_SharkModel.GRAY_REEF_SHARK)), 0.75f);
    }


    @Override
    public Identifier getTexture(Gray_Reef_SharkEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(Gray_Reef_SharkEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.25f, 0.25f, 0.25f);
        } else {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
