package com.ifdemo;

import java.util.Scanner;

public class IfDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生成绩：");
        double score = sc.nextDouble();

        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        } else {
            System.out.println("成绩不合理");
        }

        sc.close();
    }
}
