package com.example.pattern.行为型模式.策略模式;

/**
 * 策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。因
 * 此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 *
 * @author liwen
 */
public class StrategyDemo {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int ans = cal.calculate(exp);
        System.out.println(ans);

        exp = "3-1";
        ICalculator cal2 = new Minus();
        int ans2 = cal2.calculate(exp);
        System.out.println(ans2);
    }
}
