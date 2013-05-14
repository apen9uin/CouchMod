package com.beastlypen9uin.couchmod.block;

import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;

public class BlockCouch extends BlockDirectional
{

    public BlockCouch(int par1, Material materialPar)
    {
        super(par1, materialPar);
        this.setBounds();
    }
    
    private void setBounds()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public int getRenderType()
    {
        return 14;
    }

}
