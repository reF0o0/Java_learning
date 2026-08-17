package com.scanner;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入身高(m)：");
        double height = sc.nextDouble();

        System.out.println("请输入体重(kg)：");
        double weight = sc.nextDouble();
        
        double BMI = weight / (height * height);
        System.out.println("BMI指数是：");
        System.out.println(BMI);
    }
}
