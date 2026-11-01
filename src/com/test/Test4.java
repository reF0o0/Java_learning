package com.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        Random r = new Random();

        int count = 0;
        int first = 0;
        int secont = 0;
        int third = 0;
        int forth = 0;
        int fifth = 0;
        while (count < 1000) {
            int n = r.nextInt(6);
            switch(n) {
                case 1 -> first++;
                case 2 -> secont++;
                case 3 -> third++;
                case 4 -> forth++;
                case 5 -> fifth++;
                default -> { }
            }
            count++;
        }
        
        int[] nums = { first, secont, third, forth, fifth };
        int max = first;
        int index = 1;
        for (int i = 1; i <= 4; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                index = i + 1;
            }
        }

        System.out.println("票数最多的是" + index + "号候选人，有" + max + "票");
        System.out.println("弃票人数为：" + (count - first - secont - third - forth - fifth) + "人， 弃票率是：" + ((1 - (first + secont + third + forth + fifth) / (double)count) * 100) + "%");
    }
}
