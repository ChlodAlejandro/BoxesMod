package com.chlod.BoxMod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {

	public static void register() {
		loadItems();
		registerItems();
	}
	
	public static Block CardboardCreator;
	
	public static void loadItems() {
		CardboardCreator = CardboardCreator(Material.ground).setBlockName("Machine");
	}
	
	public static void registerItems() {
		
	}
	
}
