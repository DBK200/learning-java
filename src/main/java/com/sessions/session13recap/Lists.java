package com.sessions.session13recap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists {

    static Scanner scanner = new Scanner(System.in);

    // 3. List Searching: Write a program that creates a List
    // of strings and prompts the user to enter a string to
    // search for. Use the contains() method to check if the
    // string is in the list, and print out a message indicating
    // whether the string was found or not.
    private static String searchStringInList(String str, List list1){
        if(list1.contains(str)){
            return "The list contains the given string ";
        } else{
            return "The list DOES NOT contain the given string ";
        }
    }
    public static void main(String[] args) {


        // 1. List Creation: Write a program that
        // creates a List of strings and populates
        // it with a few elements. Print out the
        // contents of the list using a loop.
//        List stringList = new ArrayList<>();
//        String s1 ="aaa";
//        String s2 = "bbb";
//        String s3 = "ccc";
//        String s4 = "ddd";
//        String s5 = "eee";
//        stringList.add(s1);
//        stringList.add(s2);
//        stringList.add(s3);
//        stringList.add(s4);
//        stringList.add(s5);
//        for( Object s : stringList){
//            System.out.println(s  + " ");
//        }

        // 2. List Addition: Write a program that creates an empty
        // List of integers and prompts the user to enter a series
        // of numbers. Add each number to the list, and then print
        // out the contents of the list.
        //

        // Enter a series of numbers and add it to the list1 List
//        System.out.println("Enter a series of numbers (non-integer to stop): ");
//        while(scanner.hasNext()){
//            if(scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                list1.add(number);
//            } else{
//                break;
//            }
//        }

        // show the elements of the list1 List
//        System.out.println("The elements of List list1 are: ");
//        for(Object number : list1){
//            System.out.println(number + " ");
//        }


        // 3. List Searching: Write a program that creates a List
        // of strings and prompts the user to enter a string to
        // search for. Use the contains() method to check if the
        // string is in the list, and print out a message indicating
        // whether the string was found or not.

        List stringList = new ArrayList<>();
        String s1 ="aaa";
        String s2 = "bbb";
        String s3 = "ccc";
        String s4 = "ddd";
        String s5 = "eee";
        stringList.add(s1);
        stringList.add(s2);
        stringList.add(s3);
        stringList.add(s4);
        stringList.add(s5);

        System.out.println("Enter a String to search in stringList: ");
        String s = scanner.next();
        System.out.println(searchStringInList(s, stringList));
    }
}
