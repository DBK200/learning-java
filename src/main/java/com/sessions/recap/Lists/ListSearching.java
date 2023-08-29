package com.sessions.recap.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSearching {

//    List Searching: Write a program that creates a List of strings and prompts the
//    user to enter a string to search for. Use the contains() method to check if the
//    string is in the list, and print out a message indicating whether the string was
//    found or not.

    public static void main(String[] args) {
        List<String> car=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        car.add("Mert");
        car.add("BMW");
        car.add("Audi");
        car.add("Dacia");

        String myString=scanner.nextLine();
        if(car.contains(myString)){
            System.out.println("The string is in the list");
        }
        else
            System.out.println("The string is not in the list");
    }
}
