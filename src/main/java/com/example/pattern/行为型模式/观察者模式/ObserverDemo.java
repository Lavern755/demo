package com.example.pattern.行为型模式.观察者模式;

/**
 * 观察者模式很好理解，类似于邮件订阅和 RSS 订阅，当我们浏览一
 * 些博客或 wiki 时，经常会看到 RSS 图标，就这的意思是，当你订阅了该文章，如果后续有更新，会及
 * 时通知你。其实，简单来讲就一句话：当一个对象变化时，其它依赖该对象的对象都会收到通知，并且
 * 随着变化！对象之间是一种一对多的关系。
 *
 * @author liwen
 */
public class ObserverDemo {
    public static void main(String[] args) {
        // 主题
        Subject subject = new MySubject();
        // 添加订阅Observer1
        subject.add(new Observer1());
        // 添加订阅Observer1
        subject.add(new Observer2());

        // 主题有更新
        subject.operation();
    }
}
