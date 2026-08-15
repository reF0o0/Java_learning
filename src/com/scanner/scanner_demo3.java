package com.scanner;

import java.util.Scanner;

public class scanner_demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入体重(kg)：");
        double height = sc.nextDouble();

        System.out.println("请输入身高(m)：");
        double weight = sc.nextDouble();
        
        double BMI = weight / (height * height);
        System.out.println("BMI指数是：");
        System.out.println(BMI);
    }
}
