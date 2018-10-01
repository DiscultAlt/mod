package com.avanmagic.init;

import com.avanmagic.item.ItemBase;
import com.avanmagic.main.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class AvanMagicItems 
{
	public static Item SPELL_STAR;
	
	public static void init()
	{
		SPELL_STAR = new ItemBase("spell_star", CreativeTabs.MATERIALS);
	}
	
	public static void register()
	{
		registerItem(SPELL_STAR);
	}
	
	public static void registerModels()
	{
		registerItemModel(SPELL_STAR);
	}
	
	
	
	/* Registry Helpers */
	private static void registerItem(Item item)
	{
		RegistrationHandler.ITEMS.add(item);
	}
	
	private static void registerItemModel(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
