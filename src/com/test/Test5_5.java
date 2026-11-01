package com.test;

public class Test5_5 {
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int[] height1 = { 0, 1, 0, 0, 2, 1 };
        int[] height2 = { 1, 0, 2, 0, 1 };
        int[] height3 = { 5, 0, 1, 0, 5 };
        System.out.println(test5(height));
        System.out.println(test5(height1));
        System.out.println(test5(height2));
        System.out.println(test5(height3));
    }
    public static int test5(int[] height) {
        int result = 0;

        for (int i = 1; i < height.length - 1; i++) {
            int max1 = height[0];
            int max2 = height[i + 1];
            for (int j = 0; j < i; j++) {
                if (height[j] > max1) {
                    max1 = height[j];
                }
            }
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > max2) {
                    max2 = height[j];
                }
            }

            if (max1 > height[i] && max2 > height[i]) {
                int min = max1 < max2? max1: max2;
                result += min - height[i];
            }
        }
        
        return result;
    }
}
