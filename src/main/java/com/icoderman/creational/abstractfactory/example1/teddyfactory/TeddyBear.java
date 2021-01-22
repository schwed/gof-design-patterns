package com.icoderman.creational.abstractfactory.example1.teddyfactory;

import com.icoderman.creational.abstractfactory.example1.Bear;

public class TeddyBear extends Bear {

    @Override
    protected String getName() {
        return "Teddy Bear";
    }
}
