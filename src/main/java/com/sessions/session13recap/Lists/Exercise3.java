package com.sessions.session13recap.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to search for: ");
        String input = scanner.next();

        if (list.contains(input)) {
            System.out.println("String found.");
        } else {
            System.out.println("String not found.");
        }
    }
}
