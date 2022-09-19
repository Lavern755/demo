package com.example.pattern.适配器模式;

/**
 * @author liwen
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器");
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();

        System.out.println("-------对象适配器---------");
        AdapterModel adapterModel = new AdapterModel();
        adapterModel.setSource(new Source());
        adapterModel.method1();
        adapterModel.method2();
    }
}
