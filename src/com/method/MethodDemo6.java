package com.method;

import java.util.Scanner;

public class MethodDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数：");
            int num = sc.nextInt();

            while (num < 0 || num > 100) {
                System.out.println("请重新输入");
                num = sc.nextInt();
            }

            score[i] = num;
        }

        int max = max(score);
        int min = min(score);
        int sum = sum(score);

        System.out.println("选手的平均分是：" + (sum - max - min) / 3.0);

        sc.close();
    }

    public static int max(int[] arr) {
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (num < arr[i]) {
                num = arr[i];
            }
        }
        return num;
    }

    public static int min(int[] arr) {
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (num > arr[i]) {
                num = arr[i];
            }
        }
        return num;
    }

    public static int sum(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
        }
        return num;
    }
}

/*
 * 跳水比赛有五个评委打分，分数在0~100之间。最终得分会去掉一个最高分，去掉一个最低分，
 * 剩余的分数再求平均数，改平均数为选手最终得分。
 * 要求1：利用键盘录入5个整数存入数组当中，如果分数超出范围需要重新录入
 * 要求2：定义方法分别求数组的最大值和最小值
 * 要求3：计算五名评委的总分
 * 要求4：总分—最大值-最小值，求选手最终平均分
 */