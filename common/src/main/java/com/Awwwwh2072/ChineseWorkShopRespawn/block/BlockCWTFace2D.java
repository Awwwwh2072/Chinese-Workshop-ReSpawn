package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

/**
 * Transparent block that uses a simplified two-axis facing
 * (EAST–WEST / SOUTH–NORTH) instead of the full four directions.
 */
public class BlockCWTFace2D extends BlockCWT {

    public static final PropertyDirection2D FACING = PropertyDirection2D.create("facing");

    public BlockCWTFace2D(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, EnumFacing2D.EAST_WEST));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING,
                EnumFacing2D.fromDirection(context.getHorizontalDirection()));
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, state.getValue(FACING).rotate(rotation));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.setValue(FACING, state.getValue(FACING).mirror(mirror));
    }
}
