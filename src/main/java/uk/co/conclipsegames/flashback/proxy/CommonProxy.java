package uk.co.conclipsegames.flashback.proxy;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import uk.co.conclipsegames.flashback.Item.ItemBase;

/**
 * Created by ethan on 15/04/2017.
 */
public class CommonProxy {

    public EntityPlayerSP player;

    public void preInit(FMLPreInitializationEvent event) {

    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
    public void serverLoad(FMLServerStartingEvent event) {

    }

    public void registerItemRenderer(ItemBase itemBase, int i, String name) {
    }
}
