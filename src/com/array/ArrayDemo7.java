package com.array;

import java.util.Random;

public class ArrayDemo7 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

/*
 * 已知数组元素为｛1,2,3,4,5,6,7,8,9,10｝
 * 要求：打乱数组中的数据
 */