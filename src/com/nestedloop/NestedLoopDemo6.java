package com.nestedloop;

public class NestedLoopDemo6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int a = 3; a > i && i < 3; a--) {
                System.out.print(' ');
            }

            for (int c = 3; c < i; c++){
                System.out.print(' ');
            }

            System.out.print('*');

            for (int b = 1; b < i && i <= 3; b++) {
                System.out.print(' ');
            }

            for (int d = 5; d > i && i > 3; d--) {
                System.out.print(' ');
            }

            if (i == 3) {
                System.out.print(' ');
            }

            if (i > 1 && i < 5) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}

//打印空心菱形