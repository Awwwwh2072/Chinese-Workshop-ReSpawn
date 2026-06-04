package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CrossCollisionBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;

/**
 * Chinese Workshop fence base - uses CrossCollisionBlock (same as vanilla walls)
 * with same-material-only connection logic, matching the original ChineseWorkshop mod.
 */
public class BlockCWFence extends CrossCollisionBlock {

    public static final BooleanProperty UP = BlockStateProperties.UP;

    public BlockCWFence(float nodeWidth, float extensionWidth, float nodeHeight,
                        float extensionHeight, float collisionY, Properties properties) {
        super(nodeWidth, extensionWidth, nodeHeight, extensionHeight, collisionY, properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(UP, true)
                .setValue(NORTH, false)
                .setValue(EAST, false)
                .setValue(SOUTH, false)
                .setValue(WEST, false)
                .setValue(WATERLOGGED, false));
    }

    public BlockCWFence(Properties properties) {
        this(4.0F, 4.0F, 16.0F, 16.0F, 16.0F, properties);
    }

    @Override
    public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos,
                                  PathComputationType type) {
        return false;
    }

    /**
     * Only connect to blocks of the exact same class and material.
     */
    public boolean shouldConnect(BlockState neighborState, boolean isSolid, Direction direction) {
        Block neighborBlock = neighborState.getBlock();
        return (!isExceptionForConnection(neighborState) && isSolid)
                || neighborBlock.getClass() == this.getClass();
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        var level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        var fluidState = context.getLevel().getFluidState(context.getClickedPos());

        BlockPos northPos = pos.north();
        BlockPos eastPos = pos.east();
        BlockPos southPos = pos.south();
        BlockPos westPos = pos.west();

        BlockState northState = level.getBlockState(northPos);
        BlockState eastState = level.getBlockState(eastPos);
        BlockState southState = level.getBlockState(southPos);
        BlockState westState = level.getBlockState(westPos);

        boolean north = shouldConnect(northState,
                northState.isFaceSturdy(level, northPos, Direction.SOUTH), Direction.SOUTH);
        boolean east = shouldConnect(eastState,
                eastState.isFaceSturdy(level, eastPos, Direction.WEST), Direction.WEST);
        boolean south = shouldConnect(southState,
                southState.isFaceSturdy(level, southPos, Direction.NORTH), Direction.NORTH);
        boolean west = shouldConnect(westState,
                westState.isFaceSturdy(level, westPos, Direction.EAST), Direction.EAST);

        boolean up = (!north || east || !south || west) && (north || !east || south || !west);

        return this.defaultBlockState()
                .setValue(UP, up || !level.isEmptyBlock(pos.above()))
                .setValue(NORTH, north)
                .setValue(EAST, east)
                .setValue(SOUTH, south)
                .setValue(WEST, west)
                .setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState,
                                  LevelAccessor level, BlockPos pos, BlockPos facingPos) {
        if (state.getValue(WATERLOGGED)) {
            level.getFluidTicks().willTickThisTick(pos, Fluids.WATER);
        }

        if (facing == Direction.DOWN) {
            return state;
        }

        Direction opposite = facing.getOpposite();
        boolean connect = facing == Direction.NORTH
                ? shouldConnect(facingState, facingState.isFaceSturdy(level, facingPos, opposite), opposite)
                : state.getValue(NORTH);
        boolean connect1 = facing == Direction.EAST
                ? shouldConnect(facingState, facingState.isFaceSturdy(level, facingPos, opposite), opposite)
                : state.getValue(EAST);
        boolean connect2 = facing == Direction.SOUTH
                ? shouldConnect(facingState, facingState.isFaceSturdy(level, facingPos, opposite), opposite)
                : state.getValue(SOUTH);
        boolean connect3 = facing == Direction.WEST
                ? shouldConnect(facingState, facingState.isFaceSturdy(level, facingPos, opposite), opposite)
                : state.getValue(WEST);

        boolean up = (!connect || connect1 || !connect2 || connect3)
                && (connect || !connect1 || connect2 || !connect3);

        return state.setValue(UP, up || !level.isEmptyBlock(pos.above()))
                .setValue(NORTH, connect)
                .setValue(EAST, connect1)
                .setValue(SOUTH, connect2)
                .setValue(WEST, connect3);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(UP, NORTH, EAST, WEST, SOUTH, WATERLOGGED);
    }
}
