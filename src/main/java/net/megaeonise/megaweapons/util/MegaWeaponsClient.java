package net.megaeonise.megaweapons.util;

import net.fabricmc.api.ClientModInitializer;
import net.megaeonise.megaweapons.util.Input;

public class MegaWeaponsClient implements ClientModInitializer{
    @Override
    public void onInitializeClient() {
        Input.register();
        
    }
}
