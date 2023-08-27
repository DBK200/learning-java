package com.sessions.session12.recap;

public class Exercise2 {
    public static void main(String[] args) {

        double number = 5.2;
        int integerNumber = (int) number; //explicit

        int nr = 6;
        float x = nr; //implicit

        System.out.println("The initial number is: " + number);
        System.out.println("The value casted to int is: " + integerNumber);

        System.out.println(nr);
        System.out.println(x);
    }
}