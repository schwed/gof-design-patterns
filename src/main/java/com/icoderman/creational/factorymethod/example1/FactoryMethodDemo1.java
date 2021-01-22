package com.icoderman.creational.factorymethod.example1;

public class FactoryMethodDemo1 {

    public static void main(String[] args) {

        Logger logger = LoggerProviderFactory.getLoggingProvider(Log4jLogger.class);
        logger.logMessage("hello");

        logger = LoggerProviderFactory.getLoggingProvider(SLF4JLogger.class);
        logger.logMessage("hello");
    }

}
