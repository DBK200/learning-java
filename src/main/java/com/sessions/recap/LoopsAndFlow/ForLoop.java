package com.sessions.recap.LoopsAndFlow;

public class ForLoop {

//    For Loop: Write a program that prompts the user to enter a number
//    and calculates the factorial of that number using a for loop.
//    Print out the factorial of the number.

    private static int factorial(int x){
        int factorial=1;
        for (int i=2;i<=x;i++){
            factorial*=i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

}
