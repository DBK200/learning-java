package com.sessions.Homework;

import java.util.ArrayList;
import java.util.List;

public class Homework7And8 {
    public static void main(String[] args) {
        //1.

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Mere");
        shoppingList.add("Pere");
        shoppingList.add("Idk1");
        shoppingList.add("Idk2");
        System.out.println(shoppingList);

        //2.

        List<String> wishList = new ArrayList<>();
        wishList.add("wish1");
        wishList.add("wish2");
        wishList.add("wish3");
        System.out.println(wishList);

        //3.

        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();
        studentList.add("Student1");
        studentList.add("Student2");
        studentList.add("Student3");
        studentList.add("Student4");
        studentList.add("Student5");
        studentList.add("Student6");
        studentList.add("Student7");
        studentList.add("Student8");
        studentList.add("Student9");
        studentList.add("Student10");

        graduateStudentList.addAll(studentList);
        for (String S:graduateStudentList
             ) {
            System.out.println(S);
        }


    }
}
