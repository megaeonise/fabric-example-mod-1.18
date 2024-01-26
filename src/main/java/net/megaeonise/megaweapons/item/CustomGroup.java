package net.megaeonise.megaweapons.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.megaeonise.megaweapons.Mod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CustomGroup {
    public static final ItemGroup MEGAWEAPONS = FabricItemGroupBuilder.build(new Identifier("modid", "megaweapon"),
        () -> new ItemStack(Mod.MONADO));
    
}
