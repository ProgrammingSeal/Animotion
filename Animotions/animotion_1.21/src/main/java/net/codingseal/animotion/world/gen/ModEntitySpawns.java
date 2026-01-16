package net.codingseal.animotion.world.gen;

import net.codingseal.animotion.entity.ModEntities;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnLocationTypes;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntitySpawns {
    public static void addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BEACH, BiomeKeys.FROZEN_RIVER),
                SpawnGroup.CREATURE, ModEntities.BAIKAL_SEAL, 30, 1, 7);
        SpawnRestriction.register(ModEntities.BAIKAL_SEAL, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (type, world, reason, pos, random) -> true);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BEACH, BiomeKeys.FROZEN_RIVER),
                SpawnGroup.CREATURE, ModEntities.CRABEATER_SEAL, 30, 1, 7);
        SpawnRestriction.register(ModEntities.CRABEATER_SEAL, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (type, world, reason, pos, random) -> true);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BEACH, BiomeKeys.FROZEN_RIVER),
                SpawnGroup.CREATURE, ModEntities.GREY_SEAL, 30, 1, 7);
        SpawnRestriction.register(ModEntities.GREY_SEAL, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (type, world, reason, pos, random) -> true);


        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BEACH, BiomeKeys.FROZEN_RIVER),
                SpawnGroup.CREATURE, ModEntities.HARP_SEAL, 30, 1, 7);
        SpawnRestriction.register(ModEntities.HARP_SEAL, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (type, world, reason, pos, random) -> true);


        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BEACH, BiomeKeys.FROZEN_RIVER),
                SpawnGroup.CREATURE, ModEntities.LEOPARD_SEAL, 30, 1, 7);
        SpawnRestriction.register(ModEntities.LEOPARD_SEAL, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (type, world, reason, pos, random) -> true);


        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BEACH, BiomeKeys.FROZEN_RIVER),
                SpawnGroup.CREATURE, ModEntities.SEAL, 30, 1, 7);
        SpawnRestriction.register(ModEntities.SEAL, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (type, world, reason, pos, random) -> true);


        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BEACH, BiomeKeys.FROZEN_RIVER),
                SpawnGroup.CREATURE, ModEntities.SOUTHERN_ELEPHANT_SEAL, 30, 1, 7);
        SpawnRestriction.register(ModEntities.SOUTHERN_ELEPHANT_SEAL, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (type, world, reason, pos, random) -> true);



    }
}
