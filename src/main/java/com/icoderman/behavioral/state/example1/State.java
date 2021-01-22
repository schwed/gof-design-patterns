package com.icoderman.behavioral.state.example1;

public abstract class State {

    public void handleRequest() {
        System.out.println("Shouldn't be able to get here");
    }

}
