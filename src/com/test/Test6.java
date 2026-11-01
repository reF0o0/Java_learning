package com.test;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int[] user = new int[7];
        int[] nums = new int[7];

        input:
        for (int i = 0; i < user.length; i++) {
            if (i < 5) {
                do {
                    user[i] = sc.nextInt();
                    if (user[i] < 1 || user[i] > 35) {
                        System.out.println("输入错误，请重新输入1～35之间的整数");
                    }
                } while(user[i] < 1 || user[i] > 35);

                for (int j = 0; j < i; j++) {
                    if (user[j] == user[i]) {
                        System.out.println("输入重复，请重新输入");
                        i--;
                        continue input;
                    }
                }

                random1:
                while (true) {
                    nums[i] = r.nextInt(35) + 1;
                    for (int k = 0; k < i; k++) {
                        if (nums[k] == nums[i]) {
                            continue random1;
                        }
                    }
                    break;
                }
            } else {
                do {
                    user[i] = sc.nextInt();
                    if (user[i] < 1 || user[i] > 12) {
                        System.out.println("输入错误，请重新输入1～12之间的整数");
                    }
                } while(user[i] < 1 || user[i] > 12);

                for (int j = 5; j < i; j++) {
                    if (user[j] == user[i]) {
                        System.out.println("输入重复，请重新输入");
                        i--;
                        continue input;
                    }
                }

                random2:
                while (true) {
                    nums[i] = r.nextInt(12) + 1;
                    for (int l = 5; l < i; l++) {
                        if (nums[l] == nums[i]) {
                            continue random2;
                        }
                    }
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(user));
        System.out.println(Arrays.toString(nums));
        
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < user.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < 5 && j < 5 && user[i] == nums[j]) {
                    count1++;
                } else if (i > 4 && j > 4 && user[i] == nums[j]) {
                    count2++;
                }
            }
        }

        System.out.println("count1 = " + count1 + "count2 = " + count2);

        switch(count1 + count2) {
            case 7 -> {
                System.out.println("一等奖");
            }
            case 6 -> {
                if (count1 == 5) {
                    System.out.println("二等奖");
                } else {
                    System.out.println("三等奖");
                }
            }
            case 5 -> {
                if (count1 == 5) {
                    System.out.println("三等奖");
                } else {
                    System.out.println("四等奖");
                }
            }
            case 4 -> {
                System.out.println("五等奖");
            }
            case 3 -> {
                System.out.println("六等奖");
            }
            case 2 -> {
                if (count2 == 2) {
                    System.out.println("六等奖");
                } else {
                    System.out.println("未中奖");
                }
            }
            default -> {
                System.out.println("未中奖");
            }
        }

        sc.close();
    }
}
