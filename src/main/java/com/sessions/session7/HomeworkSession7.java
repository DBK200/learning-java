package com.sessions.session7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeworkSession7 {
    public static void main(String[] args) {
        //1. Create a shopping list with Array and print the values
        String[] shoppingList = {"Apples", "Bananas", "Shampoo", "Soap", "Juice"};

        System.out.println("The shopping list is: ");
        for( String item : shoppingList){
            System.out.println(item);
        }
        System.out.println();

        //2. Create a wishlist for Christmas with ArrayList and print the values
        ArrayList<String> wishList = new ArrayList<>();
        wishList.add("Perfume");
        wishList.add("Xbox");
        wishList.add("PlayStation");
        wishList.add("a new car");

//        for(String element : wishList){
//            System.out.println(element + " ");
//        }
//        System.out.println();
        System.out.println("The Christmas wishlist is: ");
       String[] christmasWishList = wishList.toArray(new String[0]);
        for( Object listItem : christmasWishList){
            System.out.println(listItem);
        }
        System.out.println();


        // from Array to ArrayList
        List<String> wishList2 = Arrays.asList(christmasWishList);

        //3. Create:
            /*
            - 2 empty ArrayLists: studentList and graduateStudentList
            - populate studentList with 10 students
            - copy values from studentList to graduateStudentList
            - iterate through graduateStudentList and print each graduated student
             */

        // - 2 empty ArrayLists: studentList and graduateStudentList:
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

        // - populate studentList with 10 students:
        studentList.add("John Doe");
        studentList.add("Will Smith");
        studentList.add("Sumona Dey");
        studentList.add("Ryia Saha");
        studentList.add("Souray Dev");
        studentList.add("Wade Dave");
        studentList.add("Lewis Milton");
        studentList.add("Ethan Aidan");
        studentList.add("Connor Antonio");
        studentList.add("Carlos Eli");

        // - copy values from studentList to graduateStudentList
        System.out.println("The graduate student list is: ");
        graduateStudentList = studentList; // cu for each best practice
        for(String element : graduateStudentList){
            System.out.println(element);
        }



    }
}
