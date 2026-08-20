package com.controllerloop;

import java.util.Scanner;

public class BreakDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hp = 200;

        int damage = 0;
        System.out.println("受到伤害：");
        while (true) {
            damage = sc.nextInt();
            if (damage < 0) {
                System.out.println("输入错误，请重新输入");
            } else {
                break;
            }
        }

        hp -= damage;
        if (hp <= 0) {
            hp = 1;
        }
        System.out.println("当前血量：" + hp);

        int recovery = 0;
        System.out.println("回复血量：");
        while (true) {
            recovery = sc.nextInt();
            if (recovery < 0) {
                System.out.println("输入错误，请重新输入");
            } else {
                break;
            }
        }

        hp += recovery;
        if (hp > 200) {
            hp = 200;
        }
        System.out.println("当前血量：" + hp);

        sc.close();
    }
}

/*
 * 需求：初始最大生命200，受到X点伤害，技能恢复Y点血，X和Y由键盘录入而来 假设，游戏人物不会死亡，最少1点血
 * 问：最终游戏人物血量是多少？
 */