package com.ifdemo;

import java.util.Scanner;

public class IfDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入商品价格：");
        double price = sc.nextDouble();

        double discont = 0;

        if (price <= 0) {
            System.out.println("商品价格错误");
        } else {
            if (price >= 200) {
                discont = 90;
            } else if (price >= 100) {
                discont = 50;
            } else if (price >= 50) {
                discont = 30;
            } else if (price >= 10) {
                discont = 8;
            }
        }

        double memberDiscont = price * 0.2;

        if (memberDiscont >= discont) {
            System.out.println("使用会员卡更优惠，优惠" + memberDiscont + '元');
        } else {
            System.out.println("使用优惠卷更优惠，优惠" + discont + '元');
        }
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