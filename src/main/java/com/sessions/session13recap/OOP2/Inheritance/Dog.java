package com.sessions.session13recap.OOP2.Inheritance;

public class Dog extends Animal {
    private String breed;
    private int size;

    public Dog(String name, int age, String species, String breed, int size) {
        super(name, age, species);
        this.breed = breed;
        this.size = size;
    }
    public void bark() {
        System.out.println(name + " barks...");
    }
    public void fetch() {
        System.out.println(name + " fetches...");
    }
}
