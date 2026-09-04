package com.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = "Hello World";

        int len = s.length();
        System.out.println(len);

        char c = s.charAt(0);
        System.out.println(c);

        char last = s.charAt(len - 1);
        System.out.println(last);
    }
}

/*
 * char 单字符
 * 
 * .length()
 * .charAt(index)
 */