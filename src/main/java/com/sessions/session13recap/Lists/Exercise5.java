package com.sessions.session13recap.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to remove: ");
        String input = scanner.next();

        if (list.contains(input)) {
            list.remove(input);
        } else {
            System.out.println("The string entered is not in the list.");
        }
        System.out.println(list);
    }
}
