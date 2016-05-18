package com.sixonethree.stfu.handler;

import java.util.Calendar;

import net.minecraft.client.Minecraft;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class TickHandler {
	private static int lastSecond = 0;
	
	@SubscribeEvent public void onTick(ClientTickEvent event) {
		int curSecond = Calendar.getInstance().get(Calendar.SECOND);
		if (curSecond != lastSecond) {
			lastSecond = curSecond;
			float curVolume;
			if (ConfigurationHandler.isShutUpAmbient()) {
				curVolume = Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.AMBIENT);
				if (curVolume != ConfigurationHandler.getVolumeAmbient()) {
					Minecraft.getMinecraft().gameSettings.setSoundLevel(SoundCategory.AMBIENT, ConfigurationHandler.getVolumeAmbient());
				}
			}
			if (ConfigurationHandler.isShutUpBlocks()) {
				curVolume = Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.BLOCKS);
				if (curVolume != ConfigurationHandler.getVolumeBlocks()) {
					Minecraft.getMinecraft().gameSettings.setSoundLevel(SoundCategory.BLOCKS, ConfigurationHandler.getVolumeBlocks());
				}
			}
			if (ConfigurationHandler.isShutUpHostile()) {
				curVolume = Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.HOSTILE);
				if (curVolume != ConfigurationHandler.getVolumeHostile()) {
					Minecraft.getMinecraft().gameSettings.setSoundLevel(SoundCategory.HOSTILE, ConfigurationHandler.getVolumeHostile());
				}
			}
			if (ConfigurationHandler.isShutUpMaster()) {
				curVolume = Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.MASTER);
				if (curVolume != ConfigurationHandler.getVolumeMaster()) {
					Minecraft.getMinecraft().gameSettings.setSoundLevel(SoundCategory.MASTER, ConfigurationHandler.getVolumeMaster());
				}
			}
			if (ConfigurationHandler.isShutUpMusic()) {
				curVolume = Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.MUSIC);
				if (curVolume != ConfigurationHandler.getVolumeMusic()) {
					Minecraft.getMinecraft().gameSettings.setSoundLevel(SoundCategory.MUSIC, ConfigurationHandler.getVolumeMusic());
				}
			}
			if (ConfigurationHandler.isShutUpNeutral()) {
				curVolume = Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.NEUTRAL);
				if (curVolume != ConfigurationHandler.getVolumeNeutral()) {
					Minecraft.getMinecraft().gameSettings.setSoundLevel(SoundCategory.NEUTRAL, ConfigurationHandler.getVolumeNeutral());
				}
			}
			if (ConfigurationHandler.isShutUpPlayers()) {
				curVolume = Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.PLAYERS);
				if (curVolume != ConfigurationHandler.getVolumePlayers()) {
					Minecraft.getMinecraft().gameSettings.setSoundLevel(SoundCategory.PLAYERS, ConfigurationHandler.getVolumePlayers());
				}
			}
			if (ConfigurationHandler.isShutUpRecords()) {
				curVolume = Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.RECORDS);
				if (curVolume != ConfigurationHandler.getVolumeRecords()) {
					Minecraft.getMinecraft().gameSettings.setSoundLevel(SoundCategory.RECORDS, ConfigurationHandler.getVolumeRecords());
				}
			}
			if (ConfigurationHandler.isShutUpVoice()) {
				curVolume = Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.VOICE);
				if (curVolume != ConfigurationHandler.getVolumeVoice()) {
					Minecraft.getMinecraft().gameSettings.setSoundLevel(SoundCategory.VOICE, ConfigurationHandler.getVolumeVoice());
				}
			}
			if (ConfigurationHandler.isShutUpWeather()) {
				curVolume = Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.WEATHER);
				if (curVolume != ConfigurationHandler.getVolumeWeather()) {
					Minecraft.getMinecraft().gameSettings.setSoundLevel(SoundCategory.WEATHER, ConfigurationHandler.getVolumeWeather());
				}
			}
		}
	}
}