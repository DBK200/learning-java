package com.sessions.session15.Homework.Challange3;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("John", 21, 3332, "JohnSnow@yahoo.com");
        Student student2 = new Student("John", 21, 4453, "JohnSnow@yahoo.com");

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
