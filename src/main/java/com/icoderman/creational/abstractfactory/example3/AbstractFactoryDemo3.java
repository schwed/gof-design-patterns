package com.icoderman.creational.abstractfactory.example3;

import com.icoderman.creational.abstractfactory.example3.applefactory.AppleFactory;

public class AbstractFactoryDemo3 {

    public static void main(String[] args) {

        TechFactory techFactory = new AppleFactory();
        //TechFactory techFactory = new SamsungFactory();

        Laptop laptop = techFactory.getLaptop();
        System.out.println(laptop.getName());

        Phone ultraBook = techFactory.getPhone();
        System.out.println(ultraBook.getName());

    }

}
