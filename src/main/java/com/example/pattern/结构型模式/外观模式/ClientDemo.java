package com.example.pattern.结构型模式.外观模式;

/**
 * @author liwen
 */
public class ClientDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        System.out.println("running ...");
        computer.shutdown();
    }
}
