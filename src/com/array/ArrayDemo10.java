package com.array;

import java.util.Arrays;

public class ArrayDemo10 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 6;

        int slow = 0;

        while (true) {
            int fast = slow + 1;

            if (slow == nums.length - 1) {
                break;
            }

            for (; fast < nums.length; fast++) {
                if (nums[slow] + nums[fast] == target) {
                    break;
                }
            }

            if (fast < nums.length && nums[slow] + nums[fast] == target) {
                int[] answer = { slow, fast };
                System.out.println(Arrays.toString(answer));
            }

            slow++;
        }
    }
}

/*
 * 给定一个整数数组nums和一个整数目标值target，请你在该数组中找出和为目标值target的
 * 那两个整数，并输出它们的数组索引。
 * 要求1：只要输出第一对满足要求的情况
 * 要求2：输出所有满足要求的情况
 */