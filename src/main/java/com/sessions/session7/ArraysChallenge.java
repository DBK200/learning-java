/**********************
 *                    *
 *  Date: 20.07.2023  *
 *                    *
 **********************/

/*

   Challenge
   [X]  1.  Create a shopping list with Array and print the values
   [X]  2.  Create a wishlist for Christmas with ArrayList and print the values
   [ ]  3.  Create 2 empty ArrayLists: [studentList] and [graduateStudentList]
            a.  populate studentList with 10 students
            b.  copy values from studentList to graduateStudentList
            c.  iterate through graduateStudentList and print each graduated student

*/

package com.sessions.session7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysChallenge {

    public static void main(String[] args) {

        /*-------------------
         |  Exercise no. 1  |
         -------------------*/

        System.out.printf("%n%s%n%n", "== Exercise no. 1 " + "=".repeat(2));

        // Initialises an array of Strings with 3 elements.
        // Because is not a primitive, initial elements are NULL
        String arShoppingList[] = new String[3];
        // Prints out the array elements using {Arrays.toString()} method
        System.out.println("After initialisation, [arShoppingList] array is: " + Arrays.toString(arShoppingList));

        // Populates the array with values
        for (int i = 0; i < arShoppingList.length; i++) {
            arShoppingList[i] = "ShoppingItem" + i;
        }

        // Elements printout
        System.out.print("[arShoppingList] array is:");
        for (String el: arShoppingList) {
            System.out.print(" " + el);
        }

        // Another way to print out array's elements, using {Arrays.toString()} method
        System.out.println("\n[arShoppingList] array is: " + Arrays.toString(arShoppingList));

        System.out.printf("%n%s%n", "=".repeat(20));


        /*-------------------
         |  Exercise no. 2  |
         -------------------*/

        System.out.printf("%n%s%n%n", "== Exercise no. 2 " + "=".repeat(2));

        // Variable initialisation
        List<String> alXmasList = new ArrayList<>();
        // Adding values to the ArrayList
        alXmasList.add("Candy canes");
        alXmasList.add("Cake");
        alXmasList.add("Soda");
        alXmasList.add("Wrapping paper");
        alXmasList.add("Ribbon");

        // List elements printout
        System.out.print("[alXmasList] list is: ");
        for (int i = 0; i < alXmasList.size(); i++) {
            System.out.print( ((i == 0) ? "" : ", ") + alXmasList.get(i));
        }

        // Print out ArrayList elements, using {Arrays.toString()} method
        // [alXmasList] has to be converted to an array first.
        System.out.println("\n[alXmasList] list is: " + Arrays.toString(alXmasList.toArray()));

        System.out.printf("%n%s%n", "=".repeat(20));


        /*-------------------
         |  Exercise no. 3  |
         -------------------*/

        System.out.printf("%n%s%n%n", "== Exercise no. 3 " + "=".repeat(2));

        List<String> studentList = new ArrayList<>();
        // Populates the list with values
        for (int i = 0; i < 10; i++) {
            studentList.add("Student" + ((i + 1 < 10) ? "0" : "") + (i+1));
        }
        // List values printout
        System.out.println("[studentList] list is: " + Arrays.toString(studentList.toArray()));

        List<String> graduateStudentList = new ArrayList<>(studentList);
        for (int i = 0; i < graduateStudentList.size(); i++) {
            System.out.print(((i == 0) ? "[graduateStudentList] list is: " : ", ") + graduateStudentList.get(i));
        }

        // Print out ArrayList elements, using {Arrays.toString()} method
        // [graduateStudentList] has to be converted to an array first.
        System.out.println("\n[graduateStudentList] list is: " + Arrays.toString(graduateStudentList.toArray()));

        System.out.printf("%n%s%n", "=".repeat(20));

    }
}
