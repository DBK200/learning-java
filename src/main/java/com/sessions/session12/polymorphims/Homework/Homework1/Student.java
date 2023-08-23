package com.sessions.session12.polymorphims.Homework.Homework1;

public class Student extends User implements Person{

    private String name;
    private int age;

    int Id = 40;

    public Student(String name, int age){
        this.name = name;
        this.age = age;

    }
    public int getAge(){
        return age;
    }

    @Override
    public void printSomething() {
        System.out.println("Subclass");
    }
}
