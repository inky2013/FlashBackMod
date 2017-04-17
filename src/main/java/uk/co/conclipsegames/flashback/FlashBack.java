package uk.co.conclipsegames.flashback;

import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import uk.co.conclipsegames.flashback.proxy.CommonProxy;

/**
 * Created by Ethan Brews on 15/04/2017.
 */
@Mod(modid = FlashBack.MODID, version = FlashBack.VERSION, name = FlashBack.NAME)
public class FlashBack {



    public static final String MODID = "flashback";
    public static final String VERSION = "1.0";
    public static final String NAME = "Flash Back";
    public MinecraftServer server;

    @Mod.Instance(FlashBack.MODID)
    public static FlashBack instance;

    @SidedProxy(clientSide="uk.co.conclipsegames.flashback.proxy.ClientProxy", serverSide="uk.co.conclipsegames.flashback.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        server = event.getServer();
    }

}
