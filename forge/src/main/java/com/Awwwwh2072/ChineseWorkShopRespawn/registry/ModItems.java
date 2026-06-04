package com.Awwwwh2072.ChineseWorkShopRespawn.registry;

import com.Awwwwh2072.ChineseWorkShopRespawn.Constants;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    private static RegistryObject<Item> blockItem(RegistryObject<?> block) {
        return blockItem(block, new Item.Properties());
    }

    private static RegistryObject<Item> blockItem(RegistryObject<?> block, Item.Properties props) {
        return ITEMS.register(block.getId().getPath(),
                () -> new BlockItem((net.minecraft.world.level.block.Block) block.get(), props));
    }

    // ========================================================================
    // Full-cube block items
    // ========================================================================
    public static final RegistryObject<Item> BLACK_BRICK_BLOCK          = blockItem(ModBlocks.BLACK_BRICK_BLOCK);
    public static final RegistryObject<Item> WHITE_GRAY_WALL            = blockItem(ModBlocks.WHITE_GRAY_WALL);
    public static final RegistryObject<Item> BLACK_CLAY_BLOCK           = blockItem(ModBlocks.BLACK_CLAY_BLOCK);
    public static final RegistryObject<Item> RED_STAINED_WOODEN_PLANKS  = blockItem(ModBlocks.RED_STAINED_WOODEN_PLANKS);
    public static final RegistryObject<Item> RAMMED_EARTH               = blockItem(ModBlocks.RAMMED_EARTH);
    public static final RegistryObject<Item> ANDESITE_PAVEMENT          = blockItem(ModBlocks.ANDESITE_PAVEMENT);
    public static final RegistryObject<Item> WHITE_ASH_BLOCK            = blockItem(ModBlocks.WHITE_ASH_BLOCK);
    public static final RegistryObject<Item> YELLOW_CLAY_BLOCK          = blockItem(ModBlocks.YELLOW_CLAY_BLOCK);
    public static final RegistryObject<Item> PAINTED_BLOCK              = blockItem(ModBlocks.PAINTED_BLOCK);

    // ========================================================================
    // Pillar block items
    // ========================================================================
    public static final RegistryObject<Item> RED_PILLAR             = blockItem(ModBlocks.RED_PILLAR);
    public static final RegistryObject<Item> DARK_GREEN_PILLAR      = blockItem(ModBlocks.DARK_GREEN_PILLAR);

    // ========================================================================
    // Stair block items
    // ========================================================================
    public static final RegistryObject<Item> BLACK_BRICK_STAIRS         = blockItem(ModBlocks.BLACK_BRICK_STAIRS);
    public static final RegistryObject<Item> WHITE_ASH_STAIRS           = blockItem(ModBlocks.WHITE_ASH_STAIRS);
    public static final RegistryObject<Item> RAMMED_EARTH_STAIRS        = blockItem(ModBlocks.RAMMED_EARTH_STAIRS);
    public static final RegistryObject<Item> ANDESITE_PAVEMENT_STAIRS   = blockItem(ModBlocks.ANDESITE_PAVEMENT_STAIRS);

    // ========================================================================
    // Slab block items
    // ========================================================================
    public static final RegistryObject<Item> BLACK_BRICK_SLAB           = blockItem(ModBlocks.BLACK_BRICK_SLAB);
    public static final RegistryObject<Item> WHITE_ASH_SLAB             = blockItem(ModBlocks.WHITE_ASH_SLAB);
    public static final RegistryObject<Item> RAMMED_EARTH_SLAB          = blockItem(ModBlocks.RAMMED_EARTH_SLAB);
    public static final RegistryObject<Item> ANDESITE_PAVEMENT_SLAB     = blockItem(ModBlocks.ANDESITE_PAVEMENT_SLAB);

    // ========================================================================
    // Black tile roof block items
    // ========================================================================
    public static final RegistryObject<Item> BLACK_TILE_ROOF            = blockItem(ModBlocks.BLACK_TILE_ROOF);
    public static final RegistryObject<Item> BLACK_TILE_ROOF_J          = blockItem(ModBlocks.BLACK_TILE_ROOF_J);
    public static final RegistryObject<Item> BLACK_TILE_ROOF_RIDGE      = blockItem(ModBlocks.BLACK_TILE_ROOF_RIDGE);
    public static final RegistryObject<Item> BLACK_TILE_ROOF_RIDGE_J    = blockItem(ModBlocks.BLACK_TILE_ROOF_RIDGE_J);
    public static final RegistryObject<Item> BLACK_TILE_ROOF_RIDGE_TOP  = blockItem(ModBlocks.BLACK_TILE_ROOF_RIDGE_TOP);
    public static final RegistryObject<Item> BLACK_TILE_ROOF_SLAB       = blockItem(ModBlocks.BLACK_TILE_ROOF_SLAB);
    public static final RegistryObject<Item> BLACK_TILE_ROOF_SLAB_TOP   = blockItem(ModBlocks.BLACK_TILE_ROOF_SLAB_TOP);

    // ========================================================================
    // Thatch roof block items
    // ========================================================================
    public static final RegistryObject<Item> THATCH_ROOF                = blockItem(ModBlocks.THATCH_ROOF);
    public static final RegistryObject<Item> THATCH_ROOF_RIDGE          = blockItem(ModBlocks.THATCH_ROOF_RIDGE);
    public static final RegistryObject<Item> THATCH_ROOF_RIDGE_TOP      = blockItem(ModBlocks.THATCH_ROOF_RIDGE_TOP);
    public static final RegistryObject<Item> THATCH_ROOF_SLAB           = blockItem(ModBlocks.THATCH_ROOF_SLAB);
    public static final RegistryObject<Item> THATCH_ROOF_SLAB_TOP       = blockItem(ModBlocks.THATCH_ROOF_SLAB_TOP);

    // ========================================================================
    // Roof tile edge block items
    // ========================================================================
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE           = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE);
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE_CW        = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_CW);
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE_RR        = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_RR);
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE_WB        = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_WB);
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE_J_CW      = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_J_CW);
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE_J_RR      = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_J_RR);
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE_J_WB      = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_J_WB);
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE_SLAB      = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB);
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE_SLAB_CW   = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB_CW);
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE_SLAB_RR   = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB_RR);
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE_SLAB_WB   = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB_WB);
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE_SLAB_T_CW = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB_T_CW);
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE_SLAB_T_RR = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB_T_RR);
    public static final RegistryObject<Item> BLACK_ROOF_TILE_EDGE_SLAB_T_WB = blockItem(ModBlocks.BLACK_ROOF_TILE_EDGE_SLAB_T_WB);

    // ========================================================================
    // Tile ridge roof edge block items
    // ========================================================================
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE     = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE);
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE_BB  = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_BB);
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE_C   = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_C);
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE_RB  = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_RB);
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE_RE  = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_RE);
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE_W   = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_W);
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE_WG  = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_WG);
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE_TOP = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_TOP);
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE_T_BB = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_T_BB);
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE_T_C  = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_T_C);
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE_T_RB = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_T_RB);
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE_T_RE = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_T_RE);
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE_T_W  = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_T_W);
    public static final RegistryObject<Item> BLACK_TILE_RIDGE_ROOF_EDGE_T_WG = blockItem(ModBlocks.BLACK_TILE_RIDGE_ROOF_EDGE_T_WG);

    // ========================================================================
    // Thatch roof edge block items
    // ========================================================================
    public static final RegistryObject<Item> THATCH_ROOF_TILE_EDGE          = blockItem(ModBlocks.THATCH_ROOF_TILE_EDGE);
    public static final RegistryObject<Item> THATCH_ROOF_TILE_EDGE_SLAB     = blockItem(ModBlocks.THATCH_ROOF_TILE_EDGE_SLAB);
    public static final RegistryObject<Item> THATCH_TILE_RIDGE_ROOF_EDGE    = blockItem(ModBlocks.THATCH_TILE_RIDGE_ROOF_EDGE);
    public static final RegistryObject<Item> THATCH_TILE_RIDGE_ROOF_EDGE_TOP = blockItem(ModBlocks.THATCH_TILE_RIDGE_ROOF_EDGE_TOP);

    // ========================================================================
    // Yellow roof block items
    // ========================================================================
    public static final RegistryObject<Item> YELLOW_ROOF_TILE_EDGE          = blockItem(ModBlocks.YELLOW_ROOF_TILE_EDGE);
    public static final RegistryObject<Item> YELLOW_ROOF_TILE_EDGE_SLAB     = blockItem(ModBlocks.YELLOW_ROOF_TILE_EDGE_SLAB);
    public static final RegistryObject<Item> YELLOW_TILE_ROOF               = blockItem(ModBlocks.YELLOW_TILE_ROOF);
    public static final RegistryObject<Item> YELLOW_TILE_ROOF_J             = blockItem(ModBlocks.YELLOW_TILE_ROOF_J);
    public static final RegistryObject<Item> YELLOW_TILE_ROOF_SLAB          = blockItem(ModBlocks.YELLOW_TILE_ROOF_SLAB);
    public static final RegistryObject<Item> YELLOW_TILE_ROOF_SLAB_TOP      = blockItem(ModBlocks.YELLOW_TILE_ROOF_SLAB_TOP);
    public static final RegistryObject<Item> YELLOW_ROOF_TILE_RIDGE         = blockItem(ModBlocks.YELLOW_ROOF_TILE_RIDGE);
    public static final RegistryObject<Item> YELLOW_TILE_RIDGE_ROOF_TOP     = blockItem(ModBlocks.YELLOW_TILE_RIDGE_ROOF_TOP);
    public static final RegistryObject<Item> YELLOW_TILE_RIDGE_ROOF_EDGE    = blockItem(ModBlocks.YELLOW_TILE_RIDGE_ROOF_EDGE);
    public static final RegistryObject<Item> YELLOW_TILE_RIDGE_ROOF_EDGE_TOP = blockItem(ModBlocks.YELLOW_TILE_RIDGE_ROOF_EDGE_TOP);
    public static final RegistryObject<Item> YELLOW_TILE_RIDGE_ROOF_J       = blockItem(ModBlocks.YELLOW_TILE_RIDGE_ROOF_J);

    // ========================================================================
    // Fence & Wall block items
    // ========================================================================
    public static final RegistryObject<Item> OAK_CHINESE_FENCE      = blockItem(ModBlocks.OAK_CHINESE_FENCE);
    public static final RegistryObject<Item> DIORITE_FENCE          = blockItem(ModBlocks.DIORITE_FENCE);
    public static final RegistryObject<Item> ANDESITE_FENCE         = blockItem(ModBlocks.ANDESITE_FENCE);
    public static final RegistryObject<Item> BLACK_BRICK_WALL       = blockItem(ModBlocks.BLACK_BRICK_WALL);
    public static final RegistryObject<Item> WHITE_ASH_WALL         = blockItem(ModBlocks.WHITE_ASH_WALL);
    public static final RegistryObject<Item> RAMMED_EARTH_WALL      = blockItem(ModBlocks.RAMMED_EARTH_WALL);
    public static final RegistryObject<Item> OAK_WALL               = blockItem(ModBlocks.OAK_WALL);
    public static final RegistryObject<Item> LITHEL_DECO            = blockItem(ModBlocks.LITHEL_DECO);
    public static final RegistryObject<Item> PAINTED_WALL           = blockItem(ModBlocks.PAINTED_WALL);
    public static final RegistryObject<Item> WOODEN_WINDOW          = blockItem(ModBlocks.WOODEN_WINDOW);
    public static final RegistryObject<Item> DIORITE_WINDOW         = blockItem(ModBlocks.DIORITE_WINDOW);
    public static final RegistryObject<Item> RED_STAINED_WOODEN_PLANKS_WALL = blockItem(ModBlocks.RED_STAINED_WOODEN_PLANKS_WALL);
    public static final RegistryObject<Item> RED_STAINED_WOODEN_PLANKS_UPPER_DOOR_FRAME = blockItem(ModBlocks.RED_STAINED_WOODEN_PLANKS_UPPER_DOOR_FRAME);

    // ========================================================================
    // Pane block items
    // ========================================================================
    public static final RegistryObject<Item> PAPER_WINDOW           = blockItem(ModBlocks.PAPER_WINDOW);
    public static final RegistryObject<Item> RED_STAINED_WOODEN_PLANKS_PAPER_WINDOW = blockItem(ModBlocks.RED_STAINED_WOODEN_PLANKS_PAPER_WINDOW);

    // ========================================================================
    // Door block items
    // ========================================================================
    public static final RegistryObject<Item> CHINESE_OAK_DOOR       = blockItem(ModBlocks.CHINESE_OAK_DOOR);
    public static final RegistryObject<Item> HIGH_DOOR              = blockItem(ModBlocks.HIGH_DOOR);
    public static final RegistryObject<Item> WINDOW_DOOR            = blockItem(ModBlocks.WINDOW_DOOR);
    public static final RegistryObject<Item> WOODEN_WINDOW_DOOR     = blockItem(ModBlocks.WOODEN_WINDOW_DOOR);
    public static final RegistryObject<Item> RED_STAINED_WOODEN_PLANKS_WOODEN_WINDOW_DOOR = blockItem(ModBlocks.RED_STAINED_WOODEN_PLANKS_WOODEN_WINDOW_DOOR);

    // ========================================================================
    // Thin wall block items
    // ========================================================================
    public static final RegistryObject<Item> THIN_WHITE_GRAY_WALL   = blockItem(ModBlocks.THIN_WHITE_GRAY_WALL);

    // ========================================================================
    // Lighting block items
    // ========================================================================
    public static final RegistryObject<Item> STONE_TOWER_LAMP       = blockItem(ModBlocks.STONE_TOWER_LAMP);
    public static final RegistryObject<Item> RED_LANTERN            = blockItem(ModBlocks.RED_LANTERN);
    public static final RegistryObject<Item> WHITE_LANTERN          = blockItem(ModBlocks.WHITE_LANTERN);
    public static final RegistryObject<Item> PALACE_LANTERN         = blockItem(ModBlocks.PALACE_LANTERN);

    // ========================================================================
    // Candle block item
    // ========================================================================
    public static final RegistryObject<Item> CANDLE                 = blockItem(ModBlocks.CANDLE);

    // ========================================================================
    // Furniture block items
    // ========================================================================
    public static final RegistryObject<Item> TABLE                  = blockItem(ModBlocks.TABLE);
    public static final RegistryObject<Item> BENCH                  = blockItem(ModBlocks.BENCH);
    public static final RegistryObject<Item> CHAIR                  = blockItem(ModBlocks.CHAIR);
    public static final RegistryObject<Item> WOODEN_THRESHOLD       = blockItem(ModBlocks.WOODEN_THRESHOLD);
    public static final RegistryObject<Item> STONE_THRESHOLD        = blockItem(ModBlocks.STONE_THRESHOLD);
    public static final RegistryObject<Item> MENDUN                 = blockItem(ModBlocks.MENDUN);
    public static final RegistryObject<Item> DOUGONG                = blockItem(ModBlocks.DOUGONG);
    public static final RegistryObject<Item> TREE_ALTAR             = blockItem(ModBlocks.TREE_ALTAR);
    public static final RegistryObject<Item> POTTED                 = blockItem(ModBlocks.POTTED);
    public static final RegistryObject<Item> CARVING                = blockItem(ModBlocks.CARVING);

    // ========================================================================
    // Material items (pure items, no block)
    // ========================================================================
    public static final RegistryObject<Item> BLACK_CLAY = ITEMS.register("black_clay",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_BRICK = ITEMS.register("black_brick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_CLAY = ITEMS.register("yellow_clay",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_BRICK = ITEMS.register("yellow_brick",
            () -> new Item(new Item.Properties()));
}
