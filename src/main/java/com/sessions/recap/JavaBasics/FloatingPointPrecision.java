package com.sessions.recap.JavaBasics;

public class FloatingPointPrecision {

//    Floating Point Precision: Write a program that calculates the average of
//    three floating-point numbers. What happens if the sum of the three numbers exceeds
//    the maximum value that can be represented by a float? How can you handle this scenario?

    private static float average(float x,float y, float z)
    {
        double maxValue=(double) x+y+z;
        if(maxValue>Float.MAX_VALUE)
        {
            System.out.println("the sum of the three numbers exceeds the maximum value that can be represented by a float");
            return 0;
        }
        else {
            System.out.println("The average is:");
            return (x + y + z) / 3;
        }
    }

    public static void main(String[] args) {

        System.out.println(average(7.5f,4.46f,93.65f));
        System.out.println(average(Float.MAX_VALUE,Float.MAX_VALUE,Float.MAX_VALUE));

    }

}
