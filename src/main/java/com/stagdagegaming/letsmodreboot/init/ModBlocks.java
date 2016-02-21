package com.stagdagegaming.letsmodreboot.init;

import com.stagdagegaming.letsmodreboot.block.BlockFlag;
import com.stagdagegaming.letsmodreboot.block.BlockLMRB;
import com.stagdagegaming.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Stagdage-Desktop on 22/02/2016.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag,"flag");
    }
}
