package com.sessions.session12.Exercises.OOP.Exercise1;

public class Test {
//    Write a Java program to create a class called "Person" with a name and age
//    attribute. Create two instances of the "Person" class, set their attributes using the
//    constructor, and print their name and age.

    public static void main(String[] args) {

        Person person1=new Person("David",20);
        Person person2=new Person("Andrei",43);

        System.out.println(person1.getName()+" "+person1.getAge());
        System.out.println(person2.getName()+" "+person2.getAge());

    }
}
