package com.proffessorvennie.rings;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.common.items.ItemRing;

import com.proffessorvennie.main.Strings;
import com.proffessorvennie.main.mainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FireRing extends Item implements IBauble {

	public static final String[] Names = new String[] { "Fire", "Regen" , "water", "invisability", "slowdown"};

	public FireRing() {
		super();
		this.setCreativeTab(mainRegistry.tabVanillaBaubles);
		this.setHasSubtypes(true);
		this.setUnlocalizedName("ring");
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.RING;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister ir) {
		
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if (!player.isPotionActive(Potion.fireResistance) || !player.isPotionActive(Potion.regeneration) || !player.isPotionActive(Potion.waterBreathing) || !player.isPotionActive(Potion.fireResistance) || !player.isPotionActive(Potion.invisibility) || !player.isPotionActive(Potion.moveSlowdown)) {
				if (itemstack.getItemDamage() == 0) {
					player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 40, 0));
				} else if (itemstack.getItemDamage() == 1) {
					player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 40, 0));
				}else if (itemstack.getItemDamage() == 2) {
					player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 40, 0));
				}else if (itemstack.getItemDamage() == 3) {
					player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 40, 0));
				}else if (itemstack.getItemDamage() == 4) {
					player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 0));
				}
		}
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		if (!player.worldObj.isRemote) {
			player.worldObj.playSoundAtEntity(player, "random.orb", 0.1F, 1.3f);
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List list) {
		for (int i = 0; i < Names.length; i++) {
			list.add(new ItemStack(this, 1, i));
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		return super.getUnlocalizedName() + "." + par1ItemStack.getItemDamage();
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
	}

	@Override
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Override
	public boolean hasEffect(ItemStack par1ItemStack, int a) {
		return true;
	}

	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.common;
	}

}
