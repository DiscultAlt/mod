package com.avanmagic.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemSpellStar extends ItemBase
{

	public ItemSpellStar(String name, CreativeTabs tabs) 
	{
		super(name, tabs);
	}
	
	
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 
	{
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
}
