package net.fabricmc.example.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.fabricmc.example.ExampleMod;

public class CustomGroup {
    public static final ItemGroup MEGAWEAPONS = FabricItemGroupBuilder.build(new Identifier("modid", "megaweapon"),
        () -> new ItemStack(ExampleMod.MONADO));
    
}
