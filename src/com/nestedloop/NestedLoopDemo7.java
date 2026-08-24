package com.nestedloop;

public class NestedLoopDemo7 {
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b + "*" + a + "=" + (a * b) + "\t");
            }
            System.out.println();
        }
    }
}

// 打印九九乘法表
/*
 * \t 换行符
 */