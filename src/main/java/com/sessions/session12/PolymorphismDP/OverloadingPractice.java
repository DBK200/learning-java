package com.sessions.session12.PolymorphismDP;

public class OverloadingPractice {

    private  int calculateArea(int l){
        return l*l;
    }

    private int calculateArea(int l, int L){ //overloading prin nr de argumente/parametri
        return l*L;
    }

    private double calculateArea(double raza){
        return Math.PI * raza * raza;
    }

    public static void main(String[] args) {
        OverloadingPractice op=new OverloadingPractice();

        System.out.println(op.calculateArea(2));
        System.out.println(op.calculateArea(4,3));
        System.out.println(op.calculateArea(2.5));
    }
}
