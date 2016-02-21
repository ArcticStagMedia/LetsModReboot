package com.stagdagegaming.letsmodreboot;

        import com.stagdagegaming.letsmodreboot.handler.ConfigurationHandler;
        import com.stagdagegaming.letsmodreboot.init.ModBlocks;
        import com.stagdagegaming.letsmodreboot.init.ModItems;
        import com.stagdagegaming.letsmodreboot.proxy.IProxy;
        import com.stagdagegaming.letsmodreboot.reference.Reference;
        import com.stagdagegaming.letsmodreboot.utility.LogHelper;
        import cpw.mods.fml.common.FMLCommonHandler;
        import cpw.mods.fml.common.Mod;
        import cpw.mods.fml.common.SidedProxy;
        import cpw.mods.fml.common.event.FMLInitializationEvent;
        import cpw.mods.fml.common.event.FMLPostInitializationEvent;
        import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Stagdage-Desktop on 21/02/2016.
 */
@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME, version = Reference.VERSION,guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();

        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.warn("Initialization Complete!");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.fatal("Post Initialization Complete!");
    }
}
