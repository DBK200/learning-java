package com.sessions.session13recap.OOP2.Encapsulation;

public class Application {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("George Popescu");
        person.setAge(40);
        person.setAddress("Bucharest, Primaverii Street");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
