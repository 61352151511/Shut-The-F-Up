package com.sixonethree.stfu.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.sixonethree.stfu.Reference;

public class ConfigurationHandler {
	public static Configuration configuration;
	
	private static float volume = 0;
	
	public static void init(File configFile) {
		if (configuration == null) {
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	@SubscribeEvent public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration() {
		volume = configuration.getFloat("Music Volume", Configuration.CATEGORY_GENERAL, 0F, 0F, 1F, "Volume for music to be set to on launch.");
		
		if (configuration.hasChanged()) {
			configuration.save();
		}
	}
	
	public static float getVolume() { return volume; }
}