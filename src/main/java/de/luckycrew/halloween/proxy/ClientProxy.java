package de.luckycrew.halloween.proxy;

import de.luckycrew.halloween.handler.HalloweenClientHandler;
import de.luckycrew.halloween.render.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.*;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
	public void preinit(FMLPreInitializationEvent event) {
		super.preinit(event);
		new HalloweenModelRegistry();
	}
	
	public void init(FMLInitializationEvent event) {
		super.init(event);
		new HalloweenRenderRegistry();
	}
	
	public void postinit(FMLPostInitializationEvent event) {
		super.postinit(event);
		new HalloweenClientHandler();
	}
	
}
