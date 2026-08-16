package com.operator;

import java.util.Scanner;

public class operator_demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();

        int num1 = num / 100;
        int num2 = (num % 100) / 10;
        int num3 = num % 10;

        System.out.println("百位数是：");
        System.out.println(num1);
        System.out.println("十位数是：");
        System.out.println(num2);
        System.out.println("个位数是：");
        System.out.println(num3);

    }
}
