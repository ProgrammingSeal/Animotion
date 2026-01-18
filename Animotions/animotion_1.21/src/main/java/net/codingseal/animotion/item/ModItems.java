package net.codingseal.animotion.item;

import net.codingseal.animotion.Animotion;
import net.codingseal.animotion.entity.ModEntities;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BAIKAL_SEAL_SPAWN_EGG = registerItem("baikal_seal_spawn_egg",
            new SpawnEggItem(ModEntities.BAIKAL_SEAL, 0x2e2f38, 0x6d6f7a, new Item.Settings()));
    public static final Item CRABEATER_SEAL_SPAWN_EGG = registerItem("crabeater_seal_spawn_egg",
            new SpawnEggItem(ModEntities.CRABEATER_SEAL, 0xd8cfae, 0xf3e9c9, new Item.Settings()));
    public static final Item GREY_SEAL_SPAWN_EGG = registerItem("grey_seal_spawn_egg",
            new SpawnEggItem(ModEntities.GREY_SEAL, 0x4a4f52, 0xbfc4c8, new Item.Settings()));
    public static final Item HARP_SEAL_SPAWN_EGG = registerItem("harp_seal_spawn_egg",
            new SpawnEggItem(ModEntities.HARP_SEAL, 0xdfe6eb, 0x1a1a1a, new Item.Settings()));
    public static final Item LEOPARD_SEAL_SPAWN_EGG = registerItem("leopard_seal_spawn_egg",
            new SpawnEggItem(ModEntities.LEOPARD_SEAL, 0x3c4650, 0xaec4d1, new Item.Settings()));
    public static final Item SEAL_SPAWN_EGG = registerItem("seal_spawn_egg",
            new SpawnEggItem(ModEntities.SEAL, 0xffffff, 0xf2f2f2, new Item.Settings()));
    public static final Item SOUTHERN_ELEPHANT_SEAL_SPAWN_EGG = registerItem("southern_elephant_seal_spawn_egg",
            new SpawnEggItem(ModEntities.SOUTHERN_ELEPHANT_SEAL, 0x6b5a4a, 0xa48f7a, new Item.Settings()));


    public static final Item GRAY_REEF_SHARK_SPAWN_EGG = registerItem("gray_reef_shark_spawn_egg",
            new SpawnEggItem(ModEntities.GRAY_REEF_SHARK,  0x6F6F6A, 0xCFCFC8, new Item.Settings()));
    public static final Item GREAT_WHITE_SHARK_SPAWN_EGG = registerItem("great_white_shark_spawn_egg",
            new SpawnEggItem(ModEntities.GREAT_WHITE_SHARK,0x4A4F55,0xF2F2F2, new Item.Settings()));
    public static final Item HAMMERHEAD_SHARK_SPAWN_EGG = registerItem("hammerhead_shark_spawn_egg",
            new SpawnEggItem(ModEntities.HAMMERHEAD_SHARK, 0x5E6B64, 0xD8D2C4, new Item.Settings()));
    public static final Item TIGER_SHARK_SPAWN_EGG = registerItem("tiger_shark_spawn_egg",
            new SpawnEggItem(ModEntities.TIGER_SHARK, 0x7A6A4F, 0xC9B873, new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Animotion.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Animotion.LOGGER.info("Registering ModItems " + Animotion.MOD_ID);


    }
}

