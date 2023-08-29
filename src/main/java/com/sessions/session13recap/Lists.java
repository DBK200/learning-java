package com.sessions.session13recap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lists {

    static Scanner scanner = new Scanner(System.in);

    // 3. List Searching: Write a program that creates a List
    // of strings and prompts the user to enter a string to
    // search for. Use the contains() method to check if the
    // string is in the list, and print out a message indicating
    // whether the string was found or not.
//    private static String searchStringInList(String str, List list1){
//        if(list1.contains(str)){
//            return "The list contains the given string ";
//        } else{
//            return "The list DOES NOT contain the given string ";
//        }
//    }


    // 4. List Sorting: Write a program that creates a List of integers
    // and sorts it in ascending order using the Collections.sort() method.
    // Print out the sorted list.
//    private static List ascendingSort(List list1){
//       Collections.sort(list1);
//       return list1;
//    }

    // 5. List Removal: Write a program that creates a List of strings and prompts
    // the user to enter a string to remove. Use the remove() method to remove the
    // first occurrence of the string from the list, and then print out the modified list.
    private static List removeElementFromList(List list1, String str){
        list1.remove(str);
        return list1;
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
//
//        System.out.println("Enter a String to search in stringList: ");
//        String s = scanner.next();
//        System.out.println(searchStringInList(s, stringList));

        // 4. List Sorting: Write a program that creates a List of integers
        // and sorts it in ascending order using the Collections.sort() method.
        // Print out the sorted list.

//        List integerList = new ArrayList();
//        System.out.println("Type a series of integer numbers (breaks if 0 is entered: )");
//        while(true){
//            int number = scanner.nextInt();
//            integerList.add(number);
//            if(number==0){
//                break;
//            }
//        }
//        int x1=133;
//        int x2=-1;
//        int x3=17;
//        int x4=9;
//        int x5=5;
//        integerList.add(x1);
//        integerList.add(x2);
//        integerList.add(x3);
//        integerList.add(x4);
//        integerList.add(x5);
//        List newList = ascendingSort(integerList);
//        // show sorted list
//        System.out.println("The sorted list is:");
//        for(Object number : newList){
//            System.out.println(number + " ");
//        }

        // 5. List Removal: Write a program that creates a List of strings and prompts
        // the user to enter a string to remove. Use the remove() method to remove the
        // first occurrence of the string from the list, and then print out the modified list.
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
        List newList =removeElementFromList(stringList, "bbb");
        System.out.println("The new list is:");
        for(Object number : newList){
            System.out.println(number + " ");
        }
    }
}
