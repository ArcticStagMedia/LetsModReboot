package com.stagdagegaming.letsmodreboot;

import com.stagdagegaming.letsmodreboot.proxy.IProxy;
import com.stagdagegaming.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Stagdage-Desktop on 21/02/2016.
 */
@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsModReboot
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = "com.stagdagegaming.letsmodreboot.proxy.ClientProxy", serverSide = "com.stagdagegaming.letsmodreboot.prosy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
