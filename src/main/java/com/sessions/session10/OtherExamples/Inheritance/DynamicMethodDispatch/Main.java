package com.sessions.session10.OtherExamples.Inheritance.DynamicMethodDispatch;

public class Main {
    public static void main(String[] args) {
        A a = new A();// object of type A
        a.callMe();

        B b=new B();
        a=b;
        a.callMe();
        A b1=new B();
        b1.callMe();


        A c1=new C();
        c1.callMe();


    }
}
