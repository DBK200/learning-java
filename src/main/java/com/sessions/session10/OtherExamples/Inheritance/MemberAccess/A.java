package com.sessions.session10.OtherExamples.Inheritance.MemberAccess;

//contains an error and will not compile
public class A { //superclass

    int i; //default access
    private int j; // private to A

    void setIJ(int i, int j){
        this.i=i;
        this.j=j;
    }

}


