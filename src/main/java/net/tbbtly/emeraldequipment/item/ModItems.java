package net.tbbtly.emeraldequipment.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.*;
import net.tbbtly.emeraldequipment.EmeraldEquipment;
import net.tbbtly.emeraldequipment.tags.ModTags;

import java.util.function.Function;

public class ModItems {

    //item stats (Between Iron and Diamond)
    public static final Item EMERALD_SWORD = registerItem("emerald_sword",
            properties -> new Item(properties.sword(ModToolMaterials.EMERALD, 3.0f,-2.4f)));
    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            properties -> new AxeItem(ModToolMaterials.EMERALD, 5.5f,-3.0f,properties));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe",
            properties -> new HoeItem(ModToolMaterials.EMERALD, -2.0f,-3.0f,properties));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel",
            properties -> new ShovelItem(ModToolMaterials.EMERALD, 1.5f,-3.0f,properties));
    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.EMERALD, 1.0f,-2.8f)));
    public static final Item EMERALD_SPEAR = registerItem("emerald_spear",
            properties -> new Item(properties.spear(ModToolMaterials.EMERALD,1.0F, 1.0F, 0.55F, 2.75F, 10.5F, 6.75F, 5.1F, 10.5F, 4.6F)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(EmeraldEquipment.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(EmeraldEquipment.MOD_ID, name)))));
    }

    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    public static void registerModItems() {
        //EmeraldEquipment.LOGGER.info("Registering Mod Items for " + EmeraldEquipment.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(output -> {
            output.accept(EMERALD_SWORD);
            output.accept(EMERALD_SPEAR);
            output.accept(EMERALD_AXE);
        });

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(output -> {
            output.accept(EMERALD_SHOVEL);
            output.accept(EMERALD_PICKAXE);
            output.accept(EMERALD_AXE);
            output.accept(EMERALD_HOE);
        });
    }
}
