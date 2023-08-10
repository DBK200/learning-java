package com.sessions.session12.polymorphism;

public class OverloudingPractice {

    private int calculateArea(int l){
        return l*l;
    }

    private int calculateArea(int lungime, int latime){//overloadde argumente/parametriiing prin nr
        return lungime*latime;
    }

    private Double calculateArea(double raza){
        return 3.14*raza*raza;
    }

    public static void main(String[] args) {

        System.out.println( new  OverloudingPractice().calculateArea(2));
        System.out.println( new  OverloudingPractice().calculateArea(2,3));
        System.out.println( new  OverloudingPractice().calculateArea(2.5));

    }
}
