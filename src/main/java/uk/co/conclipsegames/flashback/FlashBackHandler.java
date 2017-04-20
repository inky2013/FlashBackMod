package uk.co.conclipsegames.flashback;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ethan on 15/04/2017.
 */
public class FlashBackHandler {

    public static HashMap<String, FlashBackPlayer> players = new HashMap<String, FlashBackPlayer>();

    public static void add_player_pos(String player, Double[] pta) {
        FlashBackPlayer p = players.get(player);
        if (p == null) {
            players.put(player, new FlashBackPlayer(player));
            p = players.get(player);
        }
        p.add_pos(pta);
    }

    public static void flash_back() {
        String playername = Minecraft.getMinecraft().thePlayer.getDisplayNameString();
        ItemStack stone = new ItemStack(Item.getByNameOrId("stone"));
        if(Minecraft.getMinecraft().thePlayer.inventory.hasItemStack(stone))
        {
            System.out.println(players);
            List<Double[]> fblist = players.get(playername).get_fb_pos();
            System.out.println(fblist);
            EntityPlayer player = FlashBack.instance.server.getPlayerList().getPlayerByUsername(playername);
            if (fblist == null || player == null) {
                return;
            }
            Double[] cv = fblist.get(0);
            if (cv == null) {
                return;
            }
            player.setPositionAndUpdate(cv[0], cv[1], cv[2]);

        }
    }

}
