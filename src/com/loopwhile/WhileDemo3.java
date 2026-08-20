package com.loopwhile;

public class WhileDemo3 {
    public static void main(String[] args) {
        int money = 100000;
        int years = 0;
        while (money < 200000) {
            years++;
            money *= 1.017;
        }
        System.out.println(years);
    }
}

//假设你在银行投资了100000元，银行给出的复利是1.7%，问多少年后能实现本金翻倍？