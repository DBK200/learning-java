package com.sessions.session12.HomeworkAV.challenge1.example5;

public class Animal {
    int age = 20;
}

class Dog extends Animal {
    int age = 5;

    public static void main(String[] args) {
        Animal animalObject = new Dog();
        System.out.println(animalObject.age); //20
    }
}
