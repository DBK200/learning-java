package com.sessions.session11.defaultMethod;

public class C implements A, B{

    @Override
    public void calculateNumbers() {
//        System.out.println("Inside C");
        A.super.calculateNumbers();
    }

    public static void main(String[] args) {

//        C test = new C();
//        test.calculateNumbers();
        new C().calculateNumbers();
    }
}
