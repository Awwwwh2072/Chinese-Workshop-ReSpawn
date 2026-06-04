package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Thin wall (1/16 block thick), faces one of four horizontal directions.
 */
public class BlockCWThinWall extends BlockCWTFace {

    private static final VoxelShape AABB_EAST  = Shapes.box(0.0D, 0.0D, 0.0D, 0.0625D, 1.0D, 1.0D);
    private static final VoxelShape AABB_WEST  = Shapes.box(0.9375D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
    private static final VoxelShape AABB_SOUTH = Shapes.box(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.0625D);
    private static final VoxelShape AABB_NORTH = Shapes.box(0.0D, 0.0D, 0.9375D, 1.0D, 1.0D, 1.0D);

    public BlockCWThinWall(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, net.minecraft.world.level.BlockGetter level,
                               net.minecraft.core.BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        return switch (state.getValue(FACING)) {
            case EAST -> AABB_EAST;
            case WEST -> AABB_WEST;
            case SOUTH -> AABB_SOUTH;
            default -> AABB_NORTH;
        };
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, net.minecraft.world.level.BlockGetter level,
                                        net.minecraft.core.BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        return getShape(state, level, pos, context);
    }

    @Override
    public VoxelShape getOcclusionShape(BlockState state, net.minecraft.world.level.BlockGetter level,
                                        net.minecraft.core.BlockPos pos) {
        // Only the face opposite to facing direction is solid
        return switch (state.getValue(FACING)) {
            case EAST -> AABB_EAST;
            case WEST -> AABB_WEST;
            case SOUTH -> AABB_SOUTH;
            default -> AABB_NORTH;
        };
    }
}
