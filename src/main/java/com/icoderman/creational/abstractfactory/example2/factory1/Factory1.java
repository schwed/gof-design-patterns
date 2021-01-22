package com.icoderman.creational.abstractfactory.example2.factory1;

import com.icoderman.creational.abstractfactory.example2.AbstractFactory;
import com.icoderman.creational.abstractfactory.example2.ProductA;
import com.icoderman.creational.abstractfactory.example2.ProductB;
import com.icoderman.creational.abstractfactory.example2.ProductC;

public class Factory1 implements AbstractFactory {

    @Override
    public ProductA getProductA() {
        return new ProductAF1();
    }

    @Override
    public ProductB getProductB() {
        return new ProductBF1();
    }

    @Override
    public ProductC getProductC() {
        return new ProductCF1();
    }

}