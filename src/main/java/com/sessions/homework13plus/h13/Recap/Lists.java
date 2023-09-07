package com.sessions.homework13plus.h13.Recap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lists {
    // Scenario :
    // List Creation: Write a program that creates a List of strings and populates it with a few elements.
    // Print out the contents of the list using a loop.
    //
    //List Addition: Write a program that creates an empty List of integers and prompts the user to enter a series of numbers.
    // Add each number to the list, and then print out the contents of the list.
    //
    //List Searching: Write a program that creates a List of strings and prompts the user to enter a string to search for.
    // Use the contains() method to check if the string is in the list, and print out a message indicating whether the string was found or not.
    //
    //List Sorting: Write a program that creates a List of integers and sorts it in ascending order using the Collections.sort()
    // method. Print out the sorted list.
    //
    //List Removal: Write a program that creates a List of strings and prompts the user to enter a string to remove. Use the
    // remove() method to remove the first occurrence of the string from the list, and then print out the modified list.


    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Turing");
        myList.add("X");
        myList.add("Web3");
        myList.add("???");

        for (String selement : myList) {
            System.out.println(selement);
        }

        List<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number to be added to the list or type done to print the list ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            int number = Integer.parseInt(input);
            integerList.add(number);
        }
        for (Integer element : integerList) {
            System.out.println(element);
        }


        List<String> searchList = new ArrayList<>();
        searchList.add("e");
        searchList.add("g");
        searchList.add("f");
        searchList.add("s");
        searchList.add("d");
        searchList.add("b");
        System.out.println("What are you looking for? ");
        Scanner scanner2 = new Scanner(System.in);
        String searchInput = scanner2.nextLine();
        if (searchList.contains(searchInput)) {
            System.out.println("Your input is contained within the list");
        } else System.out.println("The list does not contain your input");


        List<Integer> listToBeSorted = new ArrayList<>();
        listToBeSorted.add(1);
        listToBeSorted.add(534);
        listToBeSorted.add(3);
        listToBeSorted.add(-76);
        listToBeSorted.add(-342);
        listToBeSorted.add(6565);
        listToBeSorted.add(54);

        Collections.sort(listToBeSorted);
        for (Integer sortedInt : listToBeSorted) {
            System.out.println(sortedInt);
        }

        // I'll just use the searchList

        System.out.println("What element do you want to remove from the searchList?");
        Scanner scanner3 = new Scanner(System.in);
        String removeInput = scanner3.nextLine();
        if (!searchList.contains(removeInput)) {
            System.out.println("The element you want to remove can't be found within this list.");
        } else searchList.remove(removeInput);
        for (String str : searchList) {
            System.out.println(str);
        }

    }

}


