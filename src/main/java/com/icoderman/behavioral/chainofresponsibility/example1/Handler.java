package com.icoderman.behavioral.chainofresponsibility.example1;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract void handleRequest(Request request);
}
