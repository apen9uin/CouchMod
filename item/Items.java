package CouchMod.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import CouchMod.reference.CouchModVars;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items 
{
	public static Item couchCushion;
	public static Item couchItem;
	
	public static void init()
	{
		couchCushion = new ItemCouchCushion(CouchModVars.COUCHCUSHIONID);
		couchItem = new ItemCouch(CouchModVars.COUCHITEMID);
	}
	
	public static void addNames()
	{
		LanguageRegistry.addName(couchCushion, CouchModVars.COCUHCUSHIONLOCALNAME);
		LanguageRegistry.addName(couchItem, CouchModVars.COUCHLOCALNAME);
	}
	
	public static void registerRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(couchCushion), 
				new Object[] { "XXX",
						       "XWX",
						       "XXX",
						       
						       'X', Item.leather,
						       'W', Block.cloth
		                     });
		
		GameRegistry.addRecipe(new ItemStack(couchItem),
				new Object[] { "   ",
			                   "L L",
			                   "WWW",
			                   
			                   'L', couchCushion,
			                   'W', Block.planks
		                      });
	}

}
