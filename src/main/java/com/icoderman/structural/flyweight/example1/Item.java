package com.icoderman.structural.flyweight.example1;

// Instances of Item will be the Flyweights
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
