package com.test;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 7, 8, 9 };
        System.out.println(Arrays.toString(test3(arr1, arr2)));
    }
    public static int[] test3(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int index1 = 0;
        int index2 = 0;
        int temp = 0;
        for (int i = 0; i < result.length; i++) {
            if (index1 < arr1.length && index2 < arr2.length && arr1[index1] <= arr2[index2]) {
                result[i] = arr1[index1];
                index1++;
            } else if (index1 < arr1.length && index2 < arr2.length && arr2[index2] < arr1[index1]) {
                result[i] = arr2[index2];
                index2++;
            } else {
                temp = i;
                break;
            }
        }
        
        if (index1 == arr1.length) {
            for (; temp < result.length; temp++) {
                result[temp] = arr2[index2];
                index2++;
            }
        } else {
            for (; temp < result.length; temp++) {
                result[temp] = arr1[index1];
                index1++;
            }
        }
        
        return result;
    }
}
