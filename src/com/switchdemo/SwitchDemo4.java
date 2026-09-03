package com.switchdemo;

import java.util.Scanner;

public class SwitchDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入月份");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
        }

        switch (month) {
            case 1, 2, 12 -> {
                System.out.println("冬季");
            }
            case 3, 4, 5 -> {
                System.out.println("春季");
            }
            case 6, 7, 8 -> {
                System.out.println("夏季");
            }
            case 9, 10, 11 -> {
                System.out.println("秋季");
            }
        }

        int a = 10;
        int b = 20;

        System.out.println("请输入运算符：");
        String operator = sc.next();

        int result = switch (operator) {
            case "+" -> {
                yield a + b;
            }
            case "-" -> {
                yield a - b;
            }
            case "*" -> {
                yield a * b;
            }
            case "/" -> {
                yield a / b;
            }
            default -> {
                yield 0;
            }
        };

        System.out.println("结果是：" + result);

        sc.close();
    }
}

/*
 * 1.default的位置和省略
 * 位置：case和default是没有标准的上下之分，位置可以任意的书写
 * 为了观看比较方便，提高代码的阅读性
 * 一般来讲，case/小到大依次书写的，default是写在最下面的
 * 省略：default是可以省略不写的，在此时如果所有的case都不匹配，则没有任何的输出结果
 * 2.case穿透
 * 在我们写代码的时候，如果break没有写，此时就会触发case穿透现象
 * 执行流程；
 * 1．掌着小括号中表达式的值跟下面的case进行匹配
 * 2．如果匹配上了，就会执行case里面的语句体，遇到break结束整个的switch（正常情况）
 * 3.如果在执行语句体的时候没有看到break，那么程序会继续执行下一个case的语句体，直到遇到break或者运行完整个的switch为止
 * 应用场景：
 * 当多个case的语句体重复的时候，利用case穿透节省代码
 * 3．switch新特性：JDK12预览版JDK14正式版
 * 一、箭头标签
 * 二、case后面可以写多个值
 * 三、switch可以有运行结果
 * 四、yield关键字
 */