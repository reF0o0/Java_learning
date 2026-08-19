package com.loopfor;

import java.util.Scanner;

public class ForDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("--------------------------------");

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("--------------------------------");

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("--------------------------------");

        sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("--------------------------------");

        System.out.println("请依次输入两个数表示范围(先小后大)：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 6 == 0 && i % 8 == 0) {
                sum++;
            }
        }
        System.out.println("在这个范围中既能被6整除，又能被8整除的数有：" + sum + "个");

        System.out.println("--------------------------------");

        int sum1 = 0;
        int sum2 = 1;
        int sum3 = 0;

        for (int i = 3; i <= 10; i++) {
            sum3 = sum1 + sum2;
            sum1 = sum2;
            sum2 = sum3;
        }
        System.out.println(sum3);

        System.out.println("--------------------------------");

        System.out.println("请输入正整数：");
        a = sc.nextInt();
        b = 0;

        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                b -= i;
            } else {
                b += i;
            }
        }
        System.out.println("结果：" + b);

        sc.close();
    }
}
