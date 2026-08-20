package com.loopdowhile;

public class DoWhileDemo1 {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("莉莉丝我爱你！");
            i++;
        } while (i <= 5);
    }
}

/*
 * 初始化语句；
 * do｛
 *     循环体语句；
 *     条件控制语句；
 * ｝while（条件判断语句）;
 * 先执行后判断，循环体至少执行一次
 */