package com.icoderman.behavioral.iterator.example1;

import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();
        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

        Iterator<String> bikeIterator = repo.iterator();
        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }
    }
}
