package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Men Dun (gate pier / door stone) — decorative block placed beside doors.
 */
public class BlockCWMenDun extends BlockCWTFace {

    // Extended height compared to a regular block
    private static final VoxelShape SHAPE_EW = Shapes.box(0.125D, 0.0D, 0.0D, 0.875D, 1.3D, 1.0D);
    private static final VoxelShape SHAPE_SN = Shapes.box(0.0D, 0.0D, 0.125D, 1.0D, 1.3D, 0.875D);

    public BlockCWMenDun(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, net.minecraft.world.level.BlockGetter level,
                               net.minecraft.core.BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        Direction facing = state.getValue(FACING);
        return (facing == Direction.EAST || facing == Direction.WEST) ? SHAPE_EW : SHAPE_SN;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, net.minecraft.world.level.BlockGetter level,
                                        net.minecraft.core.BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        return getShape(state, level, pos, context);
    }
}
