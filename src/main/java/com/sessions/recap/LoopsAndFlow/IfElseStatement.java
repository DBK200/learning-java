package com.sessions.recap.LoopsAndFlow;

public class IfElseStatement {

//    If-Else Statement: Write a program that prompts the user to enter a number
//    and checks if it is even or odd using an if-else statement. Print out a message
//    indicating whether the number is even or odd.

    private static String parity(int x){
        if(x%2==0)
            return "The number is even.";
        else
            return "The number is odd.";
    }

    public static void main(String[] args) {

        System.out.println(parity(3));

    }
}
