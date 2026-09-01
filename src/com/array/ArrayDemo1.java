package com.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] ageArr2 = new int[] { 13, 14, 15 };
        int[] ageArr1 = { 13, 14, 15 };

        double[] heightArr2 = new double[] { 1.5, 1.53, 1.57 };
        double[] heightArr1 = { 1.5, 1.53, 1.57 };

        String[] nameArr2 = new String[] { "萝莉1", "萝莉2", "萝莉3" };
        String[] nameArr1 = { "萝莉1", "萝莉2", "萝莉3" };
    }
}

/*
 * 数组的静态初始化
 * 初始化：是指在定义变量、数组、对象的时候进行赋值
 * 静态：在定义变量、数组、对象的时候，数据是静止、确定的
 * 静态初始化：创建数组的时候，直接给数组赋值
 * 
 * 完整格式：数据类型 数组名［］= new 数据类型［］｛数据值，数据值•••};
 * 数据类型[] 数组名 = new 数据类型[]｛数据值，数据值•••};
 * 简写格式：数据类型 数组名［］=｛数据值，数据值•••};
 * 数据类型[] 数组名 =｛数据值，数据值•••};
 * 
 * 特点1：连续的空间
 * 特点2：一旦定义，长度不可变
 */
