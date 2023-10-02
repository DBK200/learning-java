package com.sessions.session20;

public class ExceptionPractice {

    public static void main(String[] args) {
        String input = null;
        //input.trim();
        try {
            trimText(input);
        } catch (/*NullPointerException e RuntimeException*/ RuntimeException /*| NullPointerException*/ e) {
            System.out.println(e.fillInStackTrace());
            //System.out.println("Input can not be null. Please insert a valid text....");
            System.out.println("inside catch block");
        } finally{ // executes everytime
            System.out.println("closing resources");
            System.out.println("inside finally block");
        }

    }


    private static void trimText(String text) {
        throw new ArithmeticException();
        //text.trim();
    }
}