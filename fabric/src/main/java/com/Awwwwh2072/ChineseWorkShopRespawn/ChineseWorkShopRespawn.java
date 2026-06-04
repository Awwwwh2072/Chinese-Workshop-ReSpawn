package com.Awwwwh2072.ChineseWorkShopRespawn;

import com.Awwwwh2072.ChineseWorkShopRespawn.registry.ModBlocks;
import com.Awwwwh2072.ChineseWorkShopRespawn.registry.ModCreativeTabs;
import com.Awwwwh2072.ChineseWorkShopRespawn.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class ChineseWorkShopRespawn implements ModInitializer {

    @Override
    public void onInitialize() {

        Constants.LOG.info("Hello Fabric world!");

        ModBlocks.init();
        ModItems.init();
        ModCreativeTabs.init();

        CommonClass.init();
    }
}
