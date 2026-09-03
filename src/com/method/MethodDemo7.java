package com.method;

import java.util.Scanner;

public class MethodDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[10];
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩");
            int num = sc.nextInt();

            while (num < 0 || num > 100) {
                System.out.println("成绩无效，请重新输入");
                num = sc.nextInt();
            }

            score[i] = num;
        }

        int passNum = getPass(score);
        System.out.println("及格率为：" + passNum / (double)score.length * 100 + "%");

        int sum = sum(score);
        System.out.println("平均分为：" + sum / (double)score.length);

        System.out.println("最高分为" + max(score));

        sc.close();
    }

    public static int getPass(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 60) {
                count++;
            }
        }
        return count;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}

/*
 * 班主任需要统计10名学生的数学成绩（0-100分），
 * 计算及格率，平均分，并找出最高分。
 * 要求1：键盘录入10名学生的成绩，存入数组。超出范围，提示“成绩无效，请重新输入”。
 * 要求2：定义方法，求及格人数，根据及格人数，求及格率。
 * 要求3：定义方法求总分，根据总分求平均分
 * 要求4：定义方法求最大值。
 */