package com.test;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int m = 100, n = 10;
        System.out.println(Arrays.toString(test2(m, n)));
    }
    public static int[] test2(int m, int n) {
        Random r = new Random();

        int[] result = new int[n];
        int max = m;
        for (int i = 0; i < n - 1; i++) {
            int a = r.nextInt(max - n + i + 1) + 1;
            max -= a;
            result[i] = a;
        }
        result[n - 1] = max;

        return result;
    }
}
