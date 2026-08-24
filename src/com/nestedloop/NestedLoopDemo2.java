package com.nestedloop;

public class NestedLoopDemo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("------------------");

        for (int i = 5; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

// 打印正三角形和倒三角形