package com.test;

public class Test5_1 {
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(test5(height));
    }
    public static int test5(int[] height) {
        int result = 0;
        int[] low = new int[2];
        int[] heigh = new int[2];
        int indexLow = 0;
        int indexHeigh = 0;
        boolean first = true;
        boolean rise = false;
        boolean over = false;

        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[i - 1]) {
                rise = true;
            } else {
                if (indexLow == 0 && !first) {
                    indexLow++;
                }
                low[indexLow] = height[i];
                rise = false;
            }

            if (!rise) {
                heigh[indexHeigh] = height[i - 1];
                if (indexHeigh == 1) {
                    over = true;
                    first = false;
                }
                if (indexHeigh == 0) {
                    indexHeigh++;
                }
            }

            if (over) {
                int max = heigh[0] > heigh[1]? heigh[1]: heigh[0];
                result += max - low[0];
                low[0] = low[1];
                heigh[0] = heigh[1];
                over = false;
            }
        }
        
        return result;
    }
}
