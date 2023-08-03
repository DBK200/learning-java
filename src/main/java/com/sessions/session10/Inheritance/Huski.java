package com.sessions.session10.Inheritance;

public class Huski extends Dog{
    // Multi level inheritance
            // Animal
        // Dog      // Cat
    // Huski

    public static void main(String[] args) {

        Huski huski = new Huski();
        System.out.println(huski.age);
        System.out.println(huski.name);


    }

}
