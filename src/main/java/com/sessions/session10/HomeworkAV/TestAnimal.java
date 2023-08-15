package com.sessions.session10.HomeworkAV;

public class TestAnimal {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Wolf myWolf = new Wolf();
        Kitty myKitty = new Kitty();

        myAnimal.sound();
        myCat.sound();
        myDog.sound();
        myWolf.sound();
        myKitty.sound();
    }
}
