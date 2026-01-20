package net.codingseal.animotion.entity.client.renderers;


import com.google.common.collect.Maps;
import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.client.models.Baikal_SealModel;
import net.codingseal.animotion.entity.custom.Baikal_SealEntity;
import net.codingseal.animotion.entity.custom.Baikal_SealVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import java.util.Map;

public class Baikal_SealRenderer extends MobEntityRenderer<Baikal_SealEntity, Baikal_SealModel<Baikal_SealEntity>> {
    private static final Map<Baikal_SealVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(Baikal_SealVariant.class), map -> {
                map.put(Baikal_SealVariant.DEFAULT,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/seals/baikal_seal/baikal_seal.png"));
                map.put(Baikal_SealVariant.VARIANT_1,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/seals/baikal_seal/baikal_seal_variant_1.png"));
            });

    public Baikal_SealRenderer(EntityRendererFactory.Context context) {
        super(context, new Baikal_SealModel<>(context.getPart(Baikal_SealModel.BAIKAL_SEAL)), 0.75f);
    }

    @Override
    public Identifier getTexture(Baikal_SealEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(Baikal_SealEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
