package com.sessions.session9.OtherExamples.AccessModifiers;

public class AccessModifiers {

    int a; //default access
    public int b; //public access
    private int c; //private access

    //methods to access c
    void setC(int i){
        c=i;
    }
    int getC(){
        return c;
    }
}
