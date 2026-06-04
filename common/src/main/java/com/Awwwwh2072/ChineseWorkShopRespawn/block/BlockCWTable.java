package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * Table — four-leg table with connections that hide legs when next to another table.
 */
public class BlockCWTable extends BlockCWT {

    public static final BooleanProperty NW = BooleanProperty.create("nw");
    public static final BooleanProperty NE = BooleanProperty.create("ne");
    public static final BooleanProperty SE = BooleanProperty.create("se");
    public static final BooleanProperty SW = BooleanProperty.create("sw");

    private static final VoxelShape PLATE = Shapes.box(0.0D, 0.875D, 0.0D, 1.0D, 1.0D, 1.0D);
    private static final VoxelShape LEG_NW = Shapes.box(0.1875D, 0.0D, 0.1875D, 0.3125D, 0.875D, 0.3125D);
    private static final VoxelShape LEG_NE = Shapes.box(0.6875D, 0.0D, 0.1875D, 0.8125D, 0.875D, 0.3125D);
    private static final VoxelShape LEG_SE = Shapes.box(0.6875D, 0.0D, 0.6875D, 0.8125D, 0.875D, 0.8125D);
    private static final VoxelShape LEG_SW = Shapes.box(0.1875D, 0.0D, 0.6875D, 0.3125D, 0.875D, 0.8125D);

    public BlockCWTable(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(NW, true).setValue(NE, true).setValue(SE, true).setValue(SW, true));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(NW, NE, SE, SW);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        // Compute leg visibility based on neighbors
        BlockState actualState = computeLegs(level, pos);
        VoxelShape shape = PLATE;
        if (actualState.getValue(NW)) shape = Shapes.or(shape, LEG_NW);
        if (actualState.getValue(NE)) shape = Shapes.or(shape, LEG_NE);
        if (actualState.getValue(SE)) shape = Shapes.or(shape, LEG_SE);
        if (actualState.getValue(SW)) shape = Shapes.or(shape, LEG_SW);
        return shape;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return getShape(state, level, pos, context);
    }

    /**
     * Compute which legs should be visible by checking for adjacent tables.
     * Ported from the original getActualState() logic.
     */
    private BlockState computeLegs(BlockGetter level, BlockPos pos) {
        int mask = 0;
        for (int i = 0; i < 4; i++) {
            Direction dir = Direction.from2DDataValue(i);
            if (level.getBlockState(pos.relative(dir)).getBlock() == this) {
                mask |= 1 << i;
            }
        }
        boolean nw, ne, se, sw;
        switch (mask) {
            case 0 -> { nw = ne = se = sw = true; }
            case 3 -> { ne = true; nw = se = sw = false; }
            case 6 -> { se = true; nw = ne = sw = false; }
            case 12 -> { sw = true; nw = ne = se = false; }
            case 9 -> { nw = true; ne = se = sw = false; }
            case 1 -> { nw = ne = true; se = sw = false; }
            case 2 -> { ne = se = true; nw = sw = false; }
            case 4 -> { se = sw = true; nw = ne = false; }
            case 8 -> { nw = sw = true; ne = se = false; }
            default -> { nw = ne = se = sw = true; }
        }
        return this.defaultBlockState()
                .setValue(NW, nw).setValue(NE, ne).setValue(SE, se).setValue(SW, sw);
    }
}
