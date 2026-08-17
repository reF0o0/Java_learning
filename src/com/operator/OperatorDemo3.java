package com.operator;

import java.util.Scanner;

public class OperatorDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入秒数：");
        int time = sc.nextInt();

        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;
        
        System.out.print(hours + "小时" + minutes + "分" + seconds + "秒");
    }
}
