package net.codingseal.animotion.entity.client;

import com.google.common.collect.Maps;
import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.custom.Baikal_SealVariant;
import net.codingseal.animotion.entity.custom.Grey_SealEntity;
import net.codingseal.animotion.entity.custom.Grey_SealVariant;
import net.codingseal.animotion.entity.custom.SealEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class Grey_SealRenderer extends MobEntityRenderer<Grey_SealEntity, Grey_SealModel<Grey_SealEntity>> {
    private static final Map<Grey_SealVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(Grey_SealVariant.class), map -> {
                map.put(Grey_SealVariant.DEFAULT,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/seals/grey_seal/grey_seal.png"));
                map.put(Grey_SealVariant.VARIANT_1,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/seals/grey_seal/grey_seal_variant_1.png"));
            });
    public Grey_SealRenderer(EntityRendererFactory.Context context) {
        super(context, new Grey_SealModel<>(context.getPart(Grey_SealModel.GREY_SEAL)), 0.75f);
    }

    @Override
    public Identifier getTexture(Grey_SealEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(Grey_SealEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
