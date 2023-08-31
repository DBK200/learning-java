package com.sessions.session13.recap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex23 {

    //Write a program that creates a List of strings and prompts the user to enter a string to search for.
    // Use the contains() method to check if the string is in the list, and print out a message indicating whether the string was found or not.

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("car");
        list.add("cat");
        list.add("bike");
        list.add("apple");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to search for: ");
        String input = scanner.nextLine();

        if (list.contains(input)){
            System.out.println("Your word was found in the list");
        }else {
            System.out.println("Your word was not found in the list");
        }
    }

}
