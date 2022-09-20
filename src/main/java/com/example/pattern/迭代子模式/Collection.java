package com.example.pattern.迭代子模式;

/**
 * @author liwen
 */
public interface Collection {
    /**
     * 迭代器
     * @return
     */
    Iterator iterator();

    /**
     * 取得集合元素
     * @param index
     * @return
     */
    Object get(int index);

    /**
     * 返回集合大小
     * @return
     */
    int size();
}
