package com.example.pattern.命令模式;

/**
 * @author liwen
 */
public class MyCommand implements Command{

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.action();
    }
}
