package com.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "Hello";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }

        for (char c : s.toCharArray()) {
            System.out.println(c);
        }
    }
}

/*
 * 遍历字符串
 * for (char c : s.toCharArray()) {
 * 
 * }
 * 
 * String s = "abc";
 * s.toCharArray(); 把 "abc" 变成 char 数组 {'a', 'b', 'c'}
 */