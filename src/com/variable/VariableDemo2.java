package com.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        int attack1 = 220;
        int defense1 = 85;
        double blood1 = 1012.5;
        double skill1 = 1.2;

        int attack2 = 210;
        int defense2 = 80;
        double blood2 = 1223.3;
        double skill2 = 1.3;

        double damage1 = attack1 - defense2;
        blood2 = blood2 - damage1;

        System.out.println(blood2);

        double damage2 = attack1 * skill1 - defense2;
        blood2 = blood2 - damage2;

        System.out.println(blood2);
    }

}
