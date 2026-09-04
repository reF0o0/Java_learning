package com.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = "Java";
        String b = new String("Java"); // 用 new 新造一个 String 对象
        String c = sc.next();

        System.out.println(a == b); // 比较的是地址
        System.out.println(a.equals(b)); // 比较的是内容
        System.out.println(c.equals("java"));

        sc.close();
    }
}

/*
 * 判断字符串内容相等必须用 equals，不能用 ==
 */