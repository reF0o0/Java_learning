package com.array;

import java.util.Scanner;

public class ArrayDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 33, 5, 22, 44, 55, 33 };
        
        System.out.println("请输入数据：");
        int num = sc.nextInt();

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("该数据不存在");
        } else {
            System.out.println("索引是" + index);
        }

        sc.close();
    }
}

/*
 * 需求：已知数组元素为｛33,5,22,44,55,33｝ 键盘录入任意一个数据，查找这个数据在数组中是否存在
 * 如果数组中要查找的数据出现多次，只要显示第一次的索引即可
 * 输出要求：
 * 如果存在打印索引
 * 如果不存在，提示：“该数据不存在"
 */