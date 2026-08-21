package com.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo3 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("猜一个在1～100之间的随机数");
        
        int num = r.nextInt(100) + 1;
        System.out.println("随机数是：" + num);

        int count = 0;
        while (true) {
            System.out.println("请输入数字：");
            int numGuess = sc.nextInt();

            count++;

            if(count / 10 == 1) {
                System.out.println("恭喜你猜中了");
                break;
            }

            if(numGuess < num) {
                System.out.println("你猜的数字小了");
            } else if(numGuess > num) {
                System.out.println("你猜的数字大了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }

            if(count % 3 == 0) {
                System.out.println("随机数在" + (num - 5) + '~' + (num + 5) + "之间");
            }
        }
    }
}

/*
 * 生成一个1~100之间的随机数，利用键盘录入模拟猜的动作，一直猜，直到猜中为止
 * 猜数字的时候，有保底机制
 * 小保底：只要三次没有猜中，提示用户猜测的范围5
 * 大保底：只要10次没有猜中，提示用户猜中了
 */