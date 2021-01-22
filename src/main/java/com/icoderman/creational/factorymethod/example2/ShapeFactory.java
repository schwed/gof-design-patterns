package com.icoderman.creational.factorymethod.example2;

public class ShapeFactory {

    public static Shape getShape(String shapeType) {

        switch (shapeType) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }

}
