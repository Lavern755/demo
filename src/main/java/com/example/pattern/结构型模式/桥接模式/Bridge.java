package com.example.pattern.结构型模式.桥接模式;

/**
 * @author liwen
 */
public abstract class Bridge {
    private Sourceable source;

    public void method() {
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
