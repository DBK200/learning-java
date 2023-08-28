package com.sessions.session13recap.JavaBasics1;

public class Exercise1 {

    public static int multiply (int x, int y) {
        int result = 0;
        try {
             result = Math.multiplyExact(x,y);
        } catch (ArithmeticException e) {
            System.out.println("Overflow int");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5,8));
        System.out.println(multiply(353534,64654654));
    }
}
