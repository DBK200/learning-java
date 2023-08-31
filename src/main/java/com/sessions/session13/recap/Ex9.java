package com.sessions.session13.recap;

public class Ex9 {

    //Write a program that prompts the user to enter a number and checks if it is even or odd using an if-else statement.
    // Print out a message indicating whether the number is even or odd.

    public static void main(String[] args) {

        int number = 8;

        if ((number % 2) == 0){
            System.out.println("The number " + number + " is even");
        }else {
            System.out.println("The number " + number + " is odd");
        }
    }
}
