package com.loopwhile;

public class whileDemo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("胡桃我爱你！");
        }

        int i = 1;
        while (i <= 10) {
            System.out.println("我爱你胡桃！");
            i++;
        }
    }
}

/*
 * for和while的区别：
 * for循环中：知道循环次数或者循环的范围
 * while循环：不知道循环的次数和范围，只知道循环的结束条件。
 */
