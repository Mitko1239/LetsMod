package com.mitko1239.letsmod;

import com.mitko1239.letsmod.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="LetsMod", name="Lets Mod", version="1.7.2-1.0")
public class LetsMod
{
    @Mod.Instance("LetsMod")
    public static LetsMod instance;

    @SidedProxy(clientSide = "com.mitko1239.letsmod.proxy.ClientProxy", serverSide = "com.mitko1239.letsmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
