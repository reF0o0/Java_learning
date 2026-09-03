package com.ifdemo;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int health = 200;
        System.out.println("初始人物血量：" + health);

        System.out.println("造成伤害：");
        int damage = sc.nextInt();

        int health1 = health - damage;

        if (health1 < 1) {
            health1 = 1;
        }

        System.out.println("剩余血量：" + health1);

        System.out.println("回复血量：");
        int recovery = sc.nextInt();

        int health2 = health1 + recovery;

        if (health2 > 200) {
            health2 = 200;
        }

        System.out.println("剩余血量：" + health2);

        sc.close();
    }
}
