package net.codingseal.animotion;


import net.codingseal.animotion.entity.ModEntities;

import net.codingseal.animotion.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;


public class AnimotionClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(Baikal_SealModel.BAIKAL_SEAL, Baikal_SealModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.BAIKAL_SEAL, Baikal_SealRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(Crabeater_SealModel.CRABEATER_SEAL, Crabeater_SealModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.CRABEATER_SEAL, Crabeater_SealRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(Grey_SealModel.GREY_SEAL, Grey_SealModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.GREY_SEAL, Grey_SealRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(Harp_SealModel.HARP_SEAL, Harp_SealModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.HARP_SEAL, Harp_SealRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(Leopard_SealModel.LEOPARD_SEAL, Leopard_SealModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.LEOPARD_SEAL, Leopard_SealRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(SealModel.SEAL, SealModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.SEAL, SealRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(Southern_Elephant_SealModel.SOUTHERN_ELEPHANT_SEAL, Southern_Elephant_SealModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.SOUTHERN_ELEPHANT_SEAL, Southern_Elephant_SealRenderer::new);







    }
}
