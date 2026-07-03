package net.tbbtly.emeraldequipment.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.tbbtly.emeraldequipment.tags.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.tbbtly.emeraldequipment.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        //  tag(BlockTags.NEEDS_IRON_TOOL).add(ModItems.getRK(ModItems.EMERALD_PICKAXE));
         // tag(BlockTags.INCORRECT_FOR_IRON_TOOL).add(ModItems.getRK(ModItems.EMERALD_PICKAXE));
    }

}
