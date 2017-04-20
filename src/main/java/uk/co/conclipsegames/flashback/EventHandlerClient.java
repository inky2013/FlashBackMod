package uk.co.conclipsegames.flashback;

import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

/**
 * Created by ethan on 15/04/2017.
 */
public class EventHandlerClient {

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void tickEvent(TickEvent.PlayerTickEvent e) {

        String name = e.player.getDisplayNameString();
        Double[] pos = {e.player.posX, e.player.posY, e.player.posZ, new Double(e.player.rotationPitch), new Double(e.player.rotationYaw)};

        FlashBackHandler.add_player_pos(name, pos);

    }
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void keyPressEvent(InputEvent.KeyInputEvent e) {
        if (FlashBackKeyBind.isFlashBackKeyDown()) {
            FlashBackHandler.flash_back();
        }
    }
    @SubscribeEvent(priority = EventPriority.NORMAL)
            public void PlayerEvent(PlayerEvent.PlayerLoggedInEvent e)
    {
        //FBLogger.info(Minecraft.getMinecraft().thePlayer.getDisplayNameString());
    }

}
