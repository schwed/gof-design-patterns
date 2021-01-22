package com.icoderman.structural.bridge.example1;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        color.applyColor();
    }
}
