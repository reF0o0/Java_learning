package com.test;

import java.util.Arrays;

public class Test5_4 {
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int[] height1 = { 0, 1, 0, 0, 2, 1 };
        int[] height2 = { 1, 0, 2, 0, 1 };
        System.out.println(test5(height));
        System.out.println(test5(height1));
        System.out.println(test5(height2));
    }
    public static int test5(int[] height) {
        int result = 0;

        boolean rise = false;
        int indexHigh = 0;
        int[] high = new int[height.length];
        int[] index = new int[height.length];
        for (int i = 1; i < height.length - 1; i++) {
            if (height[i] > height[i - 1]) {
                rise = true;
            } else {
                rise = false;
            }

            if (!rise && i == 1) {
                high[indexHigh] = height[i - 1];
                index[indexHigh] = i - 1;
                indexHigh++;
            }

            if (rise && height[i] > height[i + 1]) {
                high[indexHigh] = height[i];
                index[indexHigh] = i;
                indexHigh++;
            }

            if (i == height.length - 2) {
                if (height[i] < height[i + 1]) {
                    high[indexHigh] = height[i + 1];
                    index[indexHigh] = i + 1;
                    indexHigh++;
                }
            }
        }
        System.out.println(Arrays.toString(high));
        System.out.println(Arrays.toString(index));

        int indexSkip = 0;
        int indexPlus = 0;
        for (int i = 0; i < height.length - 1; i++) {
            if (i == 0 && height[i] < height[i + 1]) {
                continue;
            }

            if (i == index[indexSkip]) {
                if (i > 1) {
                    indexPlus++;
                }
                indexSkip++;
                continue;
            }
            
            int min = high[indexPlus] > high[indexPlus + 1]? high[indexPlus + 1]: high[indexPlus];
            if (height[i] < min) {
                result += min - height[i];
            }

            System.out.println("i = " + i);
            System.out.println("min = " + min);
            System.out.println("indexSkip = " + indexSkip);
            System.out.println("indexPlus = " + indexPlus);
            System.out.println("result = " + result);
        }

        return result;
    }
}
