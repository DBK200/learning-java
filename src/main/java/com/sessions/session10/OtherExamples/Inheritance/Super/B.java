package com.sessions.session10.OtherExamples.Inheritance.Super;

public class B extends A{
    int i; // this i hides the i in A

    B(int a, int b){
        super.i=a;
        i=b;
    }


}
