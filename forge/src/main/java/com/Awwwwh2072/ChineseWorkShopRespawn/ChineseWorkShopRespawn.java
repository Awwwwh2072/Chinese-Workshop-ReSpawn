package com.Awwwwh2072.ChineseWorkShopRespawn;

import com.Awwwwh2072.ChineseWorkShopRespawn.registry.ModBlocks;
import com.Awwwwh2072.ChineseWorkShopRespawn.registry.ModCreativeTabs;
import com.Awwwwh2072.ChineseWorkShopRespawn.registry.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ChineseWorkShopRespawn {

    public ChineseWorkShopRespawn() {
        var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus);

        CommonClass.init();
    }
}
