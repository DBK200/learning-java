package com.sessions.session10.OtherExamples.Inheritance.MemberAccess;

public class B extends A { //subclass

    int total;


    void sum(){
        //total=i+j; //ERROR, j is not accessible here
    }
}
