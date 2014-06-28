package com.proffessorvennie.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class creativeTabVanillaBaubles extends CreativeTabs{

	public creativeTabVanillaBaubles(String name) {
		super(name);
	}

	@Override
	public Item getTabIconItem() {
		return Items.diamond;
	}

}
