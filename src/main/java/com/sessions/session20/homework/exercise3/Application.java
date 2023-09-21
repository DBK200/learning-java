package com.sessions.session20.homework.exercise3;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        /* Write a program that performs some risky operations (e.g., division, file manipulation, invalid arguments
        etc.) and handles specific exceptions differently. Use multi-catch to handle related exceptions in a
        single block and individual catch blocks for others.*/

        Integer number = null;
        try {
            number += 2;
        } catch (NullPointerException exception) {
            System.out.println("Eroare 1");
        }

        Object o = Integer.valueOf(0);
        try {
            String s = (String) o;
            double result = 8 / 0;
        } catch (ClassCastException | ArithmeticException exception2) {
            System.out.println("Eroare 2");
        }
    }
}


