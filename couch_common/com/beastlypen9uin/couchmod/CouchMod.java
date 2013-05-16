package com.beastlypen9uin.couchmod;

import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
//import net.minecraft.creativetab.CreativeTabs;

import com.beastlypen9uin.couchmod.block.BlockCouch;
import com.beastlypen9uin.couchmod.item.ItemCouch;
import com.beastlypen9uin.couchmod.lib.Reference;

import cpw.mods.fml.common.Mod;
//import cpw.mods.fml.common.Mod.Block;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class CouchMod 
{
    public final static BlockDirectional couchBlock = new BlockCouch(500, Material.cloth);
    public final static Item couchItem = new ItemCouch(5000, 1, CreativeTabs.tabDecorations, 1, "couchItem");
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
        
    }
    
    @Init
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.registerBlock(couchBlock, "couchBlock");
        ModLoader.addName(couchBlock, "Couch Block");
        GameRegistry.registerItem(couchItem, "Couch");
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}