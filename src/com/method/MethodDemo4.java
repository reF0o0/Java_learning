package com.method;

public class MethodDemo4 {
    public static void main(String[] args) {
        System.out.println(multiplicationTable());
    }

    public static String multiplicationTable() {
        String result = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                result += j + "*" + i + "=" + i * j + "\t";
            }
            result += "\n";
        }

        return result;
    }
}

// 打印九九乘法表