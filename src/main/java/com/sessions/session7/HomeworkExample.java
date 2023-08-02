package com.sessions.session7;

import java.util.ArrayList;
import java.util.List;

public class HomeworkExample {

//    Challenge
//    1. Create a shopping list with Array and print the values
//    2. Create a wishlist for christmas with ArrayList and print the values
//    3. Create
//        - 2 empty ArrayLists: studentList and graduateStudentList
//        - populate studentList with 10 students
//        - copy values from studentList to graduateStudentList
//        - iterate through graduateStudentList and print each graduated student

    public static void main(String[] args) {
        System.out.println("H1");
        homework1();
        System.out.println("H1");
        homework2();
        System.out.println("H3");
        homework3();

    }

    private static void homework1() {
        String[] shoppingList = {"beer", "more beer", "peanuts"};
//        String[] shoppingList = new String[]{"beer", "more beer", "peanuts"};
        for (String item : shoppingList) {
            System.out.println(item);
        }
    }


    private static void homework2() {
        List<String> whishList = new ArrayList<>();
        whishList.add("beer");
        whishList.add("bike");
        whishList.add("qdqwd");

        for (String item : whishList) {
            System.out.println(item);
        }
    }

    private static void homework3() {
        List<String> studentList = new ArrayList<>();
        List<String> graduateList = new ArrayList<>();
        studentList.add("Jhon");
        studentList.add("Mary");
        studentList.add("Tom");

//        graduateList.addAll(studentList);
//        for(String student: studentList){
//            graduateList.add(student);
//        }
//
//
//        graduateList.stream().forEach(x-> System.out.println(x));
//        graduateList.stream().(x-> System.out.println(x));
//        studentList.forEach(x->graduateList.add(x));
        studentList.forEach(graduateList::add);
        graduateList.forEach(System.out::println);
    }


}
