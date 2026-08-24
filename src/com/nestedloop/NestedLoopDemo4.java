package com.nestedloop;

public class NestedLoopDemo4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int a = 3; a > i; a--) {
                System.out.print(' ');
            }
            System.out.print("***");
            for (int b = 1; b < i; b++) {
                System.out.print("**");
            }
            System.out.println();
        }
    }
}

//打印梯形