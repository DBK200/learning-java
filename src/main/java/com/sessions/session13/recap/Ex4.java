package com.sessions.session13.recap;

public class Ex4 {
    //Write a program that calculates the average of three floating-point numbers.
    //What happens if the sum of the three numbers exceeds the maximum value that can be represented by a float?
    //How can you handle this scenario?

    public static void main(String[] args) {

        float x = 6.9f;
        float y = 2.6f;
        float z = 5.2f;

        float sum = x + y + z;

        if (sum > Float.MAX_VALUE){
            System.out.println("the value is too large");
        }else {
            float average = sum / 3;
            System.out.println("The average is: " + average);
        }

    }
}
