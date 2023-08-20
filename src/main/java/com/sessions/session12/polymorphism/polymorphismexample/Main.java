package com.sessions.session12.polymorphism.polymorphismexample;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Dog("Huski");
        //Dog dog = (Dog) new Animal();
        Dog dog = new Dog("German Shepered");

        System.out.println(animal.age);
        System.out.println(dog.breed);
        System.out.println(dog.doSomething(7));

        //System.out.println(animal.age);
        //System.out.println(animal.doSomething());
    }
}
