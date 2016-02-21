package com.stagdagegaming.letsmodreboot;

import com.stagdagegaming.letsmodreboot.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Stagdage-Desktop on 21/02/2016.
 */
@Mod(modid = "LetsModReboot",name = "Lets Mod Reboot", version = "1.7.2-1.0")
public class LetsModReboot
{
    @Mod.Instance("LetsModReboot")
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
