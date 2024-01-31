package net.megaeonise.megaweapons.util;

import org.lwjgl.glfw.GLFW;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.LiteralText;

public class Input {

    public static KeyBinding weaponMenu;
    

    public static void register() {
    weaponMenu = KeyBindingHelper.registerKeyBinding(new KeyBinding(
        "key.megaweapons.weaponmenu",
        InputUtil.Type.MOUSE,
        GLFW.GLFW_MOUSE_BUTTON_RIGHT,
        "category.megaweapons.megaweapons"
    ));

    registerKeyInputs();
    }

    
    public static void registerKeyInputs() {
        AngleCalc angle = new AngleCalc();
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
    while (weaponMenu.wasPressed()) {
	client.player.sendMessage(new LiteralText(Double.toString(angle.mouseAngle())), false);
    }
});
    
    }
    
}
