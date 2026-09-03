package com.method;

public class MethodDemo3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(arrPrint(arr));
    }

    public static String arrPrint(int[] arr) {
        String result = "[";

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) {
                result += ",";
            }
        }

        return result += "]";
    }
}

/*
 * 定义一个方法遍历数组
 * 遍历格式如下：
 * ［1,2,3,4,5］
 */