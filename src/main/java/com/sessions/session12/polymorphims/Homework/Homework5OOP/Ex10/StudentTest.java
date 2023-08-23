package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex10;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student("Mike", 10);
        student.addCourse("Math");
        student.addCourse("Programming");
        student.addCourse("English");
        System.out.println(student.getCourses());
        student.removeCourse("Math");
        System.out.println(student.getCourses());

    }
}
