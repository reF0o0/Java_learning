package com.data_type;

public class data_type_demo1 {
    public static void main(String[] args) {
        //long类型数据必须以 L 结尾(大小写均可)
        long a = 1000000000000L;
        System.out.println(a);

        //float类型数据必须以 F 结尾(大小写均可)
        float b = 13.14F;
        System.out.println(b);
        
        //char类型数据必须用单引号
        char c = '胡';
        System.out.println(c);

        //String类型数据必须用双引号
        String d = "胡桃";
        System.out.println(d);
    }
}

//基本数据类型：
/*
 * 整数         取值范围                                              内存
 * byte         -128~127                                            1
 * short        -32768~32767                                        2
 * int(默认)     -2147483648~2147483647（10位数）                     4
 * long         -9223372036854775808~9223372036854775807（19位数）   8
 */

/*
 * 小数             取值范围                           内存
 * float            -3.402*10^38~3.402*10^38         4
 * double(默认)     -1.797*10^308~1.797*10^308        8
 */

/*
 * 字符     内存
 * char    两个字节
 */

/*
 * 布尔         内存
 * boolean     一个字节
 */

/*
 * 字符串
 * String
 */
