package com.icoderman.structural.bridge.example1;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void applyColor();
}
