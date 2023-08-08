package com.sessions.session10.Inheritance;


public class Cat extends AnimalM {
    public static void main(String[] args) {
        Cat kitty = new Cat();
        kitty.age = 3;
        System.out.println(kitty.age);

        DogM rex = new DogM();
        rex.age = 4;
        System.out.println(rex.age);
    }
}
