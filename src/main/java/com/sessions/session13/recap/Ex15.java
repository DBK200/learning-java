package com.sessions.session13.recap;

import java.util.Scanner;

public class Ex15 {
    //Write a program that prompts the user to enter a string and prints out the length of the string.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println("The lenght of your input is: " + input.length());
    }
}
