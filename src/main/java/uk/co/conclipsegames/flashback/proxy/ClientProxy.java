package uk.co.conclipsegames.flashback.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import uk.co.conclipsegames.flashback.EventHandlerClient;
import uk.co.conclipsegames.flashback.FBLogger;
import uk.co.conclipsegames.flashback.FlashBackKeyBind;

/**
 * Created by ethan on 15/04/2017.
 */
public class ClientProxy extends CommonProxy {

    public EntityPlayer player;
    public EventHandlerClient eventHandlerClient;

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        eventHandlerClient = new EventHandlerClient();
        MinecraftForge.EVENT_BUS.register(eventHandlerClient);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
        FlashBackKeyBind.load();
    }

    @Override
    public void serverLoad(FMLServerStartingEvent event) {
        player = Minecraft.getMinecraft().thePlayer;
    }

}
