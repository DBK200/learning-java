package com.sessions.session11.abstraction.defaultMethod;

public class C implements A, B{

       public String calculateNumbers(){
//        System.out.println(" inside class C");

           return A.super.calculateNumbers();
    }

    public static void main(String[] args) {
        new C().calculateNumbers();
    }



    }



