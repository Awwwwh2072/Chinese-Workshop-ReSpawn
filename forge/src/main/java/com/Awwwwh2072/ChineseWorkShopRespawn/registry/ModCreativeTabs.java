package com.Awwwwh2072.ChineseWorkShopRespawn.registry;

import com.Awwwwh2072.ChineseWorkShopRespawn.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BUILDING_BLOCKS = TABS.register("building_blocks",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".building_blocks"))
                    .icon(() -> new ItemStack(ModItems.BLACK_BRICK_BLOCK.get()))
                    .displayItems((params, output) -> {
                        // Full-cube blocks
                        output.accept(ModItems.BLACK_BRICK_BLOCK.get());
                        output.accept(ModItems.WHITE_GRAY_WALL.get());
                        output.accept(ModItems.BLACK_CLAY_BLOCK.get());
                        output.accept(ModItems.RED_STAINED_WOODEN_PLANKS.get());
                        output.accept(ModItems.RAMMED_EARTH.get());
                        output.accept(ModItems.ANDESITE_PAVEMENT.get());
                        output.accept(ModItems.WHITE_ASH_BLOCK.get());
                        output.accept(ModItems.YELLOW_CLAY_BLOCK.get());
                        output.accept(ModItems.PAINTED_BLOCK.get());
                        // Pillars
                        output.accept(ModItems.RED_PILLAR.get());
                        output.accept(ModItems.DARK_GREEN_PILLAR.get());
                        // Stairs
                        output.accept(ModItems.BLACK_BRICK_STAIRS.get());
                        output.accept(ModItems.WHITE_ASH_STAIRS.get());
                        output.accept(ModItems.RAMMED_EARTH_STAIRS.get());
                        output.accept(ModItems.ANDESITE_PAVEMENT_STAIRS.get());
                        // Slabs
                        output.accept(ModItems.BLACK_BRICK_SLAB.get());
                        output.accept(ModItems.WHITE_ASH_SLAB.get());
                        output.accept(ModItems.RAMMED_EARTH_SLAB.get());
                        output.accept(ModItems.ANDESITE_PAVEMENT_SLAB.get());
                        // Black tile roofs
                        output.accept(ModItems.BLACK_TILE_ROOF.get());
                        output.accept(ModItems.BLACK_TILE_ROOF_J.get());
                        output.accept(ModItems.BLACK_TILE_ROOF_RIDGE.get());
                        output.accept(ModItems.BLACK_TILE_ROOF_RIDGE_J.get());
                        output.accept(ModItems.BLACK_TILE_ROOF_RIDGE_TOP.get());
                        output.accept(ModItems.BLACK_TILE_ROOF_SLAB.get());
                        output.accept(ModItems.BLACK_TILE_ROOF_SLAB_TOP.get());
                        // Thatch roofs
                        output.accept(ModItems.THATCH_ROOF.get());
                        output.accept(ModItems.THATCH_ROOF_RIDGE.get());
                        output.accept(ModItems.THATCH_ROOF_RIDGE_TOP.get());
                        output.accept(ModItems.THATCH_ROOF_SLAB.get());
                        output.accept(ModItems.THATCH_ROOF_SLAB_TOP.get());
                        // Roof tile edges
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE.get());
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE_CW.get());
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE_RR.get());
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE_WB.get());
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE_J_CW.get());
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE_J_RR.get());
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE_J_WB.get());
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB.get());
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB_CW.get());
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB_RR.get());
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB_WB.get());
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB_T_CW.get());
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB_T_RR.get());
//                        output.accept(ModItems.BLACK_ROOF_TILE_EDGE_SLAB_T_WB.get());
                        // Tile ridge roof edges
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE.get());
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_BB.get());
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_C.get());
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_RB.get());
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_RE.get());
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_W.get());
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_WG.get());
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_TOP.get());
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_T_BB.get());
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_T_C.get());
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_T_RB.get());
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_T_RE.get());
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_T_W.get());
//                        output.accept(ModItems.BLACK_TILE_RIDGE_ROOF_EDGE_T_WG.get());
                        // Thatch roof edges
