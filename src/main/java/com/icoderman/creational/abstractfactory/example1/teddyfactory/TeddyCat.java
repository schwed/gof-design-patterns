package com.icoderman.creational.abstractfactory.example1.teddyfactory;

import com.icoderman.creational.abstractfactory.example1.Cat;

public class TeddyCat extends Cat {

    @Override
    protected String getName() {
        return "Teddy Cat";
    }

}
