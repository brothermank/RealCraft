package com.example.alone;

import com.example.alone.init.ModItems;
import com.example.alone.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Alone
{
    @Instance
    public static Alone instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        System.out.print("Alone Pre Init");

        ModItems.init();
        ModItems.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        System.out.print("Alone Init");
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        System.out.print("Alone Post Init");

    }




}
