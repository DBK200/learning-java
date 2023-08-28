package com.sessions.session13recap.JavaBasics1;

public class Exercise2 {

    private static int divide (int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException exception) {
            System.out.println("Division by zero");
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(divide(6,3));
        System.out.println(divide(0,3));
        System.out.println(divide(3,1));
    }
}

