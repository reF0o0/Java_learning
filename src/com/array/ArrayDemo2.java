package com.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int num = arr[0];
        System.out.println(num);

        arr[0] = 10;
        num = arr[0];
        System.out.println(num);
    }
}

/*
 * 索引
 * 索引就是数组的一个编号，也叫作：角标、下标、编号
 * 特点：从0开始的，连续+1，不间断
 */