package com.example.alone.items;


import com.example.alone.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class itemcannabis extends Item {

    public itemcannabis(){
        setUnlocalizedName(Reference.aloneItems.CANNABIS.getUnlocalizedName());
        setRegistryName(Reference.aloneItems.CANNABIS.getRegistryName());
        setParameters();

    }

    public itemcannabis(String unlocalizedName, String registryName){
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(registryName);
        setParameters();
    }

    private void setParameters(){
        setMaxStackSize(420);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("This is 1 cannabis");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.UNCOMMON;
    }
}
