package com.array;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int [5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + i + "个数");
            int num = sc.nextInt();
            arr[i] = num;
        }

        System.out.println("你输入的5个数是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}

/*
 * 数组的动态初始化
 * 动态：在定义变量、数组、对象的时候，数据是不确定的
 * 初始化：创建数组的时候，直接给数组赋值
 * 初始化：定义＋赋值同时执行
 * 数据类型 默认值
 * 整型 0
 * 浮点数 0.0
 * 字符 \u0000
 * 布尔 false
 * 引用 null
 * 完整格式:数据类型 数组名［］=new 数据类型［长度］；
 */