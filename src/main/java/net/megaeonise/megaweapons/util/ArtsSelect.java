package net.megaeonise.megaweapons.util;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.GameModeSelectionScreen.ButtonWidget;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
public class ArtsSelect extends Screen {

    protected ArtsSelect(Text title) {
        super(title);
    }

    public ButtonWidget test1;
    public ButtonWidget test2;

}
