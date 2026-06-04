package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import net.minecraft.world.level.block.Block;

/**
 * Transparent (non-full-cube) base block.
 * Sets noOcclusion on the properties so the model JSON
 * can declare a cutout render type.
 */
public class BlockCWT extends BlockCW {

    public BlockCWT(Properties properties) {
        super(properties.noOcclusion());
    }
}
