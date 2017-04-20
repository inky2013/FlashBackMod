package uk.co.conclipsegames.flashback.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import uk.co.conclipsegames.flashback.FlashBack;

/**
 * Created by James Swire on 20/04/2017.
 */
public class ItemBase extends Item {
    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        FlashBack.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}