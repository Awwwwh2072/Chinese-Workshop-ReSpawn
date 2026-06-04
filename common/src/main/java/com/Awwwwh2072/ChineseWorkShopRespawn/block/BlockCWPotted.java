package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Potted plant — translucent decoration with no collision.
 */
public class BlockCWPotted extends BlockCWT {

    private static final VoxelShape SHAPE = Shapes.box(0.125D, 0.0D, 0.125D, 0.875D, 1.0D, 0.875D);

    public BlockCWPotted(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, net.minecraft.world.level.BlockGetter level,
                               net.minecraft.core.BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, net.minecraft.world.level.BlockGetter level,
                                        net.minecraft.core.BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }
}
