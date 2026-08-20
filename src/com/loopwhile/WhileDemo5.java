package com.loopwhile;

import java.util.Scanner;

public class WhileDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入整数：");
        int n = sc.nextInt();

        if (n < 0) {
            n *= -1;
        }
        
        int a = 0;
        while (n > 0) {
            a += n % 10;
            n /= 10;
        }
        System.out.println(a);

        sc.close();
    }
}

/*
 * 给定一个整数n，请计算其所有数位之和。若n为负数，请先取其绝对值
 */