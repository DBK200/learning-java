package com.sessions.session12.polymorphism;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getAge());

        User user = student;
        user.getAge();
//        user.getName(); // does not compile
    }
}
