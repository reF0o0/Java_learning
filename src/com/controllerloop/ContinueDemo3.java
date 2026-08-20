package com.controllerloop;

import java.util.Scanner;

public class ContinueDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入正整数：");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 4 == 0) {
                continue;
            }

            int a = i;
            int b = 0;
            while (a > 0) {
                b = a % 10;
                a /= 10;
                if (b == 4) {
                    break;
                }
            }
            if (b == 4) {
                continue;
            }

            System.out.println(i);
        }

        sc.close();
    }
}

// 输出1到n之间所有既不包含数字4又不是4的倍数的整数，按升序输出
