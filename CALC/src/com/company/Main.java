package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Здравствуйте, я умный калькулятор \n" +
                "введите 2 числа и я быстро посчитаю их \n" +
                "по условию вы можете использовать только арабские ИЛИ римские цифры \n" +
                "начнём: ");
        Scanner in = new Scanner(System.in);
        String as = in.nextLine().toUpperCase();
        String[] nik = as.split(" ");
        try {
            if (nik.length != 3) {
                throw new Exception("!@#$^ или вы ввели что-то не правильно :< ");
            }
            boolean check1=false;
            boolean check2=false;
            if(LOGIC.contains(nik[0]))check1=true;
            if(LOGIC.contains(nik[0]))check2=true;
            if(check1 && check2) LOGIC.RomCalc(nik);
            else if(check1==false && check2==false) LOGIC.ArabCalc(nik);
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        }
    public static boolean contains(String value) {

        for (Buba c : Buba.values()) {
            if (c.name().equals(value)) {
                return true;
            }
        }
        return false;
    }

}
