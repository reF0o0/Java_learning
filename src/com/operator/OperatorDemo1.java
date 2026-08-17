package com.operator;

public class operator_demo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        // 整数相除结果为整数，不考虑余数
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("----------------------");

        double c = 1.1;
        double d = 1.01;

        // 小数直接参与计算，结果可能不精确

        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c % d);
    }
}

/*
 * 运算符
 * + 加
 * - 减
 * * 乘
 * / 除
 * % 取余
 */