package com.sessions.session21.creational.Challenges.Factory;

public class TestClass {

    public static void main(String[] args) {
        Animal catFactory = new AnimalFactory().getAnimal("cat");
        Animal dogFactory = new AnimalFactory().getAnimal("dog");
        Animal cowFactory = new AnimalFactory().getAnimal("cow");
        catFactory.speak();
        dogFactory.speak();
        cowFactory.speak();
    }
}
