package com.icoderman.creational.abstractfactory.example2;

import com.icoderman.creational.abstractfactory.example2.factory1.Factory1;

public class AbstractFactoryDemo2 {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = new Factory1();
        //AbstractFactory abstractFactory = new Factory2();

        ProductA productA = abstractFactory.getProductA();
        System.out.println(productA.getName());

        ProductB productB = abstractFactory.getProductB();
        System.out.println(productB.getName());

        ProductC productC = abstractFactory.getProductC();
        System.out.println(productC.getName());

    }

}
