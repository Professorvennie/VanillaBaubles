package com.proffessorvennie.main;

import net.minecraft.creativetab.CreativeTabs;

import com.proffessorvennie.amulets.VBAmulets;
import com.proffessorvennie.blets.VBBlets;
import com.proffessorvennie.rings.VBRings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Strings.MODID, name = Strings.NAME , version = Strings.VERSION)

public class mainRegistry {
	
	public static CreativeTabs tabVanillaBaubles= new creativeTabVanillaBaubles("VanillaBaubles");
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent event){
		VBAmulets.mainRegistry();
		VBBlets.mainRegistry();
		VBRings.mainRegistry();
	}
	
	@EventHandler
	public static void load(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
    
    @EventHandler
    public void init(FMLInitializationEvent e){
        
    }
}
