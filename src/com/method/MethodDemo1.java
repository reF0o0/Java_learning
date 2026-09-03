package com.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
}

/*
 * 方法：程序中的独立功能，也是最小的执行单元
 * 使用场景：经常使用的代码打包，放在方法当中
 * 好处：提高了程序的复用性和可维护性
 * 方法的格式
 * public static 返回值类型 方法名（参数1，参数2•••）｛
 * 方法体；
 * return返回值；
 * }
 */