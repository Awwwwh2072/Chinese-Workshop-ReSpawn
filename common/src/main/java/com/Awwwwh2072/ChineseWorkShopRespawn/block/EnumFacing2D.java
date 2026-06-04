package com.Awwwwh2072.ChineseWorkShopRespawn.block;

import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;

/**
 * A simplified two-direction enum that represents either
 * EAST–WEST or NORTH–SOUTH alignment. Used for decorative
 * blocks that should never face up or down.
 */
public enum EnumFacing2D implements StringRepresentable {
    EAST_WEST("east_west"),
    SOUTH_NORTH("south_north");

    private final String name;

    EnumFacing2D(String name) {
        this.name = name;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    /**
     * Convert a vanilla {@link Direction} into the closest 2D axis.
     */
    public static EnumFacing2D fromDirection(Direction facing) {
        return switch (facing) {
            case NORTH, SOUTH -> SOUTH_NORTH;
            default -> EAST_WEST;
        };
    }

    public EnumFacing2D rotate(Rotation rotation) {
        return rotation.ordinal() % 2 != 0 ? this.getOpposite() : this;
    }

    public EnumFacing2D mirror(Mirror mirror) {
        return mirror != Mirror.NONE ? this.getOpposite() : this;
    }

    public EnumFacing2D getOpposite() {
        return this == EAST_WEST ? SOUTH_NORTH : EAST_WEST;
    }
}
