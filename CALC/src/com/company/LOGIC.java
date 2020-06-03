package com.company;

import java.util.TreeMap;

public class LOGIC {
    public  static void ArabCalc(String[] s){
        try{
            Integer a=new Integer(s[0]);
            Integer b=new Integer(s[2]);
            if(a>10 || b>10)throw new Exception("Максимальное значение 10");
            int res=finalcount(a,s[1],b);
            System.out.println(res);
        }catch (Exception ex){
            System.err.println("Неверно введены данные");
            System.err.println(ex.getMessage());
        }
    }

    public  static void RomCalc(String[] s){
        int a=Buba.valueOf(s[0]).toInt();
        int b=Buba.valueOf(s[2]).toInt();
        int res=finalcount(a,s[1],b);
        System.out.println(ArabToRom(res));
    }
    public  static String ArabToRom(int num){
        String res=new String();
        int e=num%10;
        int d=num/10;

        if(d==4)res+="XL";
        else if(d==9)res+="XC";
        else if(d==5)res+="L";
        else if(d==10)res+="C";
        else if(d<4){
            while (d>0){
                res+="X";
                d--;
            }
        }
        else {
            res+="L";
            while (d>0){
                res+="X";
                d--;
            }
        }
       for(Buba i:Buba.values()) if (i.GetValue()==e)res+=i.name();
        return res;
    }

    public static int finalcount(int a, String symbol, int b) {
        switch (symbol) {
            case "/":
                return a / b;
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                try {
                    throw new Exception("Неверные арифметические действия");
                }catch (Exception ex){
                    System.err.println(ex.getMessage());
                }
        }
        return 0;
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
