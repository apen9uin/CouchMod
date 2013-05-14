package com.beastlypen9uin.couchmod.tileentity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCouch extends ModelBase
{
  //fields
    ModelRenderer Couch_Base;
    ModelRenderer Couch_Back;
    ModelRenderer Couch_Arm_1;
    ModelRenderer Couch_Arm_2;
    ModelRenderer Couch_Peg_1;
    ModelRenderer Couch_Peg_2;
    ModelRenderer Couch_Peg_3;
    ModelRenderer Couch_Peg_4;
  
  public ModelCouch()
  {
    textureWidth = 128;
    textureHeight = 32;
    
      Couch_Base = new ModelRenderer(this, 0, 0);
      Couch_Base.addBox(0F, 0F, 0F, 32, 3, 16);
      Couch_Base.setRotationPoint(-16F, 20F, -8F);
      Couch_Base.setTextureSize(64, 32);
      Couch_Base.mirror = true;
      setRotation(Couch_Base, 0F, 0F, 0F);
      Couch_Back = new ModelRenderer(this, 0, 0);
      Couch_Back.addBox(0F, 0F, 0F, 32, 10, 4);
      Couch_Back.setRotationPoint(-16F, 10F, 4F);
      Couch_Back.setTextureSize(64, 32);
      Couch_Back.mirror = true;
      setRotation(Couch_Back, 0F, 0F, 0F);
      Couch_Arm_1 = new ModelRenderer(this, 0, 0);
      Couch_Arm_1.addBox(0F, 0F, 0F, 3, 4, 12);
      Couch_Arm_1.setRotationPoint(13F, 16F, -8F);
      Couch_Arm_1.setTextureSize(64, 32);
      Couch_Arm_1.mirror = true;
      setRotation(Couch_Arm_1, 0F, 0F, 0F);
      Couch_Arm_2 = new ModelRenderer(this, 0, 0);
      Couch_Arm_2.addBox(0F, 0F, 0F, 3, 4, 12);
      Couch_Arm_2.setRotationPoint(-16F, 16F, -8F);
      Couch_Arm_2.setTextureSize(64, 32);
      Couch_Arm_2.mirror = true;
      setRotation(Couch_Arm_2, 0F, 0F, 0F);
      Couch_Peg_1 = new ModelRenderer(this, 0, 0);
      Couch_Peg_1.addBox(0F, 0F, 0F, 1, 1, 1);
      Couch_Peg_1.setRotationPoint(14F, 23F, 6F);
      Couch_Peg_1.setTextureSize(64, 32);
      Couch_Peg_1.mirror = true;
      setRotation(Couch_Peg_1, 0F, 0F, 0F);
      Couch_Peg_2 = new ModelRenderer(this, 0, 0);
      Couch_Peg_2.addBox(0F, 0F, 0F, 1, 1, 1);
      Couch_Peg_2.setRotationPoint(-15F, 23F, 6F);
      Couch_Peg_2.setTextureSize(64, 32);
      Couch_Peg_2.mirror = true;
      setRotation(Couch_Peg_2, 0F, 0F, 0F);
      Couch_Peg_3 = new ModelRenderer(this, 0, 0);
      Couch_Peg_3.addBox(0F, 0F, 0F, 1, 1, 1);
      Couch_Peg_3.setRotationPoint(-15F, 23F, -7F);
      Couch_Peg_3.setTextureSize(64, 32);
      Couch_Peg_3.mirror = true;
      setRotation(Couch_Peg_3, 0F, 0F, 0F);
      Couch_Peg_4 = new ModelRenderer(this, 0, 0);
      Couch_Peg_4.addBox(0F, 0F, 0F, 1, 1, 1);
      Couch_Peg_4.setRotationPoint(14F, 23F, -7F);
      Couch_Peg_4.setTextureSize(64, 32);
      Couch_Peg_4.mirror = true;
      setRotation(Couch_Peg_4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, Entity f7Entity)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, f7Entity);
    Couch_Base.render(f5);
    Couch_Back.render(f5);
    Couch_Arm_1.render(f5);
    Couch_Arm_2.render(f5);
    Couch_Peg_1.render(f5);
    Couch_Peg_2.render(f5);
    Couch_Peg_3.render(f5);
    Couch_Peg_4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }

public void renderAll()
{
    // TODO Auto-generated method stub
    
}

}
