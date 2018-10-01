package com.avanmagic.init;

import java.util.LinkedList;
import java.util.List;

import com.avanmagic.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Reference.MODID)
public class RegistrationHandler 
{
	public static final List<Item> ITEMS = new LinkedList();
	public static final List<Block> BLOCKS = new LinkedList();
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		
		AvanMagicItems.init();
		AvanMagicItems.register();
		
		
		ITEMS.stream().forEach(item -> event.getRegistry().register(item));
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
	
		//
		
		BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
	}
	
	
}
