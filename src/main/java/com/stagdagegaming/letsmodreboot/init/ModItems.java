package com.stagdagegaming.letsmodreboot.init;

import com.stagdagegaming.letsmodreboot.item.ItemLMRB;
import com.stagdagegaming.letsmodreboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Stagdage-Desktop on 22/02/2016.
 */
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
