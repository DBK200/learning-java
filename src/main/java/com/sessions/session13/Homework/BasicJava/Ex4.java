package com.sessions.session13.Homework.BasicJava;

public class Ex4
{
//    Floating Point Precision: Write a program that calculates the average of three
//    floating-point numbers.
//    What happens if the sum of the three numbers exceeds the maximum value that can
//    be represented by a float? How can you handle this scenario?

    public static void main(String[] args)
    {
        System.out.println("Suma a trei numere:" +normalMethod(2,4,1));
        System.out.println("Suma a trei nr ce depasesc valoarea maxima a lui float:" +difficultMethod(200003000,2342443,4754521));
    }
    public static float normalMethod(float x,float y,float z)
    {
        return (float) (x + y + z)/3;
    }
    public static float difficultMethod(float a,float b,float c)
    {
        float media_aritmetica=(a+b+c)/3;
        if(((media_aritmetica<Float.MIN_VALUE) || (media_aritmetica>Float.MAX_VALUE)))
        {
            return (float)(a+b+c)/3;
        }
        else
            return -1;

    }

}
