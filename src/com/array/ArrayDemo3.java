package com.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        for (int i  = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr.length);

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

/*
 * 数组的遍历
 * 定义一个整数数组，里面存储任意数据，并将数组遍历并打印。
 */
