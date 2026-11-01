package com.test;

public class Test5_6 {
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

        int max1 = height[0];
        for (int i = 1; i < height.length - 1; i++) {
            if (height[i] >= max1) {
                max1 = height[i];
                continue;
            }
            
        }
        
        return result;
    }
}
