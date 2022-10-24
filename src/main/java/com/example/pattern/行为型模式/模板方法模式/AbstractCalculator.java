package com.example.pattern.行为型模式.模板方法模式;

/**
 * @author liwen
 */
public abstract class AbstractCalculator {
    /**
     * 主方法，final修饰不能被子重写
     *   定义了计算的主体逻辑或者框架
     *
     * @return
     */
    public final int calculate(String exp, String opt) {
        int[] arr = split(exp, opt);
        // 部分计算逻辑放到子类中实现（延后实现）
        return calculate(arr[0], arr[1]);
    }

    /**
     * 被子类重写的方法：计算变量1和变量2的结果
     *
     * @param num1 变量1
     * @param num2 变量2
     * @return
     */
    public abstract int calculate(int num1, int num2);

    int[] split(String exp, String opt) {
        String[] arr = exp.split(opt);
        int[] arrInt = new int[2];
        arrInt[0] = Integer.parseInt(arr[0]);
        arrInt[1] = Integer.parseInt(arr[1]);
        return arrInt;
    }

}
