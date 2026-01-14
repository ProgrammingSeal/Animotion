package net.codingseal.animotion.item;
import net.codingseal.animotion.Animotion;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroups {
    public static final ItemGroup SEAL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Animotion.MOD_ID, "mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.COD))
                    .displayName(Text.translatable("itemgroup.animotion.mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BAIKAL_SEAL_SPAWN_EGG);
                        entries.add(ModItems.CRABEATER_SEAL_SPAWN_EGG);
                        entries.add(ModItems.GREY_SEAL_SPAWN_EGG);
                        entries.add(ModItems.HARP_SEAL_SPAWN_EGG);
                        entries.add(ModItems.LEOPARD_SEAL_SPAWN_EGG);
                        entries.add(ModItems.SEAL_SPAWN_EGG);
                        entries.add(ModItems.SOUTHERN_ELEPHANT_SEAL_SPAWN_EGG);

                    }).build());

    public static final ItemGroup SPAWN_EGG_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Animotion.MOD_ID, "spawn_eggs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SEAL_SPAWN_EGG))
                    .displayName(Text.translatable("itemgroup.animotion.spawn_eggs"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BAIKAL_SEAL_SPAWN_EGG);
                        entries.add(ModItems.CRABEATER_SEAL_SPAWN_EGG);
                        entries.add(ModItems.GREY_SEAL_SPAWN_EGG);
                        entries.add(ModItems.HARP_SEAL_SPAWN_EGG);
                        entries.add(ModItems.LEOPARD_SEAL_SPAWN_EGG);
                        entries.add(ModItems.SEAL_SPAWN_EGG);
                        entries.add(ModItems.SOUTHERN_ELEPHANT_SEAL_SPAWN_EGG);
                    }).build());



    public static void registerItemsGroups() {

        Animotion.LOGGER.info("Registering Items Groups " + Animotion.MOD_ID);

    }
}
