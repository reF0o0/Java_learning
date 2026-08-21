package com.random;

import java.util.Scanner;
import java.util.Random;

public class RandomDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("随机数在1～100之间");

        int num = r.nextInt(100) + 1;
        System.out.println("随机数是：" + num);

        while (true) {
            System.out.println("请输入数字：");
            int n = sc.nextInt();

            if (n == num) {
                System.out.println("恭喜猜中");
                break;
            } else if (n < num) {
                System.out.println("你猜的数字小了");
            } else {
                System.out.println("你猜的数字大了");
            }
        }
    }
}

////生成一个1~100之间的随机数，利用键盘录入模拟猜的动作，一直猜，直到猜中力止