//                        output.accept(ModItems.THATCH_ROOF_TILE_EDGE.get());
//                        output.accept(ModItems.THATCH_ROOF_TILE_EDGE_SLAB.get());
//                        output.accept(ModItems.THATCH_TILE_RIDGE_ROOF_EDGE.get());
//                        output.accept(ModItems.THATCH_TILE_RIDGE_ROOF_EDGE_TOP.get());
                        // Yellow roofs
                        //output.accept(ModItems.YELLOW_ROOF_TILE_EDGE.get());
                        //output.accept(ModItems.YELLOW_ROOF_TILE_EDGE_SLAB.get());
                        output.accept(ModItems.YELLOW_TILE_ROOF.get());
                        output.accept(ModItems.YELLOW_TILE_ROOF_J.get());
                        output.accept(ModItems.YELLOW_TILE_ROOF_SLAB.get());
                        output.accept(ModItems.YELLOW_TILE_ROOF_SLAB_TOP.get());
                        output.accept(ModItems.YELLOW_ROOF_TILE_RIDGE.get());
                        output.accept(ModItems.YELLOW_TILE_RIDGE_ROOF_TOP.get());
                        //output.accept(ModItems.YELLOW_TILE_RIDGE_ROOF_EDGE.get());
                        //output.accept(ModItems.YELLOW_TILE_RIDGE_ROOF_EDGE_TOP.get());
                        output.accept(ModItems.YELLOW_TILE_RIDGE_ROOF_J.get());
                        // Fences & Walls
                        output.accept(ModItems.OAK_CHINESE_FENCE.get());
                        output.accept(ModItems.DIORITE_FENCE.get());
                        output.accept(ModItems.ANDESITE_FENCE.get());
                        output.accept(ModItems.BLACK_BRICK_WALL.get());
                        output.accept(ModItems.WHITE_ASH_WALL.get());
                        output.accept(ModItems.RAMMED_EARTH_WALL.get());
                        output.accept(ModItems.OAK_WALL.get());
                        output.accept(ModItems.LITHEL_DECO.get());
                        output.accept(ModItems.PAINTED_WALL.get());
                        output.accept(ModItems.WOODEN_WINDOW.get());
                        output.accept(ModItems.DIORITE_WINDOW.get());
                        output.accept(ModItems.RED_STAINED_WOODEN_PLANKS_WALL.get());
                        // Panes & Doors & Thin walls
                        output.accept(ModItems.PAPER_WINDOW.get());
                        output.accept(ModItems.RED_STAINED_WOODEN_PLANKS_PAPER_WINDOW.get());
                        output.accept(ModItems.CHINESE_OAK_DOOR.get());
                        output.accept(ModItems.HIGH_DOOR.get());
                        output.accept(ModItems.WINDOW_DOOR.get());
                        output.accept(ModItems.WOODEN_WINDOW_DOOR.get());
                        output.accept(ModItems.RED_STAINED_WOODEN_PLANKS_WOODEN_WINDOW_DOOR.get());
                        output.accept(ModItems.THIN_WHITE_GRAY_WALL.get());
                        output.accept(ModItems.RED_STAINED_WOODEN_PLANKS_UPPER_DOOR_FRAME.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> DECORATIONS = TABS.register("decorations",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".decorations"))
                    .icon(() -> new ItemStack(ModItems.STONE_TOWER_LAMP.get()))
                    .displayItems((params, output) -> {
                        // Lighting
                        output.accept(ModItems.STONE_TOWER_LAMP.get());
                        output.accept(ModItems.RED_LANTERN.get());
                        output.accept(ModItems.WHITE_LANTERN.get());
                        output.accept(ModItems.PALACE_LANTERN.get());
                        output.accept(ModItems.CANDLE.get());
                        // Furniture
                        output.accept(ModItems.TABLE.get());
                        output.accept(ModItems.BENCH.get());
                        output.accept(ModItems.CHAIR.get());
                        output.accept(ModItems.WOODEN_THRESHOLD.get());
                        output.accept(ModItems.STONE_THRESHOLD.get());
                        output.accept(ModItems.MENDUN.get());
                        output.accept(ModItems.DOUGONG.get());
                        output.accept(ModItems.CARVING.get());
                        output.accept(ModItems.TREE_ALTAR.get());
                        //output.accept(ModItems.POTTED.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ITEMS = TABS.register("items",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Constants.MOD_ID + ".items"))
                    .icon(() -> new ItemStack(ModItems.BLACK_BRICK.get()))
                    .displayItems((params, output) -> {
                        // Material items
                        output.accept(ModItems.BLACK_CLAY.get());
                        output.accept(ModItems.BLACK_BRICK.get());
                        output.accept(ModItems.YELLOW_CLAY.get());
                        output.accept(ModItems.YELLOW_BRICK.get());
                    })
                    .build());
}
