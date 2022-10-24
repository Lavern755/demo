package com.example.pattern.行为型模式.迭代子模式;

/**
 * @author liwen
 */
public interface Iterator {
    /**
     * 前移
     * @return
     */
    Object previous();

    /**
     * 后移
     * @return
     */
    Object next();

    /**
     * 是否还有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 获取第一个元素
     * @return
     */
    Object first();
}
