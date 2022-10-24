package com.example.pattern.结构型模式.适配器模式.接口适配器模式;

/**
 * @author liwen
 */
public class WrapperTest {
    public static void main(String[] args) {
        SourceSub1 sourceSub1 = new SourceSub1();
        SourceSub2 sourceSub2 = new SourceSub2();

        sourceSub1.method1();
        sourceSub1.method2();

        sourceSub2.method2();
        sourceSub2.method1();
    }
}
