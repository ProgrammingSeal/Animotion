package net.codingseal.animotion.entity;

import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.custom.*;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<Baikal_SealEntity> BAIKAL_SEAL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Animotion.MOD_ID, "baikal_seal"),
            EntityType.Builder.create(Baikal_SealEntity::new, SpawnGroup.CREATURE).
                    dimensions(1f, 2.f).build());
    public static final EntityType<Crabeater_SealEntity> CRABEATER_SEAL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Animotion.MOD_ID, "crabeater_seal"),
            EntityType.Builder.create(Crabeater_SealEntity::new, SpawnGroup.CREATURE).
                    dimensions(1f, 2.f).build());

    public static final EntityType<Grey_SealEntity> GREY_SEAL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Animotion.MOD_ID, "grey_seal"),
            EntityType.Builder.create(Grey_SealEntity::new, SpawnGroup.CREATURE).
                    dimensions(1f, 2.f).build());

    public static final EntityType<Harp_SealEntity> HARP_SEAL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Animotion.MOD_ID, "harp_seal"),
            EntityType.Builder.create(Harp_SealEntity::new, SpawnGroup.CREATURE).
                    dimensions(1f, 2.f).build());

    public static final EntityType<Leopard_SealEntity> LEOPARD_SEAL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Animotion.MOD_ID, "leopard_seal"),
            EntityType.Builder.create(Leopard_SealEntity::new, SpawnGroup.CREATURE).
                    dimensions(1f, 2.f).build());

    public static final EntityType<SealEntity> SEAL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Animotion.MOD_ID, "seal"),
            EntityType.Builder.create(SealEntity::new, SpawnGroup.CREATURE).
                    dimensions(1f, 2.f).build());
    public static final EntityType<Southern_Elephant_SealEntity> SOUTHERN_ELEPHANT_SEAL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Animotion.MOD_ID, "southern_elephant_seal"),
            EntityType.Builder.create(Southern_Elephant_SealEntity::new, SpawnGroup.CREATURE).
                    dimensions(1f, 2.f).build());




    public static void registerModEntities() {
        Animotion.LOGGER.info("Registering Mod Entities for" + Animotion.MOD_ID);
    }
}
