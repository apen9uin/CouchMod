package CouchMod.config;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler 
{
	public static int COUCHBLOCKID;
  //public static String exampleString;
	
	public static void init(File file)
	{
		Configuration config = new Configuration(file);
		
		config.load();
		
		COUCHBLOCKID = config.get("blockids", "couchBlockID", 500).getInt();
      //exampleString = config.get("example category", "example var", "example standard value").getString();		
      //Here's an example to read things for future reference 		
		config.save();
		
		System.out.println("Set CouchBlock blockID as " + COUCHBLOCKID);
	}

}
