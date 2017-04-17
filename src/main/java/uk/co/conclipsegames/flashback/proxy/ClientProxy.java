package uk.co.conclipsegames.flashback.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.co.conclipsegames.flashback.EventHandlerCommon;
import uk.co.conclipsegames.flashback.FBLogger;
import uk.co.conclipsegames.flashback.FlashBack;
import uk.co.conclipsegames.flashback.FlashBackKeyBind;

/**
 * Created by ethan on 15/04/2017.
 */
public class ClientProxy extends CommonProxy {

    public EventHandlerCommon eventHandlerClient;
    public FlashBackKeyBind flashBackKeyBind;

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        FBLogger.info("I DID RUN");
        flashBackKeyBind.load();
        flashBackKeyBind = new FlashBackKeyBind();
        eventHandlerClient = new EventHandlerCommon();
        MinecraftForge.EVENT_BUS.register(eventHandlerClient);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

}
