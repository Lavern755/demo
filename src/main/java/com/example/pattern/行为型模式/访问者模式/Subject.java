package com.example.pattern.行为型模式.访问者模式;

/**
 * @author liwen
 */
public interface Subject {
    /**
     * 接受访问者
     * @param visitor
     */
    void accept(Visitor visitor);

    /**
     * 获取主题
     * @return
     */
    String getSubject();
}
