package com.method;

public class MethodDemo5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println(sum(a, b));
    }

    public static double sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, int b) {
        return a + b;
    }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}

/*
 * 方法重载
 * 同一个类中，定义了多个同名的方法，这些方法具有类似的功能
 * 每个方法具有不同的参数类型和参数个数，这些同名的方法，就构成了重载关系
 * 简单理解：同一个类，方法名相同，参数不同的方法，无需看返回值
 * 方法的重载，我们一般不会写成顺序不同的方式
 */