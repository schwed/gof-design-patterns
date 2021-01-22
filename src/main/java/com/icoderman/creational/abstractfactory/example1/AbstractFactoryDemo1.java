package com.icoderman.creational.abstractfactory.example1;

import com.icoderman.creational.abstractfactory.example1.teddyfactory.TeddyToyFactory;

public class AbstractFactoryDemo1 {

    public static void main(String[] args) {

        ToyFactory toyFactory = new TeddyToyFactory();
        //ToyFactory toyFactory = new WoodenToyFactory();

        Bear bear = toyFactory.getBear();
        Cat cat = toyFactory.getCat();

        System.out.println("I've got " + bear.getName() + " and " + cat.getName());

    }

}
