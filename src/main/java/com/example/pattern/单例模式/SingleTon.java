package com.example.pattern.单例模式;

/**
 * @author liwen
 */
public class SingleTon {
    private static SingleTon instance = null;

    /**
     * 私有化构造方法
     */
    private SingleTon() {}

    /**
     * 提供全局访问点
     * @return
     */
    public static SingleTon getInstance() {
        // 线程不安全
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

    /**
     * 解决线程安全问题，但是性能下降
     * @return
     */
    public static synchronized SingleTon getInstance2() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

    /**
     * 依然有线程安全问题
     * @return
     */
    public static SingleTon getInstance3() {
        if (instance == null) {
            // 时间点1 假设A、B线程同时进入到这里
            // 时间点2 A 先获取到了锁，B等待
            synchronized (instance) {
                // 时间点4 B获取锁，继续执行，发现instance不是null，就立马返回
                // 因为JAVA创建对象和赋值操作是分开的，所以在线程B执行其他逻辑的时候，对象有可能还没初始化完成
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
            // 时间点3 A执行到这里，并释放了锁
        }
        return instance;
    }

    private static class SingleTonFactory {
        /**
         * 和饿汉式的单例模式很相似
         */
        private static SingleTon singleTon = new SingleTon();
    }

    /**
     * 通过内部类的方法维护单例，则依赖的是类加载机制，只加载一次
     * @return
     */
    public static SingleTon getInstance4(){
        return SingleTonFactory.singleTon;
    }

}
