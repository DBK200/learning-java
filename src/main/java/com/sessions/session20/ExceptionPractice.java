package com.sessions.session20;

import java.io.FileNotFoundException;

public class ExceptionPractice {

    public static void main(String[] args) {

        String input=null;

        try{

            input.trim();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("inside catch block");
        }finally {//executes everytime
            System.out.println("inside finally block");
        }


    }

    private static void trimText(String text)  {

        throw new ArithmeticException();
//        text.trim();
    }
}
