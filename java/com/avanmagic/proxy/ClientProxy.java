package com.avanmagic.proxy;

import com.avanmagic.init.AvanMagicItems;
import com.avanmagic.main.Reference;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit()
	{
		
	}
	
	@Override
	public void init()
	{
		
	}
	
	@Override
	public void postInit()
	{
		
	}
	
	@Mod.EventBusSubscriber(modid = Reference.MODID, value = Side.CLIENT)
	public static class RegistrationHandler
	{

		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event)
		{
			AvanMagicItems.registerModels();
			//SAOBlocks.registerModels();
		}
	}
}
