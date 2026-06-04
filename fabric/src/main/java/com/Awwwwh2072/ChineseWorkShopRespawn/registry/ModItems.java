package com.Awwwwh2072.ChineseWorkShopRespawn.registry;

import com.Awwwwh2072.ChineseWorkShopRespawn.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ModItems {

    private static Item blockItem(BlockItem item, String name) {
        return Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Constants.MOD_ID, name), item);
    }

    private static Item registerItem(Item item, String name) {
        return Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Constants.MOD_ID, name), item);
    }

    // ========================================================================
    // Full-cube block items
    // ========================================================================
    public static final Item BLACK_BRICK_BLOCK = blockItem(
            new BlockItem(ModBlocks.BLACK_BRICK_BLOCK, new Item.Properties()), "black_brick_block");
    public static final Item WHITE_GRAY_WALL = blockItem(
            new BlockItem(ModBlocks.WHITE_GRAY_WALL, new Item.Properties()), "white_gray_wall");
    public static final Item BLACK_CLAY_BLOCK = blockItem(
            new BlockItem(ModBlocks.BLACK_CLAY_BLOCK, new Item.Properties()), "black_clay_block");
    public static final Item RED_STAINED_WOODEN_PLANKS = blockItem(
            new BlockItem(ModBlocks.RED_STAINED_WOODEN_PLANKS, new Item.Properties()), "red_stained_wooden_planks");
    public static final Item RAMMED_EARTH = blockItem(
            new BlockItem(ModBlocks.RAMMED_EARTH, new Item.Properties()), "rammed_earth");
    public static final Item ANDESITE_PAVEMENT = blockItem(
            new BlockItem(ModBlocks.ANDESITE_PAVEMENT, new Item.Properties()), "andesite_pavement");
    public static final Item WHITE_ASH_BLOCK = blockItem(
            new BlockItem(ModBlocks.WHITE_ASH_BLOCK, new Item.Properties()), "white_ash_block");
    public static final Item YELLOW_CLAY_BLOCK = blockItem(
            new BlockItem(ModBlocks.YELLOW_CLAY_BLOCK, new Item.Properties()), "yellow_clay_block");
    public static final Item PAINTED_BLOCK = blockItem(
            new BlockItem(ModBlocks.PAINTED_BLOCK, new Item.Properties()), "painted_block");

    // ========================================================================
    // Pillar block items
    // ========================================================================
    public static final Item RED_PILLAR = blockItem(
            new BlockItem(ModBlocks.RED_PILLAR, new Item.Properties()), "red_pillar");
    public static final Item DARK_GREEN_PILLAR = blockItem(
            new BlockItem(ModBlocks.DARK_GREEN_PILLAR, new Item.Properties()), "dark_green_pillar");

    // ========================================================================
    // Stair block items
    // ========================================================================
    public static final Item BLACK_BRICK_STAIRS = blockItem(
            new BlockItem(ModBlocks.BLACK_BRICK_STAIRS, new Item.Properties()), "black_brick_stairs");
    public static final Item WHITE_ASH_STAIRS = blockItem(
            new BlockItem(ModBlocks.WHITE_ASH_STAIRS, new Item.Properties()), "white_ash_stairs");
    public static final Item RAMMED_EARTH_STAIRS = blockItem(
            new BlockItem(ModBlocks.RAMMED_EARTH_STAIRS, new Item.Properties()), "rammed_earth_stairs");
    public static final Item ANDESITE_PAVEMENT_STAIRS = blockItem(
            new BlockItem(ModBlocks.ANDESITE_PAVEMENT_STAIRS, new Item.Properties()), "andesite_pavement_stairs");

    // ========================================================================
    // Slab block items
    // ========================================================================
    public static final Item BLACK_BRICK_SLAB = blockItem(
            new BlockItem(ModBlocks.BLACK_BRICK_SLAB, new Item.Properties()), "black_brick_slab");
    public static final Item WHITE_ASH_SLAB = blockItem(
            new BlockItem(ModBlocks.WHITE_ASH_SLAB, new Item.Properties()), "white_ash_slab");
    public static final Item RAMMED_EARTH_SLAB = blockItem(
            new BlockItem(ModBlocks.RAMMED_EARTH_SLAB, new Item.Properties()), "rammed_earth_slab");
    public static final Item ANDESITE_PAVEMENT_SLAB = blockItem(
            new BlockItem(ModBlocks.ANDESITE_PAVEMENT_SLAB, new Item.Properties()), "andesite_pavement_slab");

    // ========================================================================
    // Black tile roof block items
    // ========================================================================
    public static final Item BLACK_TILE_ROOF = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_ROOF, new Item.Properties()), "black_tile_roof");
    public static final Item BLACK_TILE_ROOF_J = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_ROOF_J, new Item.Properties()), "black_tile_roof_j");
    public static final Item BLACK_TILE_ROOF_RIDGE = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_ROOF_RIDGE, new Item.Properties()), "black_tile_roof_ridge");
    public static final Item BLACK_TILE_ROOF_RIDGE_J = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_ROOF_RIDGE_J, new Item.Properties()), "black_tile_roof_ridge_j");
    public static final Item BLACK_TILE_ROOF_RIDGE_TOP = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_ROOF_RIDGE_TOP, new Item.Properties()), "black_tile_roof_ridge_top");
    public static final Item BLACK_TILE_ROOF_SLAB = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_ROOF_SLAB, new Item.Properties()), "black_tile_roof_slab");
    public static final Item BLACK_TILE_ROOF_SLAB_TOP = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_ROOF_SLAB_TOP, new Item.Properties()), "black_tile_roof_slab_top");

    // ========================================================================
    // Thatch roof block items
    // ========================================================================
    public static final Item THATCH_ROOF = blockItem(
            new BlockItem(ModBlocks.THATCH_ROOF, new Item.Properties()), "thatch_roof");
    public static final Item THATCH_ROOF_RIDGE = blockItem(
            new BlockItem(ModBlocks.THATCH_ROOF_RIDGE, new Item.Properties()), "thatch_roof_ridge");
    public static final Item THATCH_ROOF_RIDGE_TOP = blockItem(
            new BlockItem(ModBlocks.THATCH_ROOF_RIDGE_TOP, new Item.Properties()), "thatch_roof_ridge_top");
    public static final Item THATCH_ROOF_SLAB = blockItem(
            new BlockItem(ModBlocks.THATCH_ROOF_SLAB, new Item.Properties()), "thatch_roof_slab");
    public static final Item THATCH_ROOF_SLAB_TOP = blockItem(
            new BlockItem(ModBlocks.THATCH_ROOF_SLAB_TOP, new Item.Properties()), "thatch_roof_slab_top");

    // ========================================================================
    // Roof tile edge block items
    // ========================================================================
    public static final Item BLACK_ROOF_TILE_EDGE = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE, new Item.Properties()), "black_roof_tile_edge");
    public static final Item BLACK_ROOF_TILE_EDGE_CW = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_CW, new Item.Properties()), "black_roof_tile_edge_cw");
    public static final Item BLACK_ROOF_TILE_EDGE_RR = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_RR, new Item.Properties()), "black_roof_tile_edge_rr");
    public static final Item BLACK_ROOF_TILE_EDGE_WB = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_WB, new Item.Properties()), "black_roof_tile_edge_wb");
    public static final Item BLACK_ROOF_TILE_EDGE_J_CW = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_J_CW, new Item.Properties()), "black_roof_tile_edge_j_cw");
    public static final Item BLACK_ROOF_TILE_EDGE_J_RR = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_J_RR, new Item.Properties()), "black_roof_tile_edge_j_rr");
    public static final Item BLACK_ROOF_TILE_EDGE_J_WB = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_J_WB, new Item.Properties()), "black_roof_tile_edge_j_wb");
    public static final Item BLACK_ROOF_TILE_EDGE_SLAB = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB, new Item.Properties()), "black_roof_tile_edge_slab");
    public static final Item BLACK_ROOF_TILE_EDGE_SLAB_CW = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB_CW, new Item.Properties()), "black_roof_tile_edge_slab_cw");
    public static final Item BLACK_ROOF_TILE_EDGE_SLAB_RR = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB_RR, new Item.Properties()), "black_roof_tile_edge_slab_rr");
    public static final Item BLACK_ROOF_TILE_EDGE_SLAB_WB = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB_WB, new Item.Properties()), "black_roof_tile_edge_slab_wb");
    public static final Item BLACK_ROOF_TILE_EDGE_SLAB_T_CW = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB_T_CW, new Item.Properties()), "black_roof_tile_edge_slab_t_cw");
    public static final Item BLACK_ROOF_TILE_EDGE_SLAB_T_RR = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB_T_RR, new Item.Properties()), "black_roof_tile_edge_slab_t_rr");
    public static final Item BLACK_ROOF_TILE_EDGE_SLAB_T_WB = blockItem(
            new BlockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB_T_WB, new Item.Properties()), "black_roof_tile_edge_slab_t_wb");

    // ========================================================================
    // Tile ridge roof edge block items
    // ========================================================================
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE, new Item.Properties()), "black_tile_ridge_roof_edge");
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE_BB = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_BB, new Item.Properties()), "black_tile_ridge_roof_edge_bb");
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE_C = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_C, new Item.Properties()), "black_tile_ridge_roof_edge_c");
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE_RB = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_RB, new Item.Properties()), "black_tile_ridge_roof_edge_rb");
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE_RE = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_RE, new Item.Properties()), "black_tile_ridge_roof_edge_re");
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE_W = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_W, new Item.Properties()), "black_tile_ridge_roof_edge_w");
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE_WG = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_WG, new Item.Properties()), "black_tile_ridge_roof_edge_wg");
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE_TOP = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_TOP, new Item.Properties()), "black_tile_ridge_roof_edge_top");
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE_T_BB = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_T_BB, new Item.Properties()), "black_tile_ridge_roof_edge_t_bb");
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE_T_C = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_T_C, new Item.Properties()), "black_tile_ridge_roof_edge_t_c");
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE_T_RB = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_T_RB, new Item.Properties()), "black_tile_ridge_roof_edge_t_rb");
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE_T_RE = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_T_RE, new Item.Properties()), "black_tile_ridge_roof_edge_t_re");
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE_T_W = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_T_W, new Item.Properties()), "black_tile_ridge_roof_edge_t_w");
    public static final Item BLACK_TILE_RIDGE_ROOF_EDGE_T_WG = blockItem(
            new BlockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_T_WG, new Item.Properties()), "black_tile_ridge_roof_edge_t_wg");

    // ========================================================================
    // Thatch roof edge block items
    // ========================================================================
    public static final Item THATCH_ROOF_TILE_EDGE = blockItem(
            new BlockItem(ModBlocks.THATCH_ROOF_TILE_EDGE, new Item.Properties()), "thatch_roof_tile_edge");
    public static final Item THATCH_ROOF_TILE_EDGE_SLAB = blockItem(
            new BlockItem(ModBlocks.THATCH_ROOF_TILE_EDGE_SLAB, new Item.Properties()), "thatch_roof_tile_edge_slab");
    public static final Item THATCH_TILE_RIDGE_ROOF_EDGE = blockItem(
            new BlockItem(ModBlocks.THATCH_TILE_RIDGE_ROOF_EDGE, new Item.Properties()), "thatch_tile_ridge_roof_edge");
    public static final Item THATCH_TILE_RIDGE_ROOF_EDGE_TOP = blockItem(
            new BlockItem(ModBlocks.THATCH_TILE_RIDGE_ROOF_EDGE_TOP, new Item.Properties()), "thatch_tile_ridge_roof_edge_top");

    // ========================================================================
    // Yellow roof block items
    // ========================================================================
    public static final Item YELLOW_ROOF_TILE_EDGE = blockItem(
            new BlockItem(ModBlocks.YELLOW_ROOF_TILE_EDGE, new Item.Properties()), "yellow_roof_tile_edge");
    public static final Item YELLOW_ROOF_TILE_EDGE_SLAB = blockItem(
            new BlockItem(ModBlocks.YELLOW_ROOF_TILE_EDGE_SLAB, new Item.Properties()), "yellow_roof_tile_edge_slab");
    public static final Item YELLOW_TILE_ROOF = blockItem(
            new BlockItem(ModBlocks.YELLOW_TILE_ROOF, new Item.Properties()), "yellow_tile_roof");
    public static final Item YELLOW_TILE_ROOF_J = blockItem(
            new BlockItem(ModBlocks.YELLOW_TILE_ROOF_J, new Item.Properties()), "yellow_tile_roof_j");
    public static final Item YELLOW_TILE_ROOF_SLAB = blockItem(
            new BlockItem(ModBlocks.YELLOW_TILE_ROOF_SLAB, new Item.Properties()), "yellow_tile_roof_slab");
    public static final Item YELLOW_TILE_ROOF_SLAB_TOP = blockItem(
            new BlockItem(ModBlocks.YELLOW_TILE_ROOF_SLAB_TOP, new Item.Properties()), "yellow_tile_roof_slab_top");
    public static final Item YELLOW_ROOF_TILE_RIDGE = blockItem(
            new BlockItem(ModBlocks.YELLOW_ROOF_TILE_RIDGE, new Item.Properties()), "yellow_roof_tile_ridge");
    public static final Item YELLOW_TILE_RIDGE_ROOF_TOP = blockItem(
            new BlockItem(ModBlocks.YELLOW_TILE_RIDGE_ROOF_TOP, new Item.Properties()), "yellow_tile_ridge_roof_top");
    public static final Item YELLOW_TILE_RIDGE_ROOF_EDGE = blockItem(
            new BlockItem(ModBlocks.YELLOW_TILE_RIDGE_ROOF_EDGE, new Item.Properties()), "yellow_tile_ridge_roof_edge");
    public static final Item YELLOW_TILE_RIDGE_ROOF_EDGE_TOP = blockItem(
            new BlockItem(ModBlocks.YELLOW_TILE_RIDGE_ROOF_EDGE_TOP, new Item.Properties()), "yellow_tile_ridge_roof_edge_top");
    public static final Item YELLOW_TILE_RIDGE_ROOF_J = blockItem(
            new BlockItem(ModBlocks.YELLOW_TILE_RIDGE_ROOF_J, new Item.Properties()), "yellow_tile_ridge_roof_j");

    // ========================================================================
    // Fence & Wall block items
    // ========================================================================
    public static final Item OAK_CHINESE_FENCE = blockItem(
            new BlockItem(ModBlocks.OAK_CHINESE_FENCE, new Item.Properties()), "oak_chinese_fence");
    public static final Item DIORITE_FENCE = blockItem(
            new BlockItem(ModBlocks.DIORITE_FENCE, new Item.Properties()), "diorite_fence");
    public static final Item ANDESITE_FENCE = blockItem(
            new BlockItem(ModBlocks.ANDESITE_FENCE, new Item.Properties()), "andesite_fence");
    public static final Item BLACK_BRICK_WALL = blockItem(
            new BlockItem(ModBlocks.BLACK_BRICK_WALL, new Item.Properties()), "black_brick_wall");
    public static final Item WHITE_ASH_WALL = blockItem(
            new BlockItem(ModBlocks.WHITE_ASH_WALL, new Item.Properties()), "white_ash_wall");
    public static final Item RAMMED_EARTH_WALL = blockItem(
            new BlockItem(ModBlocks.RAMMED_EARTH_WALL, new Item.Properties()), "rammed_earth_wall");
    public static final Item OAK_WALL = blockItem(
            new BlockItem(ModBlocks.OAK_WALL, new Item.Properties()), "oak_wall");
    public static final Item LITHEL_DECO = blockItem(
            new BlockItem(ModBlocks.LITHEL_DECO, new Item.Properties()), "lithel_deco");
    public static final Item PAINTED_WALL = blockItem(
            new BlockItem(ModBlocks.PAINTED_WALL, new Item.Properties()), "painted_wall");
    public static final Item WOODEN_WINDOW = blockItem(
            new BlockItem(ModBlocks.WOODEN_WINDOW, new Item.Properties()), "wooden_window");
    public static final Item DIORITE_WINDOW = blockItem(
            new BlockItem(ModBlocks.DIORITE_WINDOW, new Item.Properties()), "diorite_window");
    public static final Item RED_STAINED_WOODEN_PLANKS_WALL = blockItem(
            new BlockItem(ModBlocks.RED_STAINED_WOODEN_PLANKS_WALL, new Item.Properties()), "red_stained_wooden_planks_wall");
    public static final Item RED_STAINED_WOODEN_PLANKS_UPPER_DOOR_FRAME = blockItem(
            new BlockItem(ModBlocks.RED_STAINED_WOODEN_PLANKS_UPPER_DOOR_FRAME, new Item.Properties()), "red_stained_wooden_planks_upper_door_frame");

    // ========================================================================
    // Pane block items
    // ========================================================================
    public static final Item PAPER_WINDOW = blockItem(
            new BlockItem(ModBlocks.PAPER_WINDOW, new Item.Properties()), "paper_window");
    public static final Item RED_STAINED_WOODEN_PLANKS_PAPER_WINDOW = blockItem(
            new BlockItem(ModBlocks.RED_STAINED_WOODEN_PLANKS_PAPER_WINDOW, new Item.Properties()), "red_stained_wooden_planks_paper_window");

    // ========================================================================
    // Door block items
    // ========================================================================
    public static final Item CHINESE_OAK_DOOR = blockItem(
            new BlockItem(ModBlocks.CHINESE_OAK_DOOR, new Item.Properties()), "chinese_oak_door");
    public static final Item HIGH_DOOR = blockItem(
            new BlockItem(ModBlocks.HIGH_DOOR, new Item.Properties()), "high_door");
    public static final Item WINDOW_DOOR = blockItem(
            new BlockItem(ModBlocks.WINDOW_DOOR, new Item.Properties()), "window_door");
    public static final Item WOODEN_WINDOW_DOOR = blockItem(
            new BlockItem(ModBlocks.WOODEN_WINDOW_DOOR, new Item.Properties()), "wooden_window_door");
    public static final Item RED_STAINED_WOODEN_PLANKS_WOODEN_WINDOW_DOOR = blockItem(
            new BlockItem(ModBlocks.RED_STAINED_WOODEN_PLANKS_WOODEN_WINDOW_DOOR, new Item.Properties()), "red_stained_wooden_planks_wooden_window_door");

    // ========================================================================
    // Thin wall block items
    // ========================================================================
    public static final Item THIN_WHITE_GRAY_WALL = blockItem(
            new BlockItem(ModBlocks.THIN_WHITE_GRAY_WALL, new Item.Properties()), "thin_white_gray_wall");

    // ========================================================================
    // Lighting block items
    // ========================================================================
    public static final Item STONE_TOWER_LAMP = blockItem(
            new BlockItem(ModBlocks.STONE_TOWER_LAMP, new Item.Properties()), "stone_tower_lamp");
    public static final Item RED_LANTERN = blockItem(
            new BlockItem(ModBlocks.RED_LANTERN, new Item.Properties()), "red_lantern");
    public static final Item WHITE_LANTERN = blockItem(
            new BlockItem(ModBlocks.WHITE_LANTERN, new Item.Properties()), "white_lantern");
    public static final Item PALACE_LANTERN = blockItem(
            new BlockItem(ModBlocks.PALACE_LANTERN, new Item.Properties()), "palace_lantern");

    // ========================================================================
    // Candle block item
    // ========================================================================
    public static final Item CANDLE = blockItem(
            new BlockItem(ModBlocks.CANDLE, new Item.Properties()), "candle");

    // ========================================================================
    // Furniture block items
    // ========================================================================
    public static final Item TABLE = blockItem(
            new BlockItem(ModBlocks.TABLE, new Item.Properties()), "table");
    public static final Item BENCH = blockItem(
            new BlockItem(ModBlocks.BENCH, new Item.Properties()), "bench");
    public static final Item CHAIR = blockItem(
            new BlockItem(ModBlocks.CHAIR, new Item.Properties()), "chair");
    public static final Item WOODEN_THRESHOLD = blockItem(
            new BlockItem(ModBlocks.WOODEN_THRESHOLD, new Item.Properties()), "wooden_threshold");
    public static final Item STONE_THRESHOLD = blockItem(
            new BlockItem(ModBlocks.STONE_THRESHOLD, new Item.Properties()), "stone_threshold");
    public static final Item MENDUN = blockItem(
            new BlockItem(ModBlocks.MENDUN, new Item.Properties()), "mendun");
    public static final Item DOUGONG = blockItem(
            new BlockItem(ModBlocks.DOUGONG, new Item.Properties()), "dougong");
    public static final Item TREE_ALTAR = blockItem(
            new BlockItem(ModBlocks.TREE_ALTAR, new Item.Properties()), "tree_altar");
    public static final Item POTTED = blockItem(
            new BlockItem(ModBlocks.POTTED, new Item.Properties()), "potted");
    public static final Item CARVING = blockItem(
            new BlockItem(ModBlocks.CARVING, new Item.Properties()), "carving");

    // ========================================================================
    // Material items (pure items, no block)
    // ========================================================================
    public static final Item BLACK_CLAY = registerItem(
            new Item(new Item.Properties()), "black_clay");
    public static final Item BLACK_BRICK = registerItem(
            new Item(new Item.Properties()), "black_brick");
    public static final Item YELLOW_CLAY = registerItem(
            new Item(new Item.Properties()), "yellow_clay");
    public static final Item YELLOW_BRICK = registerItem(
            new Item(new Item.Properties()), "yellow_brick");

    public static void init() {}
}
