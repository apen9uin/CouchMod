package CouchMod.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import CouchMod.reference.CouchModVars;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items 
{
	public static Item couchLeather;
	public static Item couchItem;
	
	public static void init()
	{
		couchLeather = new ItemCouchLeather(CouchModVars.COUCHLEATHERID);
		couchItem = new ItemCouch(CouchModVars.COUCHITEMID);
	}
	
	public static void addNames()
	{
		LanguageRegistry.addName(couchLeather, CouchModVars.COCUHLEATHERLOCALNAME);
		LanguageRegistry.addName(couchItem, CouchModVars.COUCHLOCALNAME);
	}
	
	public static void registerRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(couchLeather), 
				new Object[] { "XXX",
						       "XXX",
						       "XXX",
						       
						       'X', Item.leather
		                     });
		
		GameRegistry.addRecipe(new ItemStack(couchItem),
				new Object[] { "   ",
			                   "L L",
			                   "WWW",
			                   
			                   'L', couchLeather,
			                   'W', Block.planks
		                      });
	}

}
