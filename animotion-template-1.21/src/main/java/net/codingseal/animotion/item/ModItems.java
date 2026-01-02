package net.codingseal.animotion.item;




import net.codingseal.animotion.Animotion;


import net.codingseal.animotion.entity.ModEntities;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SEAL_SPAWN_EGG = registerItem("seal_spawn_egg",
            new SpawnEggItem(ModEntities.SEAL, 0xffffff, 0xf2f2f2, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Animotion.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Animotion.LOGGER.info("Registering ModItems " + Animotion.MOD_ID);


    }
}

