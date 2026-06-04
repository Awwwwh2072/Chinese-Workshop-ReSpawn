package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Thin andesite fence — matches the original ChineseWorkshop AndesiteFenceBlock.
 * Uses extremely thin dimensions (nodeWidth=0, extensionWidth=1.5)
 * and connects only to blocks of the exact same type.
 */
public class BlockCWAndesiteFence extends BlockCWFence {

    private final VoxelShape[] wallShapes;
    private final VoxelShape[] wallCollisionShapes;

    public BlockCWAndesiteFence(Properties properties) {
        super(0.0F, 1.5F, 16.0F, 16.0F, 24.0F, properties);
        this.wallShapes = this.makeShapes(2.0F, 1.5F, 18.0F, 0.0F, 16.0F);
        this.wallCollisionShapes = this.makeShapes(2.0F, 1.5F, 24.0F, 0.0F, 24.0F);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        return this.wallShapes[this.getAABBIndex(state)];
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        return this.wallCollisionShapes[this.getAABBIndex(state)];
    }

    @Override
    public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos,
                                  PathComputationType type) {
        return false;
    }

    /**
     * Only connect to the exact same block instance (not just the same class).
     */
    @Override
    public boolean shouldConnect(BlockState neighborState, boolean isSolid, Direction direction) {
        Block neighborBlock = neighborState.getBlock();
        return (!isExceptionForConnection(neighborState) && isSolid) || neighborBlock == this;
    }
}
