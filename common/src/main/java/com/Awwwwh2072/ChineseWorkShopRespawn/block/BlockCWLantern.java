package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Lantern — light-emitting block with no collision (entities pass through).
 */
public class BlockCWLantern extends BlockCWLight {

    // Supported by a thin pole in the middle
    private static final VoxelShape SHAPE = Shapes.or(
            Shapes.box(0.3125D, 0.125D, 0.3125D, 0.6875D, 1.0D, 0.6875D),
            Shapes.box(0.1875D, 0.0D, 0.1875D, 0.8125D, 0.125D, 0.8125D)
    );

    public BlockCWLantern(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }
}
