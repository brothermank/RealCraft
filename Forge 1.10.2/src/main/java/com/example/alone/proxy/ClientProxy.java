package com.example.alone.proxy;

import com.example.alone.init.ModItems;

/**
 * Created by Manke on 26/06/2017.
 */
public class ClientProxy implements  CommonProxy {
    @Override
    public void init() {
        ModItems.registerRenders();
    }
}
