package com.ifdemo;

public class IfDemo3 {
    public static void main(String[] args) {
        int a = 10;

        if (a == 10)
            System.out.println(a);

        boolean b = true;

        if (b)
            System.out.println(b);
    }
}

/*
 * if的细节：
 * 1.If语句大括号的位置
 * 左括号写在上一行的末尾，不要单独写一行
 * K&风格《紧凑风）：左括号在上一行的末尾
 * A1Iman风格（折叠风）：左括号另起一行
 * 
 * K&R风格：
 * 创造c语言的两位大神
 * 布莱恩-克尼汉BrianKernighan
 * 丹尼斯・里奇DennisRitchie
 * 《TheCProgrammingLanguage》书里面两种风格都用到了
 * 仿照大神的风格，从两个名字各取一个字母，左括号在上一行的末尾-->K&R风格
 * Java Go
 * Java:Oracle官方 示例谷歌编码规范Spring框架-->K&R风格
 * 
 * A1lman风格：
 * BSDUNIX操作系统的主要开发者艾瑞克•奧尔曼（Eric•A1lman）
 * C#-->A11man风格
 * 
 * 2.If语句大括号的省略
 * 如果大括号中语句体只有一行，大括号可以省略
 * 
 * 3.小括号后面不能有分号
 * 小括号后面不能有分号，这样会拆开if的语句结构
 * 
 * 4.判断布尔类型的变量
 * 判断布尔类型的变量，直接把变量写在小括号中即可
 */