package com.sessions.session10.OtherExamples.Inheritance.MethodOverriding;

public class Main {
    public static void main(String[] args) {
            B subObj=new B(1,2,3);
            subObj.show(); //this calls show() in B

           subObj.show("This is k: "); //this calls show(msg) in B
    }
}
