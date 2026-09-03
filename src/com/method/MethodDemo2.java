package com.method;

import java.util.Arrays;
import java.util.Random;

public class MethodDemo2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(randomArr()));
    }

    public static int[] randomArr() {
        Random r = new Random();

        int[] arr = new int[10];

        int i = 0;
        while (i <= 9) {
            int num = r.nextInt(100) + 1;

            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (num == arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                continue;
            }

            arr[i] = num;
            i++;
        }

        return arr;
    }
}

// 获取10个1-100之间的随机数并存入到数组当中，要求保证数据是唯一的