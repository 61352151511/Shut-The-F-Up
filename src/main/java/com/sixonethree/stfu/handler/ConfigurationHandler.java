package com.sixonethree.stfu.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.sixonethree.stfu.Reference;

public class ConfigurationHandler {
	public static Configuration configuration;
	
	private static boolean shutUpAmbient = false;
	private static boolean shutUpBlocks = false;
	private static boolean shutUpHostile = false;
	private static boolean shutUpMaster = false;
	private static boolean shutUpMusic = false;
	private static boolean shutUpNeutral = false;
	private static boolean shutUpPlayers = false;
	private static boolean shutUpRecords = false;
	private static boolean shutUpVoice = false;
	private static boolean shutUpWeather = false;
	private static float volumeAmbient = 1.0F;
	private static float volumeBlocks = 1.0F;
	private static float volumeHostile = 1.0F;
	private static float volumeMaster = 1.0F;
	private static float volumeMusic = 0.0F;
	private static float volumeNeutral = 1.0F;
	private static float volumePlayers = 1.0F;
	private static float volumeRecords = 1.0F;
	private static float volumeVoice = 1.0F;
	private static float volumeWeather = 1.0F;
	
	public static void init(File configFile) {
		if (configuration == null) {
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	@SubscribeEvent public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration() {
		shutUpAmbient = configuration.getBoolean("Shut Up Ambient", "Ambient", false, "");
		volumeAmbient = configuration.getFloat("Ambient Volume", "Ambient", 1.0F, 0.0F, 1.0F, "Volume for ambient to be stuck at.");
		shutUpBlocks = configuration.getBoolean("Shut Up Blocks", "Blocks", false, "");
		volumeBlocks = configuration.getFloat("Blocks Volume", "Blocks", 1.0F, 0.0F, 1.0F, "Volume for blocks to be stuck at.");
		shutUpHostile = configuration.getBoolean("Shut Up Hostile", "Hostile", false, "");
		volumeHostile = configuration.getFloat("Hostile Volume", "Hostile", 1.0F, 0.0F, 1.0F, "Volume for hostile to be stuck at.");
		shutUpMaster = configuration.getBoolean("Shut Up Master", "Master", false, "");
		volumeMaster = configuration.getFloat("Master Volume", "Master", 1.0F, 0.0F, 1.0F, "Volume for master to be stuck at.");
		shutUpMusic = configuration.getBoolean("Shut Up Music", "Music", true, "");
		volumeMusic = configuration.getFloat("Music Volume", "Music", 0.0F, 0.0F, 1.0F, "Volume for music to be stuck at.");
		shutUpNeutral = configuration.getBoolean("Shut Up Neutral", "Neutral", false, "");
		volumeNeutral = configuration.getFloat("Neutral Volume", "Neutral", 1.0F, 0.0F, 1.0F, "Volume for neutral to be stuck at.");
		shutUpPlayers = configuration.getBoolean("Shut Up Players", "Players", false, "");
		volumePlayers = configuration.getFloat("Players Volume", "Players", 1.0F, 0.0F, 1.0F, "Volume for players to be stuck at.");
		shutUpRecords = configuration.getBoolean("Shut Up Records", "Records", false, "");
		volumeRecords = configuration.getFloat("Records Volume", "Records", 1.0F, 0.0F, 1.0F, "Volume for records to be stuck at.");
		shutUpVoice = configuration.getBoolean("Shut Up Voice", "Voice", false, "");
		volumeVoice = configuration.getFloat("Voice Volume", "Voice", 1.0F, 0.0F, 1.0F, "Volume for voice to be stuck at.");
		shutUpWeather = configuration.getBoolean("Shut Up Weather", "Weather", false, "");
		volumeWeather = configuration.getFloat("Weather Volume", "Weather", 1.0F, 0.0F, 1.0F, "Volume for weather to be stuck at.");
		
		if (configuration.hasChanged()) {
			configuration.save();
		}
	}

	public static boolean isShutUpAmbient() {
		return shutUpAmbient;
	}

	public static boolean isShutUpBlocks() {
		return shutUpBlocks;
	}

	public static boolean isShutUpHostile() {
		return shutUpHostile;
	}

	public static boolean isShutUpMaster() {
		return shutUpMaster;
	}

	public static boolean isShutUpMusic() {
		return shutUpMusic;
	}

	public static boolean isShutUpNeutral() {
		return shutUpNeutral;
	}

	public static boolean isShutUpPlayers() {
		return shutUpPlayers;
	}

	public static boolean isShutUpRecords() {
		return shutUpRecords;
	}

	public static boolean isShutUpVoice() {
		return shutUpVoice;
	}

	public static boolean isShutUpWeather() {
		return shutUpWeather;
	}

	public static float getVolumeAmbient() {
		return volumeAmbient;
	}

	public static float getVolumeBlocks() {
		return volumeBlocks;
	}

	public static float getVolumeHostile() {
		return volumeHostile;
	}

	public static float getVolumeMaster() {
		return volumeMaster;
	}

	public static float getVolumeMusic() {
		return volumeMusic;
	}

	public static float getVolumeNeutral() {
		return volumeNeutral;
	}

	public static float getVolumePlayers() {
		return volumePlayers;
	}

	public static float getVolumeRecords() {
		return volumeRecords;
	}

	public static float getVolumeVoice() {
		return volumeVoice;
	}

	public static float getVolumeWeather() {
		return volumeWeather;
	}
}