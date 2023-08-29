package com.sessions.session12.polimofirsm;

public class OverloadingPractice {
    private int calculateArea(int l)
    {
        return l*l;
    }

//    private int calculateArea(int x)
//    {
//        System.out.println("ceva");
//        return 2;
//    }
    private int calculateArea(int lungime,int latime)
    {
        return lungime*latime;
    }

    private Double calculateArea(double raza)
    {
        return 3.14*raza*raza;
    }
    public static void main(String[] args) {
        System.out.println(new OverloadingPractice().calculateArea(2));
        System.out.println(new OverloadingPractice().calculateArea(2,3));
        System.out.println(new OverloadingPractice().calculateArea(2.5));

    }
}

