package com.example.exam;

/**
 * @author liwen
 */
public class LC1491 {
    public double average(int[] salary) {
        double sum = 0;
        int max = salary[0];
        int min = salary[0];
        for (int i = 1; i < salary.length; i++) {
            int cur = salary[i];
            if (cur > max) {
                max = cur;
            }

            if (cur < min) {
                min = cur;
            }
            sum += cur;
        }

        return ((sum + salary[0] - max - min) / (salary.length - 2));
    }

    public static void main(String[] args) {
        LC1491 lc1491 = new LC1491();
        int[] salary = {48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000};
        // 41111.11111
        System.out.println(lc1491.average(salary));
    }
}
