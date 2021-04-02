package com.bawnorton.vrt.proxy;

import com.bawnorton.vrt.ChunkUpdates;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;


public class ClientProxy extends CommonProxy{

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    public void postInit(FMLPostInitializationEvent preEvent) {
        MinecraftForge.EVENT_BUS.register(new ChunkUpdates());
    }
}