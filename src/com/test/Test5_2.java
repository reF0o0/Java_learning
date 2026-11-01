package com.test;

public class Test5_2 {
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(test5(height));
    }
    public static int test5(int[] height) {
        int result = 0;
        int indexHeigh = 0;
        int indexLow = 0;
        int[] heigh = new int[height.length];
        int[] low = new int[height.length];
        
        boolean rise = false;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[i - 1]) {
                rise = true;
            }

            if (rise) {
                low[indexLow] = height[i - 1];
                if (i < height.length - 1 && height[i] < height[i + 1]) {
                    indexLow++;
                }
            } else {
                heigh[indexHeigh] = height[i - 1];
                if (i < height.length - 1 && height[i] > height[i + 1]) {
                    indexHeigh++;
                }
            }
        }

        if (indexHeigh == indexLow) {
            for (int i = 0; i <= indexLow; i++) {
                result += Math.abs(heigh[i] - low[i]);
            }
        } else {
            int min = indexLow < indexHeigh? indexLow: indexHeigh;
            if (min == indexHeigh) {
                for (int i = 0; i <= min; i++) {
                    result += min;
                }
            } else {
                for (int i = 1; i <= min; i++) {

                }
            }
        }
        
        return result;
    }
}
