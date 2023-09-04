package com.sessions.session15.Homework.Challange2;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Mike", 20, "bigMike@yahoo.com");
        Person person2 = new Person("Mike", 20, "bigMIKE@yahoo.com");

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
