package com.example.pattern.访问者模式;

/**
 * 访问者模式适
 * 用于数据结构相对稳定算法又易变化的系统。因为访问者模式使得算法操作增加变得容易。若系统数据
 * 结构对象易于变化，经常有新的数据对象增加进来，则不适合使用访问者模式。访问者模式的优点是增
 * 加操作很容易，因为增加操作意味着增加新的访问者。访问者模式将有关行为集中到一个访问者对象中，
 * 其改变不影响系统数据结构。其缺点就是增加新的数据结构很困难
 * @author liwen
 */
public class VisitorDemo {
    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject subject = new MySubject();
        subject.accept(visitor);
        visitor.visit(subject);

        /**
         * 原有逻辑不变，增加了访问者
         */
        Visitor visitor2 = new MyVisitor2();
        subject.accept(visitor2);
    }
}
