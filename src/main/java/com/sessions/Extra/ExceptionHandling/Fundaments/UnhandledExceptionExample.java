package com.sessions.Extra.ExceptionHandling.Fundaments;

public class UnhandledExceptionExample {
    static void subroutine(){
        //throws ArithmeticException
        int d=0;
        int a=42/d;
    }

    public static void main(String[] args) {

       subroutine();
    }
}
