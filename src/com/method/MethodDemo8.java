package com.method;

import java.util.Scanner;

public class MethodDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入快递重量：");
        double weight = sc.nextDouble();

        while (weight <= 0) {
            System.out.println("输入错误，请重新输入");
            weight = sc.nextDouble();
        }

        if (weight <= 1) {
            System.out.println(10.0 + "元");
        } else if (weight > 1 && weight <= 5) {
            System.out.println(over1(weight) + "元");
        } else {
            System.out.println(over5(weight) + "元");
        }

        sc.close();
    }

    public static double over1(double a) {
        double b = a > (int) a ? (int) a + 1 : (int) a;
        return (b - 1) * 2 + 10;
    }

    public static double over5(double a) {
        double b = a > (int) a ? (int) a + 1 : (int) a;
        return (b - 5) * 1.5 + 18;
    }
}

/*
 * 某快递公司的运费规则如下（首重1kg，超出部分按kg计算，不足1kg按1kg算）：
 * 首重1kg:10元；
 * 超出1-5kg：每kg加2元；
 * 超出5kg以上：每kg加1.5元。
 * 键盘录入小数，表示用户快递的重量，计算最终的结果
 * 要求1：快递重量必须大于0，否则重新输入
 * 要求2：不同价位的计算，单独定义一个方法
 */