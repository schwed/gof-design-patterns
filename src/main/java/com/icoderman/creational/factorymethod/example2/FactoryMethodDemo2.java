package com.icoderman.creational.factorymethod.example2;

public class FactoryMethodDemo2 {

    public static void main(String[] args) {

        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("square");
        shape3.draw();

    }

}
