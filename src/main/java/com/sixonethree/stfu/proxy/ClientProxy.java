package com.sixonethree.stfu.proxy;

import net.minecraftforge.common.MinecraftForge;

import com.sixonethree.stfu.handler.TickHandler;

public class ClientProxy {
	private TickHandler tickHandler = new TickHandler();
	
	public void init() {
		MinecraftForge.EVENT_BUS.register(tickHandler);
	}
}