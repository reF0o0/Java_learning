package com.stringdemo;

public class StringDemo7 {
    public static void main(String[] args) {
        System.out.println('A' + 1);
        System.out.println((char) ('A' + 1));

        // 把数字字符转成整数
        char c1 = '7';
        int num1 = c1 - '0';
        System.out.println(num1);

        // 把 0~9 转成字符
        int num2 = 5;
        char c2 = (char) ('0' + num2);
        System.out.println(c2);
    }
}

/*
char 在 Java 内部本质是个整数（存的是字符编码，比如 'A' 是 65），所以做算术时会先变成 int 再相加，结果也是 int
只要有一边是 String，+ 就变成字符串拼接，char 会被转成字符串
*/