package com.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入数字：");
            int num1 = sc.nextInt();
            System.out.println("你输入的数字是：");
            System.out.println(num1);

            double num2 = sc.nextDouble();
            System.out.println(num2);

            String str = sc.next();
            System.out.println(str);

            sc.close();
    }
}
