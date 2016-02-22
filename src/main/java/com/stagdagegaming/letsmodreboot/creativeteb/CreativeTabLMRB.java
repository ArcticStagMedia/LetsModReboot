package com.stagdagegaming.letsmodreboot.creativeteb;

import com.stagdagegaming.letsmodreboot.init.ModItems;
import com.stagdagegaming.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Stagdage-Desktop on 22/02/2016.
 */
public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }
    };
}
