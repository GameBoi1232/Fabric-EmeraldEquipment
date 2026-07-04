package net.tbbtly.emeraldequipment.item;

import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.tbbtly.emeraldequipment.EmeraldEquipment;
import net.tbbtly.emeraldequipment.tags.ModTags;

import static net.minecraft.world.item.equipment.ArmorMaterials.makeDefense;


public class ModArmorMaterials {
    public static final ResourceKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));

    public static final ResourceKey<EquipmentAsset> EMERALD_KEY = ResourceKey.create(REGISTRY_KEY, Identifier.fromNamespaceAndPath(EmeraldEquipment.MOD_ID, "emerald"));

    public static final ArmorMaterial EMERLAD_ARMOR_MATERIAL = new ArmorMaterial
            (25, makeDefense(3, 5, 6, 3, 5), 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, ModTags.Items.EMERALD_REPAIR, EMERALD_KEY);

}
