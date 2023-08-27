package com.sessions.session12.recap;

public class Exercise1 {

    private static int divide (int a, int b) {
//        if (b == 0) {
//            System.out.println("Division by zero");
//            return 0;
//        }

        try {
            return a / b;
        } catch (ArithmeticException exception) {
            System.out.println("Division by zero");
        }
        return 0;
    }

    public static void main(String[] args) {

//        System.out.println(divide(6,3));
//        System.out.println(divide(0,3));
        System.out.println(divide(3,1));
    }
}
