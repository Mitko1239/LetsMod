package com.mitko1239.letsmod.init;

import com.mitko1239.letsmod.block.BlockFlag;
import com.mitko1239.letsmod.block.BlockLM;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Dimitar on 17.7.2014 г..
 */
public class ModBlocks
{
    public static final BlockLM flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
