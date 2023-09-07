package com.sessions.homework13plus.h13.Recap;

public class IntegerOverflow {
    public static void main(String[] args) {
        // If we multiply 2 integers and the value is larger than the maximum int value we will encounter an Integer Overflow
        // Our result will be something which does not make mathematical sense
        int a = 1000000000, b = 999999999;
        int resultAsInt;

        resultAsInt = a * b;
        System.out.println("Integer overflow scenario with the result as an int : a * b = " + a + " * " + b + " = " + resultAsInt);

        // To avoid such a scenario we will need to use long.

        long resultAsLong;
        resultAsLong = (long) a * (long) b;
        System.out.println(resultAsLong);

    }
}
