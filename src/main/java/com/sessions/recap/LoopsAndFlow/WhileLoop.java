package com.sessions.recap.LoopsAndFlow;

public class WhileLoop {

//    While Loop: Write a program that prompts the user to enter a number and checks
//    if it is a prime number using a while loop. Print out a message indicating whether
//    the number is prime or not.

    private static String primeNumber(int x){
        int i=2;
        while (i<x)
        {
            if(x%i==0)
            {
                return "The number is not prime";
            }
            i++;
        }
        return "The number is prime";
    }

    public static void main(String[] args) {

        System.out.println(primeNumber(13));
    }
}
