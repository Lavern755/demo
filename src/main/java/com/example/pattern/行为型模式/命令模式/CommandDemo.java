package com.example.pattern.行为型模式.命令模式;

/**
 * @author liwen
 */
public class CommandDemo {
    public static void main(String[] args) {
        /**
         * 命令
         */
        Command command = new MyCommand(new Receiver());
        /**
         * 命令的发出者，真正执行命令的是Receiver，我们可以定义很多种类的Receiver，然后使用Command
         * 包装起来。类似现在部队的不同兵种，每个兵种执行特定的作战任务。
         */
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
