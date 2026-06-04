package com.Awwwwh2072.ChineseWorkShopRespawn.registry;

import com.Awwwwh2072.ChineseWorkShopRespawn.Constants;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTabs {

    private static final ResourceKey<CreativeModeTab> BUILDING_BLOCKS_KEY =
            ResourceKey.create(Registries.CREATIVE_MODE_TAB,
                    new ResourceLocation(Constants.MOD_ID, "building_blocks"));

    public static final CreativeModeTab BUILDING_BLOCKS = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            BUILDING_BLOCKS_KEY,
            FabricItemGroup.builder()
                    .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".building_blocks"))
                    .icon(() -> new ItemStack(ModItems.BLACK_BRICK_BLOCK))
                    .displayItems((displayContext, entries) -> {
                        // Full-cube blocks
                        entries.accept(ModItems.BLACK_BRICK_BLOCK);
                        entries.accept(ModItems.WHITE_GRAY_WALL);
                        entries.accept(ModItems.BLACK_CLAY_BLOCK);
                        entries.accept(ModItems.RED_STAINED_WOODEN_PLANKS);
                        entries.accept(ModItems.RAMMED_EARTH);
                        entries.accept(ModItems.ANDESITE_PAVEMENT);
                        entries.accept(ModItems.WHITE_ASH_BLOCK);
                        entries.accept(ModItems.YELLOW_CLAY_BLOCK);
                        entries.accept(ModItems.PAINTED_BLOCK);
                        // Pillars
                        entries.accept(ModItems.RED_PILLAR);
                        entries.accept(ModItems.DARK_GREEN_PILLAR);
                        // Stairs
                        entries.accept(ModItems.BLACK_BRICK_STAIRS);
                        entries.accept(ModItems.WHITE_ASH_STAIRS);
                        entries.accept(ModItems.RAMMED_EARTH_STAIRS);
                        entries.accept(ModItems.ANDESITE_PAVEMENT_STAIRS);
                        // Slabs
                        entries.accept(ModItems.BLACK_BRICK_SLAB);
                        entries.accept(ModItems.WHITE_ASH_SLAB);
                        entries.accept(ModItems.RAMMED_EARTH_SLAB);
                        entries.accept(ModItems.ANDESITE_PAVEMENT_SLAB);
                        // Black tile roofs
                        entries.accept(ModItems.BLACK_TILE_ROOF);
                        entries.accept(ModItems.BLACK_TILE_ROOF_J);
                        entries.accept(ModItems.BLACK_TILE_ROOF_RIDGE);
                        entries.accept(ModItems.BLACK_TILE_ROOF_RIDGE_J);
                        entries.accept(ModItems.BLACK_TILE_ROOF_RIDGE_TOP);
                        entries.accept(ModItems.BLACK_TILE_ROOF_SLAB);
                        entries.accept(ModItems.BLACK_TILE_ROOF_SLAB_TOP);
                        // Thatch roofs
                        entries.accept(ModItems.THATCH_ROOF);
                        entries.accept(ModItems.THATCH_ROOF_RIDGE);
                        entries.accept(ModItems.THATCH_ROOF_RIDGE_TOP);
                        entries.accept(ModItems.THATCH_ROOF_SLAB);
                        entries.accept(ModItems.THATCH_ROOF_SLAB_TOP);
                        // Roof tile edges
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE);
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE_CW);
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE_RR);
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE_WB);
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE_J_CW);
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE_J_RR);
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE_J_WB);
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB);
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB_CW);
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB_RR);
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB_WB);
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB_T_CW);
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB_T_RR);
//                        entries.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB_T_WB);
                        // Tile ridge roof edges
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE);
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_BB);
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_C);
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_RB);
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_RE);
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_W);
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_WG);
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_TOP);
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_T_BB);
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_T_C);
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_T_RB);
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_T_RE);
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_T_W);
//                        entries.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_T_WG);
                        // Thatch roof edges
//                        entries.accept(ModItems.THATCH_ROOF_TILE_EDGE);
//                        entries.accept(ModItems.THATCH_ROOF_TILE_EDGE_SLAB);
//                        entries.accept(ModItems.THATCH_TILE_RIDGE_ROOF_EDGE);
//                        entries.accept(ModItems.THATCH_TILE_RIDGE_ROOF_EDGE_TOP);
                        // Yellow roofs
