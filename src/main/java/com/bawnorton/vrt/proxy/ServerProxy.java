package com.bawnorton.vrt.proxy;

import com.bawnorton.vrt.commands.TaintTickRate;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class ServerProxy extends CommonProxy {
    public static void serverInit(FMLServerStartingEvent event) {
        event.registerServerCommand(new TaintTickRate());
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
    }
}
