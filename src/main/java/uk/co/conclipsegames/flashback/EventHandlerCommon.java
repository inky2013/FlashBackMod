package uk.co.conclipsegames.flashback;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by ethan on 15/04/2017.
 */
public class EventHandlerCommon {

    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void tickEvent(TickEvent.PlayerTickEvent e) {

        String name = e.player.getDisplayNameString();
        Double[] pos = {e.player.posX, e.player.posY, e.player.posZ, new Double(e.player.rotationPitch), new Double(e.player.rotationYaw)};

        FlashBackHandler.add_player_pos(name, pos);

    }
    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void keyPressEvent(InputEvent.KeyInputEvent e) {
        if (FlashBackKeyBind.isFlashBackKeyDown()) {
            for (String player : FlashBack.instance.server.getPlayerList().getAllUsernames()) {
                FlashBackHandler.flash_back(player);
            }
        }
    }

}
