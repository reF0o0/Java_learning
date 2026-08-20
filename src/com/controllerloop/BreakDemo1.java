package com.controllerloop;

public class BreakDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 50) {
                break;
            }
        }
    }
}

/*
 * break关键字：
 * 不能单独出现的，只能写在switch或者循环当中，表示结束、跳出的意思
 */