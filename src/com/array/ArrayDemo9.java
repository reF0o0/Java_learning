package com.array;

public class ArrayDemo9 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 7, 7 };
        int slow = 0;

        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }

        int count = slow + 1;
        int[] answer = new int[count];

        for (int i = 0; i < count; i++) {
            answer[i] = arr[i];
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}

/*
 * 给定义一个递增有序数组，去除其中重复元素
 * 慢指针：存入的位置
 * 快指针：找不重复的数据
 */