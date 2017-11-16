package net.justbake.swordcraft;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SwordCraft.MOD_ID, name = SwordCraft.MOD_NAME, version = SwordCraft.VERSION, dependencies = SwordCraft.DEPENDINCIES)
public class SwordCraft {

	// Constants
	public static final String MOD_ID = "swordcraft";
	public static final String MOD_NAME = "SwordCraft Mod";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDINCIES = "required-after:forge@[14.23.0.2544,)";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";

	// Variables
	public static Random random = new Random();

	@Instance(MOD_ID)
	public static SwordCraft instance;

	@SidedProxy(clientSide = "net.justbake.swordcraft.ClientProxy", serverSide = "net.justbake.swordcraft.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		proxy.preInit(event);

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		proxy.init(event);

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		proxy.postInit(event);

	}

}
