package com.beastlypen9uin.couchmod.client.renderer.tileentity;


import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import com.beastlypen9uin.couchmod.tileentity.ModelCouch;
import com.beastlypen9uin.couchmod.tileentity.TileEntityCouch;

public abstract class TileEntityCouchRenderer extends TileEntitySpecialRenderer
{
    ModelCouch model;
    public TileEntityCouchRenderer()
      {
        model = new ModelCouch();
      }

    public void renderAModelAt(TileEntityCouch tile, double d, double d1, double d2, float f) 
      {

        int rotation = 0;
        if(tile.worldObj != null)
          {
           rotation = tile.getBlockMetadata();
          }
        bindTextureByName("*Your Texture*.png"); //texture
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
        GL11.glScalef(1.0F, -1F, -1F);
        GL11.glRotatef(rotation*90, 0.0F, 1.0F, 0.0F);
        model.renderAll();
        GL11.glPopMatrix(); //end
      }



    public void renderTileEntityAt(TileEntity par1TileEntity, double par2, double par4, double par6, float par8)
      {
        this.renderAModelAt((TileEntityCouch)par1TileEntity, par2, par4, par6, par8);
      }
}