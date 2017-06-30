package com.example.alone.init;

import com.example.alone.Alone;
import com.example.alone.Reference;
import com.example.alone.items.itemcannabis;
import com.example.alone.items.itemcracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.naming.ReferralException;

public class ModItems {

    //Added a comment

    public static Item cannabis;
    public static Item cracker;

    public static void preInit(){

        cannabis = new itemcannabis();
        cracker = new itemcracker();

        registerItems();
        registerTabs();

    }


    public static void registerItems(){
        GameRegistry.register(cannabis);
        GameRegistry.register(cracker);
    }

    public static void registerRenders(){
        //GameRegistry.register(cannabis);
        //GameRegistry.register(cracker);
        registerRender(cannabis);
        registerRender(cracker);
    }

    public static void registerTabs(){
        cannabis.setCreativeTab(Alone.funnyTab);
        cracker.setCreativeTab(Alone.funnyTab);
    }

    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
