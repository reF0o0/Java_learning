package com.operator;

import java.util.Scanner;

public class OperatorDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();

        int num1 = num / 100;
        int num2 = (num % 100) / 10;
        int num3 = num % 10;

        boolean result = (num1 + num2 + num3) % 3 == 0;

        System.out.println("是否能被3整除：");
        System.out.println(result);

        sc.close();
    }
}

/*
 * 关系运算符
 * ==
 * !=
 * >
 * >=
 * <
 * <=
 */