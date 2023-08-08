package com.sessions.session11.defaultmethod;

public class C implements A,B{

    public String calculateNumbers(){

        return "inside class C";
//        System.out.println("inside class C");
//        return A.super.calculateNumbers();

    }

    public static void main(String[] args) {
        new C().calculateNumbers();
    }


}
