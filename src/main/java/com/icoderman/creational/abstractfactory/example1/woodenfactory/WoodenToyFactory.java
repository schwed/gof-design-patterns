package com.icoderman.creational.abstractfactory.example1.woodenfactory;

import com.icoderman.creational.abstractfactory.example1.Bear;
import com.icoderman.creational.abstractfactory.example1.Cat;
import com.icoderman.creational.abstractfactory.example1.ToyFactory;

public class WoodenToyFactory implements ToyFactory {

    @Override
    public Bear getBear() {
        return new WoodenBear();
    }

    @Override
    public Cat getCat() {
        return new WoodenCat();
    }

}
