package com.operator;

import java.util.Scanner;


public class OperatorDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数字：");
        int num = sc.nextInt();

        boolean result = num >= 1 & num <= 10;

        System.out.println("是否在1～10之间：");
        System.out.println(result);

        sc.close();
    }
}

/*
 * 逻辑运算符
 * & 与(而且) 同时成立
 * | 或(或者) 只有一个符合要求即可
 * ! 非(取反) 取反
 */