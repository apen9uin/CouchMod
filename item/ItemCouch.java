package CouchMod.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import CouchMod.reference.CouchModVars;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCouch extends Item
{
	public ItemCouch(int id)
	{
		super(id);
		setCreativeTab(CreativeTabs.tabDecorations);
		setMaxStackSize(1);
		setUnlocalizedName(CouchModVars.COUCHUNLOCALNAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register)
	{
		itemIcon = register.registerIcon(CouchModVars.TEXTURES_LOCATION + ":" + CouchModVars.COUCHITEM);
		
	}
	

}