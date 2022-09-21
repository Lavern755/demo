package com.example.pattern.备忘录模式;

/**
 * @author liwen
 */
public class Original {
    /**
     * 状态信息
     */
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Original(String value) {
        this.value = value;
    }

    /**
     * 创建备忘录
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(value);
    }

    public void restoreMemento(Memento memento) {
        this.value = memento.getValue();
    }
}
