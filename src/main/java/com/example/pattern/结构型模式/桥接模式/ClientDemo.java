package com.example.pattern.结构型模式.桥接模式;

/**
 * 桥接模式：底层的具体实现和抽象化（高层的调用）解偶
 *      最典型的例子就是数据库驱动JDBC链接的原理
 *
 * @author liwen
 */
public class ClientDemo {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        // 调用第一个对象
        bridge.setSource(new SourceSub1());
        bridge.method();

        // 调用第二个对象
        bridge.setSource(new SourceSub2());
        bridge.method();
    }
}
