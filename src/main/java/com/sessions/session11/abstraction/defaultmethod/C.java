package com.sessions.session11.abstraction.defaultmethod;

public class C implements A, B{

//    public void calculateNumbers(){
//        System.out.println("Inside class C");
//    }

    public String calculateNumbers(){
        // return "inside class C";
        return A.super.calculateNumbers();
    }

    public static void main(String[] args) {
        new C().calculateNumbers();
    }
}
