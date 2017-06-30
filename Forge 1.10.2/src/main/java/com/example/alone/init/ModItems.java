package com.example.alone.init;

import com.example.alone.items.itemcannabis;
import com.example.alone.items.itemcracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Manke on 26/06/2017.
 */
public class ModItems {

    public static Item cannabis;
    public static Item cracker;

    public static void init(){
        cannabis = new itemcannabis();
        cracker = new itemcracker();
    }

    public static void register(){
        GameRegistry.register(cannabis);
        GameRegistry.register(cracker);
    }

    public static void registerRenders(){
        GameRegistry.register(cannabis);
        GameRegistry.register(cracker);
    }

    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
