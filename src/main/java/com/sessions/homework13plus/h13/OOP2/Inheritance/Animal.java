package com.sessions.homework13plus.h13.OOP2.Inheritance;

public class Animal {
    // Inheritance:
    //Create a class Animal with attributes such as name, age, and species.
    //Create a subclass Dog that inherits from the Animal class, and add attributes such as breed and size.
    //Implement methods such as bark() and fetch() in the Dog class that use the attributes inherited from
    //the Animal class.
    String name, species, favoriteObject;
    int age;

    public Animal(String name, String species, String favoriteObject, int age) {
        this.name = name;
        this.species = species;
        this.favoriteObject = favoriteObject;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog bobita = new Dog("Bobita","dog","stick",5,"Kangal","XXL");
        bobita.bark();
        bobita.fetch();
    }
}
