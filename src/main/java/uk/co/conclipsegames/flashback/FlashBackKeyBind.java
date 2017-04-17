package uk.co.conclipsegames.flashback;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

/**
 * Created by ethan on 15/04/2017.
 */
public class FlashBackKeyBind {
    public static KeyBinding flashBackKey;

    public static void load() {
        flashBackKey = new KeyBinding("key.flashBack", Keyboard.KEY_Z, "key.category.main");
        ClientRegistry.registerKeyBinding(flashBackKey);
    }

    public static boolean isFlashBackKeyDown() {
        if (Keyboard.isKeyDown(Keyboard.KEY_Z))
            return true;
        return false;
    }
}