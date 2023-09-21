package com.sessions.session20.Homework;

public class Ex3 {
    public static void main(String[] args) {
        //Write a program that performs some risky operations (e.g., division, file manipulation, invalid arguments..etc..)
        // and handles specific exceptions differently. Use multi-catch to handle related exceptions in a single block and individual catch blocks for others.

        int a = 5;
        int b = 0;
        try {
            int c = a / b;
        }catch(ArithmeticException e){
            System.out.println("Inside catch block - arithmetic exception");
        }

    }
}
