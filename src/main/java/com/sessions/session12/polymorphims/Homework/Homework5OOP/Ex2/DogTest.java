package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex2;

public class DogTest {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Rex", "Huski");
        Dog dog2 = new Dog("Bob", "Labrador");

        dog1.setName("Coco");
        dog1.setBreed("Buldog");
        dog2.setName("Max");
        dog2.setBreed("Beagle");

        System.out.println("Name: " + dog1.getName() + " Breed: " + dog1.getBreed());
        System.out.println("Name: " + dog2.getName() + " Breed: " + dog2.getBreed());
    }

}
