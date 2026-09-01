package com.array;

import java.util.Random;

public class ArrayDemo8 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            while (true) {
                int num = r.nextInt(100) + 1;
                boolean exists = false;

                for (int j = 0; j < i; j++) {
                    if (arr[j] == num) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    arr[i] = num;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

/*
 * 需求：获取10个1~100之间的随机数并存入到数组当中，要求保证数据是唯一的
 */