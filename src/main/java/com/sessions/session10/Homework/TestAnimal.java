package com.sessions.session10.Homework;

public class TestAnimal {

    public static void main(String[] args) {


        Animal animal = new Animal();
        animal.sound();
        System.out.println(animal.getSpecies());

        Dog dog = new Dog();
        dog.sound();
        dog.setSpecies("Dog");
        System.out.println(dog.getSpecies());


        Cat cat = new Cat();
        cat.sound();
        cat.setSpecies("Cat");
        System.out.println(cat.getSpecies());

        Wolf wolf = new Wolf();
        wolf.sound();
        wolf.setSpecies("Wolf");
        System.out.println(wolf.getSpecies());

    }
}
