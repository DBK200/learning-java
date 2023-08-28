package com.sessions.session13recap.OOP1.Exercise5;

import com.sessions.session11.abstraction.defaultmethod.A;

public class Application {
    public static void main(String[] args) {

        Animal animal = new Animal("cat", "feline", "miau");
        animal.displayData();
        animal.makeSound();

    }
}
