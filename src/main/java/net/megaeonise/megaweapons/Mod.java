package net.megaeonise.megaweapons;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.megaeonise.megaweapons.item.CustomGroup;
import net.megaeonise.megaweapons.item.MegaToolMaterial;
import net.megaeonise.megaweapons.item.MegaWeapon;
import net.megaeonise.megaweapons.item.Monado;
import net.minecraft.util.registry.Registry;
import net.megaeonise.megaweapons.util.Input;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Identifier;

public class Mod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("megaweapons");
	//Monado instance
	public static final ToolItem MONADO = Registry.register(Registry.ITEM, new Identifier("megaweapons", "monado"),
	  new Monado(MegaToolMaterial.INSTANCE, 12, -3F, new FabricItemSettings().group(CustomGroup.MEGAWEAPONS)));
	

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution. Test button here
		LOGGER.info("tttt");
		
	}



}


