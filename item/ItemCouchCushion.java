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

public class ItemCouchCushion extends Item
{
	public ItemCouchCushion(int id)
	{
		super(id);
		setCreativeTab(CreativeTabs.tabMaterials);
		setMaxStackSize(4);
		setUnlocalizedName(CouchModVars.COUCHCUSHIONUNLOCALNAME);
	}
	
	//Just not what it's actually used for just testing that I made the item right
	/*@Override
	public boolean func_111207_a(ItemStack itemStack, EntityPlayer entityPlayer, EntityLivingBase target)
	{
		if(!target.worldObj.isRemote)
		{
			target.motionY = 2;
		}
		
		return false;
	}*/
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register)
	{
		itemIcon = register.registerIcon(CouchModVars.TEXTURES_LOCATION + ":" + CouchModVars.COUCHCUSHIONICON);
		
	}
	

}
