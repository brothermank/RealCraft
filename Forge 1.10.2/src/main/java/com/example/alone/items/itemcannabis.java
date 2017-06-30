package com.example.alone.items;


import com.example.alone.Reference;
import net.minecraft.item.Item;

/**
 * Created by Manke on 26/06/2017.
 */
public class itemcannabis extends Item {

    public itemcannabis(){
        setUnlocalizedName(Reference.aloneItems.CANNABIS.getUnlocalizedName());
        setRegistryName(Reference.aloneItems.CANNABIS.getRegistryName());

    }

    public itemcannabis(String unlocalizedName, String registryName){
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(registryName);

    }
}
