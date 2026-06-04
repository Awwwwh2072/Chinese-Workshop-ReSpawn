package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import java.util.Arrays;
import net.minecraft.world.level.block.state.properties.EnumProperty;

/**
 * A block-state property for {@link EnumFacing2D}.
 */
public class PropertyDirection2D extends EnumProperty<EnumFacing2D> {

    protected PropertyDirection2D(String name) {
        super(name, EnumFacing2D.class, Arrays.asList(EnumFacing2D.values()));
    }

    public static PropertyDirection2D create(String name) {
        return new PropertyDirection2D(name);
    }
}
