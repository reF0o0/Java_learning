package com.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        double wechat_money = 0;
        double alipay_money = 10;
        double bank_card_money = 20;
        System.out.println(wechat_money + alipay_money + bank_card_money);
        wechat_money = wechat_money + 10;
        System.out.println(wechat_money);
    }

}
/*
 * 变量规范：
 * 变量类型 变量名 = 数据值；
 */