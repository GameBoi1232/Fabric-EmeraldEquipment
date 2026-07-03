package net.tbbtly.emeraldequipment.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.tbbtly.emeraldequipment.tags.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

        //tag(ModTags.Blocks.NEEDS_EMERALD_TOOL).addTag(BlockTags.NEEDS_IRON_TOOL);
        //tag(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL).addTag(BlockTags.NEEDS_DIAMOND_TOOL);

    }

}
