package com.example.pattern.单例模式;

/**
 * @author liwen
 */
public class SingleTon2 {
    private static SingleTon2 singleTon2 = null;
    private SingleTon2() {}

    /**
     * TODO
     * @return
     */
    public static SingleTon2 getInstance() {
        if (singleTon2 == null) {
            syncInit();
        }
        return singleTon2;
    }

    private static synchronized void syncInit() {
        if (singleTon2 == null) {
            singleTon2 = new SingleTon2();
        }
    }
}
