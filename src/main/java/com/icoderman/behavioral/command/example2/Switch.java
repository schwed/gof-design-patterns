package com.icoderman.behavioral.command.example2;

// invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
