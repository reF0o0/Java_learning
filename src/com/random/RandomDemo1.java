package com.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random r = new Random();

        int n = r.nextInt();
    }
}

/*
生成一个随机数
第一种写法：int n = r.nextInt(); 默认是在int的取值范围之内获取随机数
第二种写法：小括号写一个数字n，表示随机的最大值，但是不包含这个数字  0~n-1
第三种写法：小括号写两个数字a,b，表示随机的取值范围是a~b，包含a，不包含b
*/
