package com.example.alone;

import com.example.alone.CreativeTabs.FunnyCreativeTab;
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
    //@Instance
    //public static Alone instance;

    @Mod.Instance
    public static Alone modInstance; //Whats the difference between these two instances? Which should be used when?

    //Use proxy for server/client specific operations (such as using Minecraft instance which is unly available on client side).
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;


    public static FunnyCreativeTab  funnyTab;

    //Forge calls initialization events, dont call manually
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        funnyTab = new FunnyCreativeTab(FunnyCreativeTab.getNextID(), "funny_tab");

        ModItems.preInit();

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }




}
