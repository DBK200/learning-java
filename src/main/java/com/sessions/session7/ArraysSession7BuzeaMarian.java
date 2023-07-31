package com.sessions.session7;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysSession7BuzeaMarian {
    public static void main(String[] args) {
        String [] myShoppingList = {"Bread", "Milk", "Chocolate", "Eggs", "Yogurt"};

        ArrayList list1 = new ArrayList();

        list1.add("Happiness");
        list1.add("Vacation");
        list1.add("New life");
        System.out.println(list1);

        ArrayList <String> graduateStudentList = new ArrayList();
        ArrayList <String> studentList = new ArrayList();
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
//        graduateStudentList.addAll(studentList);
//        System.out.println(graduateStudentList);

        for(String name : studentList) {
          graduateStudentList.add(name);
        }
        System.out.println(graduateStudentList);



    }
}
