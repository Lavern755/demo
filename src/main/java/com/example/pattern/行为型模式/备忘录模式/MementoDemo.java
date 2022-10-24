package com.example.pattern.行为型模式.备忘录模式;

/**
 * @author liwen
 */
public class MementoDemo {
    public static void main(String[] args) {
        /**
         * 创建原始类
         */
        Original original = new Original("egg");
        /**
         * 创建备忘录
         */
        Storage storage = new Storage(original.createMemento());

        /**
         * 修改原始类的状态
         */
        System.out.println("初始化状态：" + original.getValue());
        original.setValue("chicken");
        System.out.println("修改后的状态：" + original.getValue());

        /**
         * 恢复原始类的状态
         */
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复原始类的状态");
    }
}
