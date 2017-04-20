package uk.co.conclipsegames.flashback.Item;

import net.minecraft.creativetab.CreativeTabs;

import static net.minecraftforge.fml.common.registry.GameRegistry.register;

/**
 * Created by James Swire on 20/04/2017.
 */
public class ModItems {
    public static ItemBase qClock;

    public static void init()
    {
        qClock = register(new ItemBase("qClock").setCreativeTab(CreativeTabs.MATERIALS));
    }
}
