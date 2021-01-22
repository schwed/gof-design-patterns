package com.icoderman.structural.bridge.example1;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        color.applyColor();
    }
}
