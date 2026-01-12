package net.codingseal.animotion.entity;

import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.custom.SealEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<SealEntity> SEAL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Animotion.MOD_ID, "seal"),
            EntityType.Builder.create(SealEntity::new, SpawnGroup.CREATURE).
                    dimensions(1f, 2.f).build());


    public static void registerModEntities() {
        Animotion.LOGGER.info("Registering Mod Entities for" + Animotion.MOD_ID);
    }
}
