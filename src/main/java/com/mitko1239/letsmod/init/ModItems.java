package com.mitko1239.letsmod.init;

import com.mitko1239.letsmod.item.ItemLM;
import com.mitko1239.letsmod.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Dimitar on 17.7.2014 г..
 */
public class ModItems
{
    public static final ItemLM mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
