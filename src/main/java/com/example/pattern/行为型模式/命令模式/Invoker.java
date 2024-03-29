package com.example.pattern.行为型模式.命令模式;

/**
 * @author liwen
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exec();
    }
}
