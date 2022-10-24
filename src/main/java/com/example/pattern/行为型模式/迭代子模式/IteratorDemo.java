package com.example.pattern.行为型模式.迭代子模式;

/**
 * @author liwen
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
