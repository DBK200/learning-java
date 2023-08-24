package com.sessions.session12.Exercises.OOP.Exercise2;

public class Test {
//    Write a Java program to create a class called "Dog" with a name and breed attribute
//    Create two instances of the "Dog" class, set their attributes using the constructor and
//    modify the attributes using the setter methods and print the updated values.

    public static void main(String[] args) {

        Dog dog=new Dog("Rex","Rot");
        System.out.println(dog.getName()+" "+dog.getBreed());
        dog.setName("Max");
        dog.setBreed("Husk");

        System.out.println(dog.getName()+" "+dog.getBreed());
    }
}