//                        entries.accept(ModItems.YELLOW_ROOF_TILE_EDGE);
//                        entries.accept(ModItems.YELLOW_ROOF_TILE_EDGE_SLAB);
                        entries.accept(ModItems.YELLOW_TILE_ROOF);
                        entries.accept(ModItems.YELLOW_TILE_ROOF_J);
                        entries.accept(ModItems.YELLOW_TILE_ROOF_SLAB);
                        entries.accept(ModItems.YELLOW_TILE_ROOF_SLAB_TOP);
                        entries.accept(ModItems.YELLOW_ROOF_TILE_RIDGE);
                        entries.accept(ModItems.YELLOW_TILE_RIDGE_ROOF_TOP);
//                        entries.accept(ModItems.YELLOW_TILE_RIDGE_ROOF_EDGE);
//                        entries.accept(ModItems.YELLOW_TILE_RIDGE_ROOF_EDGE_TOP);
                        entries.accept(ModItems.YELLOW_TILE_RIDGE_ROOF_J);
                        // Fences & Walls
                        entries.accept(ModItems.OAK_CHINESE_FENCE);
                        entries.accept(ModItems.DIORITE_FENCE);
                        entries.accept(ModItems.ANDESITE_FENCE);
                        entries.accept(ModItems.BLACK_BRICK_WALL);
                        entries.accept(ModItems.WHITE_ASH_WALL);
                        entries.accept(ModItems.RAMMED_EARTH_WALL);
                        entries.accept(ModItems.OAK_WALL);
                        entries.accept(ModItems.LITHEL_DECO);
                        entries.accept(ModItems.PAINTED_WALL);
                        entries.accept(ModItems.WOODEN_WINDOW);
                        entries.accept(ModItems.DIORITE_WINDOW);
                        entries.accept(ModItems.RED_STAINED_WOODEN_PLANKS_WALL);
                        // Panes & Doors & Thin walls
                        entries.accept(ModItems.PAPER_WINDOW);
                        entries.accept(ModItems.RED_STAINED_WOODEN_PLANKS_PAPER_WINDOW);
                        entries.accept(ModItems.CHINESE_OAK_DOOR);
                        entries.accept(ModItems.HIGH_DOOR);
                        entries.accept(ModItems.WINDOW_DOOR);
                        entries.accept(ModItems.WOODEN_WINDOW_DOOR);
                        entries.accept(ModItems.RED_STAINED_WOODEN_PLANKS_WOODEN_WINDOW_DOOR);
                        entries.accept(ModItems.THIN_WHITE_GRAY_WALL);
                        entries.accept(ModItems.RED_STAINED_WOODEN_PLANKS_UPPER_DOOR_FRAME);
                    })
                    .build());

    private static final ResourceKey<CreativeModeTab> DECORATIONS_KEY =
            ResourceKey.create(Registries.CREATIVE_MODE_TAB,
                    new ResourceLocation(Constants.MOD_ID, "decorations"));

    public static final CreativeModeTab DECORATIONS = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            DECORATIONS_KEY,
            FabricItemGroup.builder()
                    .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".decorations"))
                    .icon(() -> new ItemStack(ModItems.STONE_TOWER_LAMP))
                    .displayItems((displayContext, entries) -> {
                        // Lighting
                        entries.accept(ModItems.STONE_TOWER_LAMP);
                        entries.accept(ModItems.RED_LANTERN);
                        entries.accept(ModItems.WHITE_LANTERN);
                        entries.accept(ModItems.PALACE_LANTERN);
                        entries.accept(ModItems.CANDLE);
                        // Furniture
                        entries.accept(ModItems.TABLE);
                        entries.accept(ModItems.BENCH);
                        entries.accept(ModItems.CHAIR);
                        entries.accept(ModItems.WOODEN_THRESHOLD);
                        entries.accept(ModItems.STONE_THRESHOLD);
                        entries.accept(ModItems.MENDUN);
                        entries.accept(ModItems.DOUGONG);
                        entries.accept(ModItems.CARVING);
                        entries.accept(ModItems.TREE_ALTAR);
//                        entries.accept(ModItems.POTTED);
                    })
                    .build());

    private static final ResourceKey<CreativeModeTab> ITEMS_KEY =
            ResourceKey.create(Registries.CREATIVE_MODE_TAB,
                    new ResourceLocation(Constants.MOD_ID, "items"));

    public static final CreativeModeTab ITEMS = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            ITEMS_KEY,
            FabricItemGroup.builder()
                    .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".items"))
                    .icon(() -> new ItemStack(ModItems.BLACK_BRICK))
                    .displayItems((displayContext, entries) -> {
                        // Material items
                        entries.accept(ModItems.BLACK_CLAY);
                        entries.accept(ModItems.BLACK_BRICK);
                        entries.accept(ModItems.YELLOW_CLAY);
                        entries.accept(ModItems.YELLOW_BRICK);
                    })
                    .build());

    public static void init() {}
}
