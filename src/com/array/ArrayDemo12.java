package com.array;

public class ArrayDemo12 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };  
        int target = 4;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= target) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(arr.length);
    }
}

/*
 * 给定一个递增的有序数组和一个目标值，在数组中找到目标值，打印其索引。
 * 如果目标值不存在于数组中，打印应插入的位置
 */