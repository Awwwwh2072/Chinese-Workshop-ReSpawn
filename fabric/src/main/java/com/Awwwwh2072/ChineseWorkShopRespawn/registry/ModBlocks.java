package com.Awwwwh2072.ChineseWorkShopRespawn.registry;

import com.Awwwwh2072.ChineseWorkShopRespawn.Constants;
import com.Awwwwh2072.ChineseWorkShopRespawn.block.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {

    private static BlockBehaviour.Properties stone(float hardness) {
        return BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(hardness).sound(SoundType.STONE);
    }

    private static BlockBehaviour.Properties wood(float hardness) {
        return BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(hardness).sound(SoundType.WOOD);
    }

    private static BlockBehaviour.Properties earth(float hardness) {
        return BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE).strength(hardness).sound(SoundType.GRAVEL);
    }

    // ========================================================================
    // Full-cube blocks
    // ========================================================================
    public static final Block BLACK_BRICK_BLOCK = register("black_brick_block",
            new BlockCW(stone(1.0F)));
    public static final Block WHITE_GRAY_WALL = register("white_gray_wall",
            new BlockCW(stone(1.0F)));
    public static final Block BLACK_CLAY_BLOCK = register("black_clay_block",
            new BlockCWBlackClay(stone(1.0F)));
    public static final Block RED_STAINED_WOODEN_PLANKS = register("red_stained_wooden_planks",
            new BlockCW(wood(1.0F)));
    public static final Block RAMMED_EARTH = register("rammed_earth",
            new BlockCW(earth(1.0F)));
    public static final Block ANDESITE_PAVEMENT = register("andesite_pavement",
            new BlockCW(stone(1.0F)));
    public static final Block WHITE_ASH_BLOCK = register("white_ash_block",
            new BlockCW(stone(1.0F)));
    public static final Block YELLOW_CLAY_BLOCK = register("yellow_clay_block",
            new BlockCW(stone(1.0F)));
    public static final Block PAINTED_BLOCK = register("painted_block",
            new BlockCW(stone(1.0F)));

    // ========================================================================
    // Pillars
    // ========================================================================
    public static final Block RED_PILLAR = register("red_pillar",
            new BlockCWRotatedPillar(wood(1.0F)));
    public static final Block DARK_GREEN_PILLAR = register("dark_green_pillar",
            new BlockCWRotatedPillar(wood(1.0F)));

    // ========================================================================
    // Stairs
    // ========================================================================
    public static final Block BLACK_BRICK_STAIRS = register("black_brick_stairs",
            new BlockCWStairs(BLACK_BRICK_BLOCK.defaultBlockState(), stone(1.0F)));
    public static final Block WHITE_ASH_STAIRS = register("white_ash_stairs",
            new BlockCWStairs(WHITE_ASH_BLOCK.defaultBlockState(), stone(1.0F)));
    public static final Block RAMMED_EARTH_STAIRS = register("rammed_earth_stairs",
            new BlockCWStairs(RAMMED_EARTH.defaultBlockState(), earth(1.0F)));
    public static final Block ANDESITE_PAVEMENT_STAIRS = register("andesite_pavement_stairs",
            new BlockCWStairs(ANDESITE_PAVEMENT.defaultBlockState(), stone(1.0F)));

    // ========================================================================
    // Slabs
    // ========================================================================
    public static final Block BLACK_BRICK_SLAB = register("black_brick_slab",
            new BlockCWSlab(stone(1.0F)));
    public static final Block WHITE_ASH_SLAB = register("white_ash_slab",
            new BlockCWSlab(stone(1.0F)));
    public static final Block RAMMED_EARTH_SLAB = register("rammed_earth_slab",
            new BlockCWSlab(earth(1.0F)));
    public static final Block ANDESITE_PAVEMENT_SLAB = register("andesite_pavement_slab",
            new BlockCWSlab(stone(1.0F)));

    // ========================================================================
    // Black tile roof blocks (Phase 1: simplified to facing only)
    // ========================================================================
    public static final Block BLACK_TILE_ROOF = register("black_tile_roof",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_ROOF_J = register("black_tile_roof_j",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_ROOF_RIDGE = register("black_tile_roof_ridge",
            new BlockCWTFace2D(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_ROOF_RIDGE_J = register("black_tile_roof_ridge_j",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_ROOF_RIDGE_TOP = register("black_tile_roof_ridge_top",
            new BlockCWTFace2D(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_ROOF_SLAB = register("black_tile_roof_slab",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_ROOF_SLAB_TOP = register("black_tile_roof_slab_top",
            new BlockCWTFace(stone(1.0F).noOcclusion()));

    // ========================================================================
    // Thatch roof blocks
    // ========================================================================
    public static final Block THATCH_ROOF = register("thatch_roof",
            new BlockCWTFace(wood(1.0F).noOcclusion()));
    public static final Block THATCH_ROOF_RIDGE = register("thatch_roof_ridge",
            new BlockCWTFace2D(wood(1.0F).noOcclusion()));
    public static final Block THATCH_ROOF_RIDGE_TOP = register("thatch_roof_ridge_top",
            new BlockCWTFace2D(wood(1.0F).noOcclusion()));
    public static final Block THATCH_ROOF_SLAB = register("thatch_roof_slab",
            new BlockCWTFace(wood(1.0F).noOcclusion()));
    public static final Block THATCH_ROOF_SLAB_TOP = register("thatch_roof_slab_top",
            new BlockCWTFace(wood(1.0F).noOcclusion()));

    // ========================================================================
    // Roof tile edges
    // ========================================================================
    public static final Block BLACK_ROOF_TILE_EDGE = register("black_roof_tile_edge",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_ROOF_TILE_EDGE_CW = register("black_roof_tile_edge_cw",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_ROOF_TILE_EDGE_RR = register("black_roof_tile_edge_rr",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_ROOF_TILE_EDGE_WB = register("black_roof_tile_edge_wb",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_ROOF_TILE_EDGE_J_CW = register("black_roof_tile_edge_j_cw",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_ROOF_TILE_EDGE_J_RR = register("black_roof_tile_edge_j_rr",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_ROOF_TILE_EDGE_J_WB = register("black_roof_tile_edge_j_wb",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_ROOF_TILE_EDGE_SLAB = register("black_roof_tile_edge_slab",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_ROOF_TILE_EDGE_SLAB_CW = register("black_roof_tile_edge_slab_cw",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_ROOF_TILE_EDGE_SLAB_RR = register("black_roof_tile_edge_slab_rr",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_ROOF_TILE_EDGE_SLAB_WB = register("black_roof_tile_edge_slab_wb",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_ROOF_TILE_EDGE_SLAB_T_CW = register("black_roof_tile_edge_slab_t_cw",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_ROOF_TILE_EDGE_SLAB_T_RR = register("black_roof_tile_edge_slab_t_rr",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_ROOF_TILE_EDGE_SLAB_T_WB = register("black_roof_tile_edge_slab_t_wb",
            new BlockCWTFace(stone(1.0F).noOcclusion()));

    // ========================================================================
    // Tile ridge roof edges
    // ========================================================================
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE = register("black_tile_ridge_roof_edge",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE_BB = register("black_tile_ridge_roof_edge_bb",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE_C = register("black_tile_ridge_roof_edge_c",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE_RB = register("black_tile_ridge_roof_edge_rb",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE_RE = register("black_tile_ridge_roof_edge_re",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE_W = register("black_tile_ridge_roof_edge_w",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE_WG = register("black_tile_ridge_roof_edge_wg",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE_TOP = register("black_tile_ridge_roof_edge_top",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE_T_BB = register("black_tile_ridge_roof_edge_t_bb",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE_T_C = register("black_tile_ridge_roof_edge_t_c",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE_T_RB = register("black_tile_ridge_roof_edge_t_rb",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE_T_RE = register("black_tile_ridge_roof_edge_t_re",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE_T_W = register("black_tile_ridge_roof_edge_t_w",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block BLACK_TILE_RIDGE_ROOF_EDGE_T_WG = register("black_tile_ridge_roof_edge_t_wg",
            new BlockCWTFace(stone(1.0F).noOcclusion()));

    // ========================================================================
    // Thatch roof edges
    // ========================================================================
    public static final Block THATCH_ROOF_TILE_EDGE = register("thatch_roof_tile_edge",
            new BlockCWTFace(wood(1.0F).noOcclusion()));
    public static final Block THATCH_ROOF_TILE_EDGE_SLAB = register("thatch_roof_tile_edge_slab",
            new BlockCWTFace(wood(1.0F).noOcclusion()));
    public static final Block THATCH_TILE_RIDGE_ROOF_EDGE = register("thatch_tile_ridge_roof_edge",
            new BlockCWTFace(wood(1.0F).noOcclusion()));
    public static final Block THATCH_TILE_RIDGE_ROOF_EDGE_TOP = register("thatch_tile_ridge_roof_edge_top",
            new BlockCWTFace(wood(1.0F).noOcclusion()));

    // ========================================================================
    // Yellow roof variants
    // ========================================================================
    public static final Block YELLOW_ROOF_TILE_EDGE = register("yellow_roof_tile_edge",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block YELLOW_ROOF_TILE_EDGE_SLAB = register("yellow_roof_tile_edge_slab",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block YELLOW_TILE_ROOF = register("yellow_tile_roof",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block YELLOW_TILE_ROOF_J = register("yellow_tile_roof_j",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block YELLOW_TILE_ROOF_SLAB = register("yellow_tile_roof_slab",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block YELLOW_TILE_ROOF_SLAB_TOP = register("yellow_tile_roof_slab_top",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block YELLOW_ROOF_TILE_RIDGE = register("yellow_roof_tile_ridge",
            new BlockCWTFace2D(stone(1.0F).noOcclusion()));
    public static final Block YELLOW_TILE_RIDGE_ROOF_TOP = register("yellow_tile_ridge_roof_top",
            new BlockCWTFace2D(stone(1.0F).noOcclusion()));
    public static final Block YELLOW_TILE_RIDGE_ROOF_EDGE = register("yellow_tile_ridge_roof_edge",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block YELLOW_TILE_RIDGE_ROOF_EDGE_TOP = register("yellow_tile_ridge_roof_edge_top",
            new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final Block YELLOW_TILE_RIDGE_ROOF_J = register("yellow_tile_ridge_roof_j",
            new BlockCWTFace(stone(1.0F).noOcclusion()));

    // ========================================================================
    // Fences & Walls
    // ========================================================================
    public static final Block OAK_CHINESE_FENCE = register("oak_chinese_fence",
            new BlockCWFence(wood(2.0F)));
    public static final Block DIORITE_FENCE = register("diorite_fence",
            new BlockCWSmallFence(stone(1.0F)));
    public static final Block ANDESITE_FENCE = register("andesite_fence",
            new BlockCWAndesiteFence(stone(1.0F)));
    public static final Block BLACK_BRICK_WALL = register("black_brick_wall",
            new BlockCWSmallFence(stone(1.0F)));
    public static final Block WHITE_ASH_WALL = register("white_ash_wall",
            new BlockCWSmallFence(stone(1.0F)));
    public static final Block RAMMED_EARTH_WALL = register("rammed_earth_wall",
            new BlockCWSmallFence(earth(1.0F)));
    public static final Block OAK_WALL = register("oak_wall",
            new BlockCWSmallFence(wood(1.0F)));
    public static final Block LITHEL_DECO = register("lithel_deco",
            new BlockCWSmallFence(stone(1.0F)));
    public static final Block PAINTED_WALL = register("painted_wall",
            new BlockCWSmallFence(stone(1.0F)));
    public static final Block WOODEN_WINDOW = register("wooden_window",
            new BlockCWSmallFence(wood(1.0F)));
    public static final Block DIORITE_WINDOW = register("diorite_window",
            new BlockCWSmallFence(stone(1.0F)));
    public static final Block RED_STAINED_WOODEN_PLANKS_WALL =
            register("red_stained_wooden_planks_wall",
            new BlockCWSmallFence(wood(1.0F)));

    public static final Block RED_STAINED_WOODEN_PLANKS_UPPER_DOOR_FRAME =
            register("red_stained_wooden_planks_upper_door_frame",
            new BlockCWUpperDoorFrame(stone(1.0F)));

    // ========================================================================
    // Panes
    // ========================================================================
    public static final Block PAPER_WINDOW = register("paper_window",
            new BlockCWPane(stone(0.5F).noOcclusion()));
    public static final Block RED_STAINED_WOODEN_PLANKS_PAPER_WINDOW =
            register("red_stained_wooden_planks_paper_window",
            new BlockCWPane(wood(0.5F).noOcclusion()));

    // ========================================================================
    // Doors
    // ========================================================================
    public static final Block CHINESE_OAK_DOOR = register("chinese_oak_door",
            new BlockCWDoor(stone(1.0F).noOcclusion(), BlockSetType.STONE));
    public static final Block HIGH_DOOR = register("high_door",
            new BlockCWDoor(wood(1.0F).noOcclusion(), BlockSetType.OAK));
    public static final Block WINDOW_DOOR = register("window_door",
            new BlockCWDoor(wood(1.0F).noOcclusion(), BlockSetType.OAK));
    public static final Block WOODEN_WINDOW_DOOR = register("wooden_window_door",
            new BlockCWDoor(wood(1.0F).noOcclusion(), BlockSetType.OAK));
    public static final Block RED_STAINED_WOODEN_PLANKS_WOODEN_WINDOW_DOOR =
            register("red_stained_wooden_planks_wooden_window_door",
            new BlockCWDoor(wood(1.0F).noOcclusion(), BlockSetType.OAK));

    // ========================================================================
    // Thin walls
    // ========================================================================
    public static final Block THIN_WHITE_GRAY_WALL = register("thin_white_gray_wall",
            new BlockCWThinWall(stone(1.0F).noOcclusion()));

    // ========================================================================
    // Lighting
    // ========================================================================
    public static final Block STONE_TOWER_LAMP = register("stone_tower_lamp",
            BlockCWLight.withLight(stone(1.0F).noOcclusion(), 15));
    public static final Block RED_LANTERN = register("red_lantern",
            BlockCWLight.withLight(stone(1.0F).noOcclusion(), 15));
    public static final Block WHITE_LANTERN = register("white_lantern",
            BlockCWLight.withLight(stone(1.0F).noOcclusion(), 15));
    public static final Block PALACE_LANTERN = register("palace_lantern",
            BlockCWLight.withLight(stone(1.0F).noOcclusion(), 15));

    // ========================================================================
    // Candle
    // ========================================================================
    public static final Block CANDLE = register("candle",
            new BlockCWCandle(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
                    .strength(0.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 12)));

    // ========================================================================
    // Decorative / Furniture
    // ========================================================================
    public static final Block TABLE = register("table",
            new BlockCWTable(wood(1.0F).noOcclusion()));
    public static final Block BENCH = register("bench",
            new BlockCWTFace2D(wood(1.0F).noOcclusion()));
    public static final Block CHAIR = register("chair",
            new BlockCWTFace(wood(1.0F).noOcclusion()));
    public static final Block WOODEN_THRESHOLD = register("wooden_threshold",
            new BlockCWThreshold(wood(1.0F).noOcclusion()));
    public static final Block STONE_THRESHOLD = register("stone_threshold",
            new BlockCWThreshold(stone(1.0F).noOcclusion()));
    public static final Block MENDUN = register("mendun",
            new BlockCWMenDun(stone(1.0F).noOcclusion()));
    public static final Block DOUGONG = register("dougong",
            new BlockCWDougong(wood(1.0F).noOcclusion()));
    public static final Block TREE_ALTAR = register("tree_altar",
            new BlockCWTreeBed(stone(1.0F).noOcclusion()));
    public static final Block POTTED = register("potted",
            new BlockCWPotted(stone(0.5F).noOcclusion()));
    public static final Block CARVING = register("carving",
            new BlockCWTFace2D(wood(1.0F).noOcclusion()));

    // ========================================================================
    // Logo item (creative tab icon only, no block)
    // ========================================================================
    // Handled in ModItems

    // ========================================================================
    // Helpers
    // ========================================================================
    public static void init() {}

    private static <T extends Block> T register(String name, T block) {
        return Registry.register(BuiltInRegistries.BLOCK,
                new ResourceLocation(Constants.MOD_ID, name), block);
    }
}
