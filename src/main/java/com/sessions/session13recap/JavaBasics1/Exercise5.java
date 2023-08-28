package com.sessions.session13recap.JavaBasics1;

public class Exercise5 {
    public static float average(float a, float b, float c) {
        if (a + b + c  == Float.MAX_VALUE) {
            System.out.println("Maximum value of float reached.");
        }
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {

        float result = average(2.5f, 7.3f, 626.6f);
        System.out.println(result);
        result = average(Float.MAX_VALUE, 1 , 3);
        System.out.println(result);

    }
}
