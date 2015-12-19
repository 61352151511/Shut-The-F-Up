package com.sixonethree.stfu;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.sixonethree.stfu.handler.ConfigurationHandler;
import com.sixonethree.stfu.proxy.IProxy;
import com.sixonethree.stfu.utility.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION) public class STFU {
	@Mod.Instance(Reference.MOD_ID) public static STFU instance;
	@SidedProxy(clientSide = Reference.CLIENT_PROXY) public static IProxy proxy;
	
	@Mod.EventHandler public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());
	}
	
	@Mod.EventHandler public void init(FMLInitializationEvent event) {
		proxy.init();
	}
	
	@Mod.EventHandler public void postInit(FMLPostInitializationEvent event) {
		LogHelper.info("Post-Init Complete");
	}
}
