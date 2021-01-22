package com.icoderman.behavioral.chainofresponsibility.example1;

public class Director extends Handler {

    @Override
    void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Dirrectors can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }

}
