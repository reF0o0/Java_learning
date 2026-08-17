package com.operator;

import java.util.Scanner;

public class operator_demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入两个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a >= b ? a : b;
        System.out.println("较大的数是：");
        System.out.println(result);
    }
}

/*
 * 三元运算符
 * 格式：关系表达式? 表达式1: 表达式2;
 * 计算规则：
 * 1 先计算关系表达式的值
 * 2 true：运行表达式1 false：运行表达式2
 */