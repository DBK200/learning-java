package com.sessions.session13.recap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex25 {

    //Write a program that creates a List of strings and prompts the user to enter a string to remove.
    // Use the remove() method to remove the first occurrence of the string from the list, and then print out the modified list.

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("car");
        list.add("cat");
        list.add("bike");
        list.add("apple");

        Scanner scanner = new Scanner(System.in);

        System.out.println(list);

        System.out.println("enter what element to remove from the list");

        String input = scanner.nextLine();

        list.remove(input);
        System.out.println(list);
    }


}
