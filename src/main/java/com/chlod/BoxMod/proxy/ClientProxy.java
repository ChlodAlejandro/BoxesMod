package com.chlod.BoxMod.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{

	public static void mainRegistry() {
		RenderLivingThings();
	}
	
	public static void RenderLivingThings() {
	}
	
	public void registerRenderInfo() {
		
	}

	public int addArmor(String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
