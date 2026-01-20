package net.codingseal.animotion.entity.client.renderers;
import com.google.common.collect.Maps;
import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.client.models.CrabModel;
import net.codingseal.animotion.entity.custom.CrabEntity;
import net.codingseal.animotion.entity.custom.CrabVariant;
import net.codingseal.animotion.entity.custom.Great_White_SharkVariant;
import net.codingseal.animotion.entity.custom.SealEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class CrabRenderer extends MobEntityRenderer<CrabEntity, CrabModel<CrabEntity>> {
    private static final Map<CrabVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CrabVariant.class), map -> {
                map.put(CrabVariant.DEFAULT,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/crabs/crab/crab.png"));
                map.put(CrabVariant.VARIANT_1,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/crabs/crab/crab_variant_1.png"));
            });
    public CrabRenderer(EntityRendererFactory.Context context) {
        super(context, new CrabModel<>(context.getPart(CrabModel.CRAB)), 0.75f);
    }

    @Override
    public Identifier getTexture(CrabEntity entity) {
        return Identifier.of(Animotion.MOD_ID, "textures/entity/crabs/crab/crab.png");
    }

    @Override
    public void render(CrabEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(0.7f, 0.7f, 0.7f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
