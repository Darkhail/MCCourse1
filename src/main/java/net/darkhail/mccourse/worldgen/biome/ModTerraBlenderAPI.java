package net.darkhail.mccourse.worldgen.biome;

import net.darkhail.mccourse.MCCourseMod;
import net.darkhail.mccourse.worldgen.biome.custom.ModOverworldRegion;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerraBlenderAPI {
    public static void registerRegions() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(MCCourseMod.MOD_ID, "overworld"), 5));
    }
}
