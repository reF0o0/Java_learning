package com.stringdemo;

public class StringDemo5 {
    public static void main(String[] args) {
        String s = "abcdef";

        System.out.println(s.substring(1, 4)); // 从下标 1 到 4（不含 4）
        System.out.println(s.replace('a', 'A'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim()); // 去掉首尾空格
    }
}

/*
 * 字符串截取和替换
 */