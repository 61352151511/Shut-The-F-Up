package com.sixonethree.stfu.proxy;

import net.minecraftforge.common.MinecraftForge;

import com.sixonethree.stfu.handler.TickHandler;

public class ClientProxy implements IProxy {
	private TickHandler tickHandler = new TickHandler();
	
	@Override public void init() {
		MinecraftForge.EVENT_BUS.register(tickHandler);
	}
}