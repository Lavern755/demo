package com.example.pattern.行为型模式.模板方法模式;

/**
 * 模板方式模式的优势
 *
 * @author liwen
 */
public class ModelDemo {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator calculator = new Plus();
        int ans = calculator.calculate(exp, "\\+");
        System.out.println(ans);

        exp = "3-1";
        AbstractCalculator calculator2 = new Minus();
        int ans2 = calculator2.calculate(exp, "-");
        System.out.println(ans2);
    }
}
