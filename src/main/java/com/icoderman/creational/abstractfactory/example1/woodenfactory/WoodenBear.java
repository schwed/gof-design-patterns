package com.icoderman.creational.abstractfactory.example1.woodenfactory;

import com.icoderman.creational.abstractfactory.example1.Bear;

public class WoodenBear extends Bear {

    @Override
    protected String getName() {
        return "Wooden Bear";
    }

}
