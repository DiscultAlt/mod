package com.avanmagic.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
	public ItemBase(String name, CreativeTabs tabs)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tabs);
	}
}
