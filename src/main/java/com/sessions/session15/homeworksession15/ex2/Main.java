package com.sessions.session15.homeworksession15.ex2;

public class Main {

    public static void main(String[] args) {

        // Create objects of Person class and compare them to test the functionality of equals() function that I created

        Person person1 = new Person("Andreea", 27, "andreea@yahoo.com");
        Person person2 = new Person("Ana", 28, "ana@yahoo.com");
        Person person3 = new Person("Maria", 33, "andreea@yahoo.com");
        Person person4 = new Person("Maria", 33, "andreea@yahoo.com");
        Person person5 = new Person("Maria", 33, "andreea@yahoo.com");

        System.out.println(person1.equals(person2)); // false
        System.out.println(person1.equals(person3));  // false
        System.out.println(person2.equals(person3));  // false
        System.out.println(person3.equals(person4));  // true
        System.out.println(person3.equals(person5));  // true
        System.out.println(person4.equals(person5));  // true
    }
}
