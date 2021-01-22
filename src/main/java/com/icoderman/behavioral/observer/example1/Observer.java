package com.icoderman.behavioral.observer.example1;

public abstract class Observer {
    protected Subject subject;

    abstract void update();
}
