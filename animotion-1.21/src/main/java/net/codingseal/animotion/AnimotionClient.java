package net.codingseal.animotion;


import net.codingseal.animotion.entity.ModEntities;

import net.codingseal.animotion.entity.client.SealModel;
import net.codingseal.animotion.entity.client.SealRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;


public class AnimotionClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(SealModel.SEAL, SealModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.SEAL, SealRenderer::new);

    }
}
