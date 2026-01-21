package net.codingseal.animotion;

import net.codingseal.animotion.entity.ModEntities;
import net.codingseal.animotion.entity.custom.*;
import net.codingseal.animotion.item.ModItemsGroups;
import net.codingseal.animotion.item.ModItems;
import net.codingseal.animotion.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
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

        FabricDefaultAttributeRegistry.register(ModEntities.GRAY_REEF_SHARK, Gray_Reef_SharkEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.GREAT_WHITE_SHARK, Great_White_SharkEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.HAMMERHEAD_SHARK, Hammerhead_SharkEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.TIGER_SHARK, Tiger_SharkEntity.createAttributes());

        FabricDefaultAttributeRegistry.register(ModEntities.CRAB, CrabEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.PENGUIN, PenguinEntity.createAttributes());





    }
}