package com.proffessorvennie.rings;

import com.proffessorvennie.main.Strings;
import com.proffessorvennie.main.mainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import baubles.api.BaubleType;
import baubles.api.IBauble;

public class RegenRing extends FireRing implements IBauble{
	
	public RegenRing(){
		this.setCreativeTab(mainRegistry.tabVanillaBaubles);
		this.setUnlocalizedName("Regen_Ring");
		this.setTextureName(Strings.MODID + ":Regen_Ring");
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
		if(!player.isPotionActive(Potion.regeneration))
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 40, 0));
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		if (!player.worldObj.isRemote) {
			player.worldObj.playSoundAtEntity(player, "random.orb", 0.1F, 1.3f);
		}
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
		return EnumRarity.rare;
	}

}
