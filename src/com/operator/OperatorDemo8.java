package com.operator;

import java.util.Scanner;

public class OperatorDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个四位整数：");
        int num = sc.nextInt();

        int num1 = num / 1000;
        int num2 = num % 1000 / 100;
        int num3 = num % 1000 % 100 / 10;
        int num4 = num % 10;

        boolean result = num1 == num4 && num2 == num3;
        System.out.println("是否为回文数：");
        System.out.println(result);

        System.out.println("--------------------------");

        System.out.println("请输入一个两位数：");
        int num_ = sc.nextInt();

        int num_1 = num_ / 10;
        int num_2 = num_ % 10;

        boolean result_ = num_ % 7 == 0 || num_1 == 7 || num_2 == 7;
        System.out.println("是否是7的有缘数：");
        System.out.println(result_);

        sc.close();
    }
}

/*
 * 短路逻辑运算符
 * && 短路与 左边为false，右边不执行
 * || 短路或 左边为true，右边不执行
 * 运行规则：和单个的&、|是一样的，只不过提高了效率
 */