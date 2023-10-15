package net.darkhail.mccourse.entity.layers;

import net.darkhail.mccourse.MCCourseMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation RHINO_LAYER = new ModelLayerLocation(
            new ResourceLocation(MCCourseMod.MOD_ID, "rhino_layer"), "rhino_layer");

    public static final ModelLayerLocation MAGIC_PROJECTILE_LAYER = new ModelLayerLocation(
            new ResourceLocation(MCCourseMod.MOD_ID, "magic_projectile_layer"), "magic_projectile_layer");

}