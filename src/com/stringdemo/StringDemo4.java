package com.stringdemo;

public class StringDemo4 {
    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println(s.contains("World"));
        System.out.println(s.indexOf("o")); // 第一次出现的位置；没找到返回 -1
        System.out.println(s.startsWith("H"));
        System.out.println(s.endsWith("d"));
    }
}

/*
 * 字符串判断包含和找位置
 */