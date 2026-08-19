package com.switchdemo;

public class SwitchDemo3 {
    public static void main(String[] args) {
        int num = 10;

        switch (num) {
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;

            default:
                System.out.println("没有这个数字");
                break;
        }
    }
}

/*
 * switch的注意点：
 * 1.表达式：结果（字符/整数byte short int/枚举/字符串）---跳转表，索引不支持小数，也不支持大的整数long
 * 2.case：被匹配的值，只能是真实的数据---不能写变量的
 * 3.case：值不允许重复
 * 4.break：表示中断，结束的意思，结束switch语句---break关键字，作用结束switch语句
 * 5.default：所有情况都不匹配，执行该处的内容---if里面的else是非常类似的
 */