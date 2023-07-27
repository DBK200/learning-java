package com.sessions.session7;

import java.util.ArrayList;

public class Homework {
    public static void main(String[] args) {

        System.out.println("1. Create a shopping list");
        String[] shoppingList = {"butter", "oil", "milk", "bread", "carrots"};
        System.out.print("The shopping list: ");
        for (String item : shoppingList) {
            System.out.print(item + " ");
        }

        System.out.println( "\n\n2.Create a wishlist");
        ArrayList<String> wishList = new ArrayList<>();
        wishList.add("red blanket");
        wishList.add("bicycle");
        wishList.add("jeans");
        System.out.print("The wish list: ");
        for (String item : shoppingList) {
            System.out.print(item + " ");
        }

        System.out.println( "\n\n3. Create 2 arrays");
        ArrayList studentList = new ArrayList();
        ArrayList graduateStudentList = new ArrayList();
        studentList.add("Alexandru Popescu");
        studentList.add("Elena Ionescu");
        studentList.add("Mihai Dumitrescu");
        studentList.add("Ana Stoica");
        studentList.add("Andrei Radu");
        studentList.add("Ioana Vasilescu");
        studentList.add("George Munteanu");
        studentList.add("Maria Gheorghiu");
        studentList.add("Ion Preda");
        studentList.add("Laura Cojocaru");
        graduateStudentList = studentList;
        System.out.println("The graduate student list:");
        int index = 1;
        for(int i = 0; i < graduateStudentList.size(); i++) {
            System.out.println(index++ + ". " + graduateStudentList.get(i));
        }
    }
}
