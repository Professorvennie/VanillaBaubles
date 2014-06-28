package com.proffessorvennie.rings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class VBRings {

	public static void mainRegistry(){
		init();
		registry();
	}
	
	public static Item itemRing1;
	public static Item itemRing2;

	private static void init() {
		itemRing1 = new FireRing();
	}
	
	private static void registry() {
		GameRegistry.registerItem(itemRing1, itemRing1.getUnlocalizedName());

	}
	
}
