package com.example.alone.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Manke on 30/06/2017.
 */
public class FunnyCreativeTab extends CreativeTabs {

    public FunnyCreativeTab(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.BLAZE_ROD;
    }
}
