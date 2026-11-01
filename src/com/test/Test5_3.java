package com.test;

import java.util.Arrays;

public class Test5_3 {
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(test5(height));
    }
    public static int test5(int[] height) {
        int result = 0;

        int indexHigh = 0;
        int indexLow = 0;
        int[] high = new int[height.length];
        int[] low = new int[height.length];

        boolean rise = true;
        for (int i = 1; i < height.length - 1; i++) {
            if (height[i] > height[i - 1]) {
                rise = true;
            } else {
                rise = false;
            }

            if (!rise && height[i] <= height[i + 1]) {
                low[indexLow] = height[i];
                indexLow++;
            }
            if (rise && height[i] > height[i + 1]) {
                high[indexHigh] = height[i];
                indexHigh++;
            }

            if (i == height.length - 1) {
                if (height[i] > height[i - 1]) {
                    high[indexHigh] = height[i];
                    indexHigh++;
                }
            }
        }

        System.out.println(Arrays.toString(high));
        System.out.println(Arrays.toString(low));
        System.out.println(indexHigh);
        System.out.println(indexLow);
        
        for (int i = 0; i <= indexLow - 1; i++) {
            int min = high[i] > high[i + 1]? high[i + 1]: high[i];
            result += min - low[i];
        }

        return result;
    }
}
