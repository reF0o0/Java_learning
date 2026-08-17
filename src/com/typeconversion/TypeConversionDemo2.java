package com.typeconversion;

public class TypeConversionDemo2 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 200;
        double d = 20.3;

        double result1 = b + s + d;

        /*
         * 1.b + s
         * 把byte类型的100和short类型的200提升为int
         * 结果：300(int)
         * 
         * 2.结果(int) + d
         * 把int类型的300提升为double类型的300.0
         * 结果：320.3(double)
         */

        System.out.println(result1);

        short s1 = 100;
        short s2 = 200;
        //结果(int)：二进制 00000000/00000000/00000001/00101100 (300)
        byte result2 = (byte) (s1 + s2);
        //强制转换byte：二进制 00101100 (44)
        System.out.println(result2);
    }
}
