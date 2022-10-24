package com.example.pattern.行为型模式.迭代子模式;

/**
 * @author liwen
 */
public class MyCollection implements Collection{
    public String[] arr = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int index) {
        return arr[index];
    }

    @Override
    public int size() {
        return arr.length;
    }
}
