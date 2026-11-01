package com.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 4, 4, 5 };
        int num = 4;
        System.out.println(Arrays.toString(test1(nums, num)));
    }
    public static int[] test1(int[] arrs, int a ) {
        int count = 0;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] != a) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] != a) {
                result[index] = arrs[i];
                index++;
            }
        }

        return result;
    }
}
