package com.sessions.session15.Homework.Exercise3;

public class Application {
    public static void main(String[] args) {

        Student student1 = new Student("Barbie", 25, 1, "barbie@barbie.com");
        Student student2 = new Student("Barbie", 25, 2, "barbie@barbie.com");

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student1.equals(student2));
    }
}
