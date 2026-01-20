package net.codingseal.animotion.entity.client.renderers;

import com.google.common.collect.Maps;
import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.client.models.PenguinModel;
import net.codingseal.animotion.entity.custom.PenguinEntity;
import net.codingseal.animotion.entity.custom.PenguinVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class PenguinRenderer extends MobEntityRenderer<PenguinEntity, PenguinModel<PenguinEntity>> {
    private static final Map<PenguinVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(PenguinVariant.class), map -> {
                map.put(PenguinVariant.DEFAULT,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/penguins/penguin/penguin.png"));
                map.put(PenguinVariant.VARIANT_1,
                        Identifier.of(Animotion.MOD_ID, "textures/entity/penguins/penguin/penguin_variant_1.png"));
            });
    public PenguinRenderer(EntityRendererFactory.Context context) {
        super(context, new PenguinModel<>(context.getPart(PenguinModel.PENGUIN)), 0.75f);
    }

    @Override
    public Identifier getTexture(PenguinEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(PenguinEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
