package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Candle — torch-like placement (floor and walls, not ceiling).
 */
public class BlockCWCandle extends BlockCWT {

    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    private static final VoxelShape SHAPE_UP    = Shapes.box(0.3D, 0.0D, 0.3D, 0.7D, 0.7D, 0.7D);
    private static final VoxelShape SHAPE_NORTH = Shapes.box(0.2D, 0.2D, 0.3D, 0.8D, 0.8D, 1.0D);
    private static final VoxelShape SHAPE_SOUTH = Shapes.box(0.2D, 0.1D, 0.0D, 0.8D, 0.8D, 0.7D);
    private static final VoxelShape SHAPE_WEST  = Shapes.box(0.3D, 0.2D, 0.2D, 1.0D, 0.8D, 0.8D);
    private static final VoxelShape SHAPE_EAST  = Shapes.box(0.0D, 0.2D, 0.2D, 0.7D, 0.8D, 0.8D);

    public BlockCWCandle(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.UP));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
            case SOUTH -> SHAPE_SOUTH;
            case NORTH -> SHAPE_NORTH;
            default -> SHAPE_UP;
        };
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        Direction direction = ctx.getClickedFace();
        // Never place facing DOWN
        if (direction == Direction.DOWN) {
            direction = Direction.UP;
        }
        return this.defaultBlockState().setValue(FACING, direction);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        double x = pos.getX() + 0.5D;
        double y = pos.getY() + 0.5D;
        double z = pos.getZ() + 0.5D;
        if (state.getValue(FACING).getAxis().isHorizontal()) {
            level.addParticle(ParticleTypes.SMOKE, x, y + 0.4D, z, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x, y + 0.4D, z, 0.0D, 0.0D, 0.0D);
        } else {
            level.addParticle(ParticleTypes.SMOKE, x, y + 0.1D, z, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, x, y + 0.1D, z, 0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }
}
