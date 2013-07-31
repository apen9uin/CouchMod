package CouchMod;

import CouchMod.config.ConfigHandler;
import CouchMod.item.Items;
import CouchMod.network.PacketHandler;
import CouchMod.proxy.CommonProxy;
import CouchMod.reference.CouchModVars;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = CouchModVars.MODID, name = CouchModVars.MODNAME, version = CouchModVars.VERSION)
@NetworkMod(channels = CouchModVars.CHANNEL, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class CouchMod 
{
	@Instance(CouchModVars.MODID)
	public static CouchMod instance;
	
	@SidedProxy(clientSide = "CouchMod.proxy.ClientProxy", serverSide = "CouchMod.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		Items.init();
		proxy.initSounds();
		proxy.initRenderers();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		Items.addNames();
		Items.registerRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

}
