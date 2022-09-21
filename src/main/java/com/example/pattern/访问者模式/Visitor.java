package com.example.pattern.访问者模式;

/**
 * @author liwen
 */
public interface Visitor {
    /**
     * 访问主题
     * @param sub
     */
    void visit(Subject sub);
}
