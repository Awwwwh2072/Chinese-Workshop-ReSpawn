package com.Awwwwh2072.ChineseWorkShopRespawn.registry;

import com.Awwwwh2072.ChineseWorkShopRespawn.Constants;
import com.Awwwwh2072.ChineseWorkShopRespawn.block.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);

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
    public static final RegistryObject<Block> BLACK_BRICK_BLOCK = BLOCKS.register("black_brick_block",
            () -> new BlockCW(stone(1.0F)));
    public static final RegistryObject<Block> WHITE_GRAY_WALL = BLOCKS.register("white_gray_wall",
            () -> new BlockCW(stone(1.0F)));
    public static final RegistryObject<Block> BLACK_CLAY_BLOCK = BLOCKS.register("black_clay_block",
            () -> new BlockCWBlackClay(stone(1.0F)));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_PLANKS = BLOCKS.register("red_stained_wooden_planks",
            () -> new BlockCW(wood(1.0F)));
    public static final RegistryObject<Block> RAMMED_EARTH = BLOCKS.register("rammed_earth",
            () -> new BlockCW(earth(1.0F)));
    public static final RegistryObject<Block> ANDESITE_PAVEMENT = BLOCKS.register("andesite_pavement",
            () -> new BlockCW(stone(1.0F)));
    public static final RegistryObject<Block> WHITE_ASH_BLOCK = BLOCKS.register("white_ash_block",
            () -> new BlockCW(stone(1.0F)));
    public static final RegistryObject<Block> YELLOW_CLAY_BLOCK = BLOCKS.register("yellow_clay_block",
            () -> new BlockCW(stone(1.0F)));
    public static final RegistryObject<Block> PAINTED_BLOCK = BLOCKS.register("painted_block",
            () -> new BlockCW(stone(1.0F)));

    // ========================================================================
    // Pillars
    // ========================================================================
    public static final RegistryObject<Block> RED_PILLAR = BLOCKS.register("red_pillar",
            () -> new BlockCWRotatedPillar(wood(1.0F)));
    public static final RegistryObject<Block> DARK_GREEN_PILLAR = BLOCKS.register("dark_green_pillar",
            () -> new BlockCWRotatedPillar(wood(1.0F)));

    // ========================================================================
    // Stairs
    // ========================================================================
    public static final RegistryObject<Block> BLACK_BRICK_STAIRS = BLOCKS.register("black_brick_stairs",
            () -> new BlockCWStairs(BLACK_BRICK_BLOCK.get().defaultBlockState(), stone(1.0F)));
    public static final RegistryObject<Block> WHITE_ASH_STAIRS = BLOCKS.register("white_ash_stairs",
            () -> new BlockCWStairs(WHITE_ASH_BLOCK.get().defaultBlockState(), stone(1.0F)));
    public static final RegistryObject<Block> RAMMED_EARTH_STAIRS = BLOCKS.register("rammed_earth_stairs",
            () -> new BlockCWStairs(RAMMED_EARTH.get().defaultBlockState(), earth(1.0F)));
    public static final RegistryObject<Block> ANDESITE_PAVEMENT_STAIRS = BLOCKS.register("andesite_pavement_stairs",
            () -> new BlockCWStairs(ANDESITE_PAVEMENT.get().defaultBlockState(), stone(1.0F)));

    // ========================================================================
    // Slabs
    // ========================================================================
    public static final RegistryObject<Block> BLACK_BRICK_SLAB = BLOCKS.register("black_brick_slab",
            () -> new BlockCWSlab(stone(1.0F)));
    public static final RegistryObject<Block> WHITE_ASH_SLAB = BLOCKS.register("white_ash_slab",
            () -> new BlockCWSlab(stone(1.0F)));
    public static final RegistryObject<Block> RAMMED_EARTH_SLAB = BLOCKS.register("rammed_earth_slab",
            () -> new BlockCWSlab(earth(1.0F)));
    public static final RegistryObject<Block> ANDESITE_PAVEMENT_SLAB = BLOCKS.register("andesite_pavement_slab",
            () -> new BlockCWSlab(stone(1.0F)));

    // ========================================================================
    // Black tile roof blocks (Phase 1: simplified to facing only)
    // ========================================================================
    public static final RegistryObject<Block> BLACK_TILE_ROOF = BLOCKS.register("black_tile_roof",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_ROOF_J = BLOCKS.register("black_tile_roof_j",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_ROOF_RIDGE = BLOCKS.register("black_tile_roof_ridge",
            () -> new BlockCWTFace2D(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_ROOF_RIDGE_J = BLOCKS.register("black_tile_roof_ridge_j",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_ROOF_RIDGE_TOP = BLOCKS.register("black_tile_roof_ridge_top",
            () -> new BlockCWTFace2D(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_ROOF_SLAB = BLOCKS.register("black_tile_roof_slab",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_ROOF_SLAB_TOP = BLOCKS.register("black_tile_roof_slab_top",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));

    // ========================================================================
    // Thatch roof blocks
    // ========================================================================
    public static final RegistryObject<Block> THATCH_ROOF = BLOCKS.register("thatch_roof",
            () -> new BlockCWTFace(wood(1.0F).noOcclusion()));
    public static final RegistryObject<Block> THATCH_ROOF_RIDGE = BLOCKS.register("thatch_roof_ridge",
            () -> new BlockCWTFace2D(wood(1.0F).noOcclusion()));
    public static final RegistryObject<Block> THATCH_ROOF_RIDGE_TOP = BLOCKS.register("thatch_roof_ridge_top",
            () -> new BlockCWTFace2D(wood(1.0F).noOcclusion()));
    public static final RegistryObject<Block> THATCH_ROOF_SLAB = BLOCKS.register("thatch_roof_slab",
            () -> new BlockCWTFace(wood(1.0F).noOcclusion()));
    public static final RegistryObject<Block> THATCH_ROOF_SLAB_TOP = BLOCKS.register("thatch_roof_slab_top",
            () -> new BlockCWTFace(wood(1.0F).noOcclusion()));

    // ========================================================================
    // Roof tile edges
    // ========================================================================
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE = BLOCKS.register("black_roof_tile_edge",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE_CW = BLOCKS.register("black_roof_tile_edge_cw",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE_RR = BLOCKS.register("black_roof_tile_edge_rr",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE_WB = BLOCKS.register("black_roof_tile_edge_wb",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE_J_CW = BLOCKS.register("black_roof_tile_edge_j_cw",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE_J_RR = BLOCKS.register("black_roof_tile_edge_j_rr",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE_J_WB = BLOCKS.register("black_roof_tile_edge_j_wb",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE_SLAB = BLOCKS.register("black_roof_tile_edge_slab",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE_SLAB_CW = BLOCKS.register("black_roof_tile_edge_slab_cw",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE_SLAB_RR = BLOCKS.register("black_roof_tile_edge_slab_rr",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE_SLAB_WB = BLOCKS.register("black_roof_tile_edge_slab_wb",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE_SLAB_T_CW = BLOCKS.register("black_roof_tile_edge_slab_t_cw",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE_SLAB_T_RR = BLOCKS.register("black_roof_tile_edge_slab_t_rr",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_ROOF_TILE_EDGE_SLAB_T_WB = BLOCKS.register("black_roof_tile_edge_slab_t_wb",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));

    // ========================================================================
    // Tile ridge roof edges
    // ========================================================================
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE = BLOCKS.register("black_tile_ridge_roof_edge",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE_BB = BLOCKS.register("black_tile_ridge_roof_edge_bb",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE_C = BLOCKS.register("black_tile_ridge_roof_edge_c",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE_RB = BLOCKS.register("black_tile_ridge_roof_edge_rb",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE_RE = BLOCKS.register("black_tile_ridge_roof_edge_re",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE_W = BLOCKS.register("black_tile_ridge_roof_edge_w",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE_WG = BLOCKS.register("black_tile_ridge_roof_edge_wg",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE_TOP = BLOCKS.register("black_tile_ridge_roof_edge_top",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE_T_BB = BLOCKS.register("black_tile_ridge_roof_edge_t_bb",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE_T_C = BLOCKS.register("black_tile_ridge_roof_edge_t_c",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE_T_RB = BLOCKS.register("black_tile_ridge_roof_edge_t_rb",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE_T_RE = BLOCKS.register("black_tile_ridge_roof_edge_t_re",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE_T_W = BLOCKS.register("black_tile_ridge_roof_edge_t_w",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BLACK_TILE_RIDGE_ROOF_EDGE_T_WG = BLOCKS.register("black_tile_ridge_roof_edge_t_wg",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));

    // ========================================================================
    // Thatch roof edges
    // ========================================================================
    public static final RegistryObject<Block> THATCH_ROOF_TILE_EDGE = BLOCKS.register("thatch_roof_tile_edge",
            () -> new BlockCWTFace(wood(1.0F).noOcclusion()));
    public static final RegistryObject<Block> THATCH_ROOF_TILE_EDGE_SLAB = BLOCKS.register("thatch_roof_tile_edge_slab",
            () -> new BlockCWTFace(wood(1.0F).noOcclusion()));
    public static final RegistryObject<Block> THATCH_TILE_RIDGE_ROOF_EDGE = BLOCKS.register("thatch_tile_ridge_roof_edge",
            () -> new BlockCWTFace(wood(1.0F).noOcclusion()));
    public static final RegistryObject<Block> THATCH_TILE_RIDGE_ROOF_EDGE_TOP = BLOCKS.register("thatch_tile_ridge_roof_edge_top",
            () -> new BlockCWTFace(wood(1.0F).noOcclusion()));

    // ========================================================================
    // Yellow roof variants
    // ========================================================================
    public static final RegistryObject<Block> YELLOW_ROOF_TILE_EDGE = BLOCKS.register("yellow_roof_tile_edge",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_ROOF_TILE_EDGE_SLAB = BLOCKS.register("yellow_roof_tile_edge_slab",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_TILE_ROOF = BLOCKS.register("yellow_tile_roof",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_TILE_ROOF_J = BLOCKS.register("yellow_tile_roof_j",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_TILE_ROOF_SLAB = BLOCKS.register("yellow_tile_roof_slab",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_TILE_ROOF_SLAB_TOP = BLOCKS.register("yellow_tile_roof_slab_top",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_ROOF_TILE_RIDGE = BLOCKS.register("yellow_roof_tile_ridge",
            () -> new BlockCWTFace2D(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_TILE_RIDGE_ROOF_TOP = BLOCKS.register("yellow_tile_ridge_roof_top",
            () -> new BlockCWTFace2D(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_TILE_RIDGE_ROOF_EDGE = BLOCKS.register("yellow_tile_ridge_roof_edge",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_TILE_RIDGE_ROOF_EDGE_TOP = BLOCKS.register("yellow_tile_ridge_roof_edge_top",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> YELLOW_TILE_RIDGE_ROOF_J = BLOCKS.register("yellow_tile_ridge_roof_j",
            () -> new BlockCWTFace(stone(1.0F).noOcclusion()));

    // ========================================================================
    // Fences & Walls
    // ========================================================================
    public static final RegistryObject<Block> OAK_CHINESE_FENCE = BLOCKS.register("oak_chinese_fence",
            () -> new BlockCWFence(wood(2.0F)));
    public static final RegistryObject<Block> DIORITE_FENCE = BLOCKS.register("diorite_fence",
            () -> new BlockCWSmallFence(stone(1.0F)));
    public static final RegistryObject<Block> ANDESITE_FENCE = BLOCKS.register("andesite_fence",
            () -> new BlockCWAndesiteFence(stone(1.0F)));
    public static final RegistryObject<Block> BLACK_BRICK_WALL = BLOCKS.register("black_brick_wall",
            () -> new BlockCWSmallFence(stone(1.0F)));
    public static final RegistryObject<Block> WHITE_ASH_WALL = BLOCKS.register("white_ash_wall",
            () -> new BlockCWSmallFence(stone(1.0F)));
    public static final RegistryObject<Block> RAMMED_EARTH_WALL = BLOCKS.register("rammed_earth_wall",
            () -> new BlockCWSmallFence(earth(1.0F)));
    public static final RegistryObject<Block> OAK_WALL = BLOCKS.register("oak_wall",
            () -> new BlockCWSmallFence(wood(1.0F)));
    public static final RegistryObject<Block> LITHEL_DECO = BLOCKS.register("lithel_deco",
            () -> new BlockCWSmallFence(stone(1.0F)));
    public static final RegistryObject<Block> PAINTED_WALL = BLOCKS.register("painted_wall",
            () -> new BlockCWSmallFence(stone(1.0F)));
    public static final RegistryObject<Block> WOODEN_WINDOW = BLOCKS.register("wooden_window",
            () -> new BlockCWSmallFence(wood(1.0F)));
    public static final RegistryObject<Block> DIORITE_WINDOW = BLOCKS.register("diorite_window",
            () -> new BlockCWSmallFence(stone(1.0F)));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_PLANKS_WALL =
            BLOCKS.register("red_stained_wooden_planks_wall",
            () -> new BlockCWSmallFence(wood(1.0F)));

    public static final RegistryObject<Block> RED_STAINED_WOODEN_PLANKS_UPPER_DOOR_FRAME =
            BLOCKS.register("red_stained_wooden_planks_upper_door_frame",
            () -> new BlockCWUpperDoorFrame(stone(1.0F)));

    // ========================================================================
    // Panes
    // ========================================================================
    public static final RegistryObject<Block> PAPER_WINDOW = BLOCKS.register("paper_window",
            () -> new BlockCWPane(stone(0.5F).noOcclusion()));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_PLANKS_PAPER_WINDOW =
            BLOCKS.register("red_stained_wooden_planks_paper_window",
            () -> new BlockCWPane(wood(0.5F).noOcclusion()));

    // ========================================================================
    // Doors
    // ========================================================================
    public static final RegistryObject<Block> CHINESE_OAK_DOOR = BLOCKS.register("chinese_oak_door",
            () -> new BlockCWDoor(stone(1.0F).noOcclusion(), BlockSetType.STONE));
    public static final RegistryObject<Block> HIGH_DOOR = BLOCKS.register("high_door",
            () -> new BlockCWDoor(wood(1.0F).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> WINDOW_DOOR = BLOCKS.register("window_door",
            () -> new BlockCWDoor(wood(1.0F).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> WOODEN_WINDOW_DOOR = BLOCKS.register("wooden_window_door",
            () -> new BlockCWDoor(wood(1.0F).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> RED_STAINED_WOODEN_PLANKS_WOODEN_WINDOW_DOOR =
            BLOCKS.register("red_stained_wooden_planks_wooden_window_door",
            () -> new BlockCWDoor(wood(1.0F).noOcclusion(), BlockSetType.OAK));

    // ========================================================================
    // Thin walls
    // ========================================================================
    public static final RegistryObject<Block> THIN_WHITE_GRAY_WALL = BLOCKS.register("thin_white_gray_wall",
            () -> new BlockCWThinWall(stone(1.0F).noOcclusion()));

    // ========================================================================
    // Lighting
    // ========================================================================
    public static final RegistryObject<Block> STONE_TOWER_LAMP = BLOCKS.register("stone_tower_lamp",
            () -> BlockCWLight.withLight(stone(1.0F).noOcclusion(), 15));
    public static final RegistryObject<Block> RED_LANTERN = BLOCKS.register("red_lantern",
            () -> BlockCWLight.withLight(stone(1.0F).noOcclusion(), 15));
    public static final RegistryObject<Block> WHITE_LANTERN = BLOCKS.register("white_lantern",
            () -> BlockCWLight.withLight(stone(1.0F).noOcclusion(), 15));
    public static final RegistryObject<Block> PALACE_LANTERN = BLOCKS.register("palace_lantern",
            () -> BlockCWLight.withLight(stone(1.0F).noOcclusion(), 15));

    // ========================================================================
    // Candle
    // ========================================================================
    public static final RegistryObject<Block> CANDLE = BLOCKS.register("candle",
            () -> new BlockCWCandle(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
                    .strength(0.0F).sound(SoundType.STONE).noOcclusion().lightLevel(s -> 12)));

    // ========================================================================
    // Decorative / Furniture
    // ========================================================================
    public static final RegistryObject<Block> TABLE = BLOCKS.register("table",
            () -> new BlockCWTable(wood(1.0F).noOcclusion()));
    public static final RegistryObject<Block> BENCH = BLOCKS.register("bench",
            () -> new BlockCWTFace2D(wood(1.0F).noOcclusion()));
    public static final RegistryObject<Block> CHAIR = BLOCKS.register("chair",
            () -> new BlockCWTFace(wood(1.0F).noOcclusion()));
    public static final RegistryObject<Block> WOODEN_THRESHOLD = BLOCKS.register("wooden_threshold",
            () -> new BlockCWThreshold(wood(1.0F).noOcclusion()));
    public static final RegistryObject<Block> STONE_THRESHOLD = BLOCKS.register("stone_threshold",
            () -> new BlockCWThreshold(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> MENDUN = BLOCKS.register("mendun",
            () -> new BlockCWMenDun(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> DOUGONG = BLOCKS.register("dougong",
            () -> new BlockCWDougong(wood(1.0F).noOcclusion()));
    public static final RegistryObject<Block> TREE_ALTAR = BLOCKS.register("tree_altar",
            () -> new BlockCWTreeBed(stone(1.0F).noOcclusion()));
    public static final RegistryObject<Block> POTTED = BLOCKS.register("potted",
            () -> new BlockCWPotted(stone(0.5F).noOcclusion()));
    public static final RegistryObject<Block> CARVING = BLOCKS.register("carving",
            () -> new BlockCWTFace2D(wood(1.0F).noOcclusion()));
}
