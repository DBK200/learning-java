package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex1;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person(19, "Mike");
        Person person1 = new Person(34, "Jon");

        System.out.println("Name: " + person.getName() + " Age: " + person.getAge());
        System.out.println("Name: " + person1.getName() + " Age: " + person.getAge());

    }
}
