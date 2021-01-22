package com.icoderman.creational.factorymethod.example1;

public class Log4jLogger implements Logger {

    @Override
    public void logMessage(String message) {
        System.out.println("Log4J logger: " + message);
    }

}
