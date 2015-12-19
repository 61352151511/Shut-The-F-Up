package com.sixonethree.stfu.handler;

import java.util.Calendar;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundCategory;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class TickHandler {
	private static int lastSecond = 0;
	
	@SubscribeEvent public void onTick(ClientTickEvent event) {
		int curSecond = Calendar.getInstance().get(Calendar.SECOND);
		if (curSecond != lastSecond) {
			lastSecond = curSecond;
			float curVolume = Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.MUSIC);
			if (curVolume != ConfigurationHandler.getVolume()) {
				Minecraft.getMinecraft().gameSettings.setSoundLevel(SoundCategory.MUSIC, ConfigurationHandler.getVolume());
			}
		}
	}
}