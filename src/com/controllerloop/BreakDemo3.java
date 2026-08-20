package com.controllerloop;

import java.util.Scanner;

public class BreakDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("请输入大于1的自然数：");
            num = sc.nextInt();

            if (num <= 1) {
                System.out.println("输入错误，请重新输入");
            } else {
                sum = 0;
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        sum++;
                    }
                }
                if (sum == 2) {
                    System.out.println("你输入的数是质数");
                } else {
                    System.out.println("你输入的数不是质数");
                }
                break;
            }
        }

        sc.close();
    }
}

// 键盘录入一个大于等于2的整数，判断是否为质数