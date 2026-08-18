package com.ifdemo;

import java.util.Scanner;

public class IfDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("充值金额：");
        double money = sc.nextDouble();

        double extra = 0;

        if (money <= 0) {
            System.out.println("输入金额错误");
        } else {
            if (money >= 50000) {
                extra = 15000;
            } else if (money >= 20000) {
                extra = 6000;
            } else if (money >= 10000) {
                extra = 2500;
            } else if (money >= 5000) {
                extra = 1300;
            } else if (money >= 3000) {
                extra = 700;
            } else if (money >= 2000) {
                extra = 500;
            } else if (money >= 1000) {
                extra = 200;
            }
        }

        double count = money + extra;

        System.out.println("赠送金额：" + extra + "，剩余余额：" + count);
    }
}

/*
 * 充值金额 赠送金额
 * 1000元 200元
 * 2000元 500元
 * 3000元 700元
 * 5000元 1300元
 * 10000元 2500元
 * 20000元 6000元
 * 50000元 15000元
 */