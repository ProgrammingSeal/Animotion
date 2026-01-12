package net.codingseal.animotion;

import net.codingseal.animotion.entity.ModEntities;
import net.codingseal.animotion.entity.custom.SealEntity;
import net.codingseal.animotion.item.ModItemsGroups;
import net.codingseal.animotion.item.ModItems;
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



        FabricDefaultAttributeRegistry.register(ModEntities.SEAL, SealEntity.createAttributes());
	}
}