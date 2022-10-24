package com.example.pattern.结构型模式.外观模式;

/**
 * @author liwen
 */
public class Computer {
    private Cpu cpu;
    private Memeory memeory;
    private Disk disk;

    public Computer() {
        cpu = new Cpu();
        memeory = new Memeory();
        disk = new Disk();
    }

    public void startup() {
        System.out.println("startup the computer");
        cpu.startup();
        memeory.startup();
        disk.startup();
        System.out.println("startup the computer finished");
    }

    /**
     * 关闭顺序一般与启动顺序相反
     */
    public void shutdown() {
        System.out.println("shutdown the computer");
        disk.shutdown();
        memeory.shutdown();
        cpu.shutdown();
        System.out.println("shutdown the computer finished");
    }
}
