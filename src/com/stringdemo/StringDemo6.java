package com.stringdemo;

public class StringDemo6 {
    public static void main(String[] args) {
        char c = 'A';
        String s = "A";

        System.out.println((c + "").equals(s)); // char 转成 String
        System.out.println((s.charAt(0)) == c); // String 转成 char
    }
}

/*
 * char 与 String
 * 
 * char
 * 能用 ==
 * 几乎没有自带方法
 * 
 * String
 * 只能用 .equals()
 * 很多自带方法，如 length()、charAt()、equals()
 */