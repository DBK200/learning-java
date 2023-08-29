package com.sessions.recap.OOP.Inheritance;

public class Main {

//    Create a class Animal with attributes such as name, age, and species.
//    Create a subclass Dog that inherits from the Animal class, and add
//    attributes such as breed and size. Implement methods such as bark() and
//    fetch() in the Dog class that use the attributes inherited from the Animal class.

    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.setName("Rex");

        dog.bark();
        dog.fetch();

    }
}
