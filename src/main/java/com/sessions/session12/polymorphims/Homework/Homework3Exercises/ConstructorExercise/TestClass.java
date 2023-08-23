package com.sessions.session12.polymorphims.Homework.Homework3Exercises.ConstructorExercise;

public class TestClass {

    public static void main(String[] args) {

        Student student = new Student();
        Student student1 = new Student("Mike");
        Student student2 = new Student("Leon");
        System.out.println(student1.name);
        System.out.println(student2.name);
    }
}
