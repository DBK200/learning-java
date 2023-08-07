package com.sessions.session9.OtherExamples.Recursion;

public class Factorial {

    public int fact(int n){
        int result;
        if(n==1) {
            System.out.print(n+" = ");
            return 1;
        }
        System.out.print(n+ " x ");
        result=fact(n-1) *n;
        return result;
    }
}
