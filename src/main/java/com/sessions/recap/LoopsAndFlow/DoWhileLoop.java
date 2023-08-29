package com.sessions.recap.LoopsAndFlow;

public class DoWhileLoop {
    //Do-While Loop: Write a program that prompts the user to enter a number and
    // calculates the sum of the digits of that number using a do-while loop.
    // Print out the sum of the digits.

    private static int digitsSum(int x){
        int digitsSum=0;
        do{
            digitsSum+=x%10;
            x=x/10;
        }while (x!=0);
        return digitsSum;
    }

    public static void main(String[] args) {

        System.out.println(digitsSum(1111));
    }

}
