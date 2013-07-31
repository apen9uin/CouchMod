package CouchMod.config;

import java.io.File;

import CouchMod.reference.CouchModVars;
import net.minecraftforge.common.Configuration;

public class ConfigHandler 
{
	
	
	public static void init(File file)
	{
		Configuration config = new Configuration(file);
		
		config.load();
		
		CouchModVars.COUCHBLOCKID = config.getBlock("couchBlockID", 4000).getInt();
		CouchModVars.COUCHLEATHERID = config.getItem("couchLeatherID", 5000).getInt() - 256;
		CouchModVars.COUCHITEMID = config.getItem("couchItemID", 5001).getInt() - 256;
		
      //exampleString = config.get("example category", "example var", "example standard value").getString();		
      //Here's an example to read things for future reference 		
		config.save();
	}

}
