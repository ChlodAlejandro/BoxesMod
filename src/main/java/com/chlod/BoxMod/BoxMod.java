package com.chlod.BoxMod;

import com.chlod.BoxMod.lib.Reference;
import com.chlod.BoxMod.proxy.ClientProxy;
import com.chlod.BoxMod.proxy.ServerProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class BoxMod {

	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.SERVERPROXY)
	public static ServerProxy proxy;
	
	@Instance
	public static BoxMod modInstance;
	public static BoxMod instance;
	
	@EventHandler
	public static void PreInitialization(FMLPreInitializationEvent event) {
		ClientProxy.mainRegistry();
		proxy.registerRenderInfo();
	}
	
	@EventHandler
	public static void Initialization(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void PostInitialization(FMLPostInitializationEvent event) {
		
	}
	
}
