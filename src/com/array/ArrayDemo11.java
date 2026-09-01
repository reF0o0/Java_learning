package com.array;

import java.util.Arrays;

public class ArrayDemo11 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7, 9, 10 };
        int[] arr2 = { 2, 4, 6, 8, 10 };

        int[] answer = new int[arr1.length + arr2.length];

        int a = 0;
        int b = 0;
        int count = 0;
        while (a < arr1.length && b < arr2.length) {
            if (arr1[a] < arr2[b]) {
                answer[count] = arr1[a];
                a++;
            } else {
                answer[count] = arr2[b];
                b++;
            }
            count++;
        }

        while (a < arr1.length) {
            answer[count] = arr1[a];
            a++;
            count++;
        }

        while (b < arr2.length) {
            answer[count] = arr2[b];
            b++;
            count++;
        }

        System.out.println(Arrays.toString(answer));
    }
}

/*
 * 给你两个有序数组arr1和arr2
 * 将两个数组中的数据合并到一个大数组中。
 * 要求：合并之后的大数组也是有序的
 */