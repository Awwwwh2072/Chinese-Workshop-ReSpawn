package com.Awwwwh2072.ChineseWorkShopRespawn.block;

/**
 * Small fence - thinner posts than a standard fence.
 * Uses CrossCollisionBlock via BlockCWFence for wall-style connection logic.
 */
public class BlockCWSmallFence extends BlockCWFence {

    public BlockCWSmallFence(Properties properties) {
        super(4.0F, 4.0F, 16.0F, 16.0F, 16.0F, properties);
    }
}
