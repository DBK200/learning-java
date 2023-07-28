package com.sessions.session7.Homework;

import java.util.ArrayList;
import java.util.List;

public class Students {

    public static void main(String[] args){
        // 2 empty ArrayLists: studentList and graduateStudentList
        List<String> studentsList=new ArrayList<>();
        List<String> graduateStudentsList=new ArrayList<>();

        //populate studentList with 10 students
        studentsList.add("Andreea");
        studentsList.add("Alexandra");
        studentsList.add("Andrei");
        studentsList.add("Cristi");
        studentsList.add("Daniel");
        studentsList.add("Florina");
        studentsList.add("Adam");
        studentsList.add("Janis");
        studentsList.add("Lidia");
        studentsList.add("Emily");

        //copy values from studentList to graduateStudentList
//        for(String student:studentsList){
//            graduateStudentsList.add(student);
//        }
        graduateStudentsList.addAll(studentsList);


        //iterate through graduateStudentList and print each graduated student
//        for(String student:graduateStudentsList){
//            System.out.println(student);
//        }

//        System.out.println(graduateStudentsList);

        graduateStudentsList.forEach(System.out::println);


    }
}
