package com.nestedloop;

public class NestedLoopDemo5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int a = 3; a >= i; a--) {
                System.out.print(' ');
            }

            for (int c = 4; c < i; c++) {
                System.out.print(' ');
            }

            System.out.print('*');

            for (int b = 1; b < i && i <= 4; b++) {
                System.out.print("**");
            }

            for (int d = 7; d > i && i > 4; d--) {
                System.out.print("**");
            }

            System.out.println();
        }
    }
}

// 打印菱形