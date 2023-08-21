package com.sessions.session12.HomeworkAV.challenge1.example1;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Student student = new Student("Mike", 23);
        User user = student;
        Person person = student;

        System.out.println(student.getAge()); //returns the age
        //user.getAge(); //will not compile, getAge method is not defined in User class

        System.out.println(student.getEmail()); //returns the email
        //System.out.println(user.getEmail()); //will not compile, getEmail is not defined in User class
        System.out.println(Arrays.toString((user.getGrades()))); //returns the grades
    }
}
