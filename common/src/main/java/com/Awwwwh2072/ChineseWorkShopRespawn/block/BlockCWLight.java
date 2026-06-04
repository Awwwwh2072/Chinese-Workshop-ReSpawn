package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import java.util.function.ToIntFunction;

import net.minecraft.world.level.block.state.BlockState;

/**
 * Transparent block that emits light, e.g. lanterns and candles.
 */
public class BlockCWLight extends BlockCWT {

    public BlockCWLight(Properties properties) {
        super(properties);
    }

    /**
     * Convenience factory that sets the light level on the properties.
     *
     * @param properties base properties (without light level)
     * @param lightLevel a constant light level (0-15)
     * @return a new BlockCWLight with the given light level
     */
    public static BlockCWLight withLight(Properties properties, int lightLevel) {
        ToIntFunction<BlockState> lightFn = state -> lightLevel;
        return new BlockCWLight(properties.lightLevel(lightFn));
    }
}
