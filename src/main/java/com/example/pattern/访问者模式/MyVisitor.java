package com.example.pattern.访问者模式;

/**
 * @author liwen
 */
public class MyVisitor implements Visitor{
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject: " + sub.getSubject());
    }
}
