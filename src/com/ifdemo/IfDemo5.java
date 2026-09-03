package com.ifdemo;

import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入商品价格：");
        double value = sc.nextDouble();

        double price = 0;

        if (value > 0 && value < 10) {
            System.out.println("8折优惠");
            price = value * 0.8;

        } else if (value >= 10 && value < 40) {
            System.out.println("优惠8元");
            price = value - 8;

        } else if (value >= 40 && value < 50) {
            System.out.println("8折优惠");
            price = value * 0.8;

        } else if (value >= 50 && value < 100) {
            System.out.println("优惠30元");
            price = value - 30;

        } else if (value >= 100 && value < 200) {
            System.out.println("优惠50元");
            price = value - 50;

        } else if (value >= 200 && value < 450) {
            System.out.println("优惠90元");
            price = value - 90;

        } else if (value >= 450) {
            System.out.println("8折优惠");
            price = value * 0.8;

        } else {
            System.out.println("输入错误");
        }
        System.out.println("最优惠价格：" + price);

        sc.close();
    }
}

/*
 * 现在有以下优惠券
 * 全场商品满10減8
 * 全场商品满50减30
 * 全场商品满100减50
 * 全场商品满200減90
 * 会员卡：全场8折
 * 默认有会员卡，会员卡和优惠券不能同时使用，最优惠的价格是多少
 */
