package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import net.minecraft.world.level.block.Block;

/**
 * Base class for all ChineseWorkshop blocks.
 * Wraps a standard Block so concrete classes only
 * need to pass Properties through their constructor.
 */
public class BlockCW extends Block {

    public BlockCW(Properties properties) {
        super(properties);
    }
}
