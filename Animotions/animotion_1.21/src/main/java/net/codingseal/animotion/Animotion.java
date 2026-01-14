package net.codingseal.animotion;

import net.codingseal.animotion.entity.ModEntities;
import net.codingseal.animotion.entity.custom.*;
import net.codingseal.animotion.item.ModItemsGroups;
import net.codingseal.animotion.item.ModItems;
import net.codingseal.animotion.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Animotion implements ModInitializer {
	public static final String MOD_ID = "animotion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModEntities.registerModEntities();
        ModItems.registerModItems();
        ModItemsGroups.registerItemsGroups();
        ModWorldGeneration.generateModWorldGen();


        FabricDefaultAttributeRegistry.register(ModEntities.BAIKAL_SEAL, Baikal_SealEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.CRABEATER_SEAL, Crabeater_SealEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.GREY_SEAL, Grey_SealEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.HARP_SEAL, Harp_SealEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.LEOPARD_SEAL, Leopard_SealEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.SEAL, SealEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.SOUTHERN_ELEPHANT_SEAL, Southern_Elephant_SealEntity.createAttributes());

	}
}