package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.item.CustomGroup;
import net.fabricmc.example.item.MegaWeapon;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.util.Identifier;

public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	//Monado instance
	public static final MegaWeapon MONADO = 
	  Registry.register(Registry.ITEM, new Identifier("modid", "monado"), new MegaWeapon(new FabricItemSettings().group(CustomGroup.MEGAWEAPONS)));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("tttt");
	}



}


