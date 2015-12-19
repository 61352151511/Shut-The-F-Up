package com.sixonethree.stfu.proxy;

import net.minecraftforge.common.MinecraftForge;

import com.sixonethree.stfu.handler.TickHandler;

public class ClientProxy implements IProxy {
	private boolean registered = false;
	
	@Override public void init() {
		if (!registered) {
			MinecraftForge.EVENT_BUS.register(new TickHandler());
		}
		registered = true;
	}
}