package com.sessions.session15.Homework.Exercise2;

public class Application {
    public static void main(String[] args) {

        Person person1 = new Person("Maria", 32, "maria1@gmail.com");
        Person person2 = new Person("Maria", 32, "maria2@gmail.com");

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1.equals(person2));
    }
}
