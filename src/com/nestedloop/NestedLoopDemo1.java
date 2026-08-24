package com.nestedloop;

public class NestedLoopDemo1 {
    public static void main(String[] args) {
        for (int b = 1; b <= 4; b++) {
            for (int a = 1; a <= 5; a++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

// 打印4行5列的*
