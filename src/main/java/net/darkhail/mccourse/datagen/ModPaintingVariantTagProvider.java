package net.darkhail.mccourse.datagen;

import net.darkhail.mccourse.MCCourseMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PaintingVariantTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModPaintingVariantTagProvider extends PaintingVariantTagsProvider {
    public ModPaintingVariantTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pProvider, MCCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(PaintingVariantTags.PLACEABLE)
                .addOptional(new ResourceLocation(MCCourseMod.MOD_ID, "saw_them"))
                .addOptional(new ResourceLocation(MCCourseMod.MOD_ID, "world"))
                .addOptional(new ResourceLocation(MCCourseMod.MOD_ID, "shrimp"));
    }
}
