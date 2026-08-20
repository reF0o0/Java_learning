package com.loopwhile;

public class WhileDemo4 {
    public static void main(String[] args) {
        double paper = 0.1;
        int time = 0;

        while (paper < 8848860) {
            time++;
            paper *= 2;
        }

        System.out.println(time);
    }
}

/*
 * 世界最高山峰珠穆朗玛峰高度是：8848.86米=8848860毫米，
 * 假如我有一张足够大的纸，它的厚度是0.1毫米。
 * 请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度？
 */