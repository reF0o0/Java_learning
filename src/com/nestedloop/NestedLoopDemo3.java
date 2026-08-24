package com.nestedloop;

public class NestedLoopDemo3 {
    public static void main(String[] args) {
        for (int i = 3; i >= 1; i--) {
            for (int a = 2; a <= i; a++) {
                System.out.print(' ');
            }
            System.out.println("******");
        }
    }
}

//打印平行四边形