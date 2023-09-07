package com.sessions.homework13plus.h13.Recap;

public class FloatingPointPrecision {


    public static void main(String[] args) {
        // Scenario :  Write a program that calculates the average of three floating-point numbers.
        //What happens if the sum of the three numbers exceeds the maximum value that can be represented by a float? How can you handle this scenario?

        float a, b, c;
        a = Float.MAX_VALUE;
        b = 1;
        c = 2;

        double sum = (double) a + (double) b + (double) c;
        // If the sum exceeds the maximum value that can be represented by a float we will get the value of Float.MAX_VALUE
        // To avoid this situation I would parse the variables to double.
        double average = sum / 3;

        System.out.println(average);


    }
}
