package com.sessions.session20;

import java.io.FileNotFoundException;

public class ExceptionPractice {

    public static void main(String[] args) {
        String input = "abc";
        try {
            trimText(input);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Inside catch block - arithmetic exception");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("inside catch block - runtime");
        } finally { //executes everytime
            System.out.println("closing resources");
            System.out.println("inside finally block");
        }
    }




    private static void trimText(String text) {
        //throw si throws
        throw new ArithmeticException();
    }

}


