package com.sessions.session12.polymorphism.polymorphismexample4;

public class Animal {

    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("The dog is eating bread");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("The cat is eating a rat");
    }
}

class Lion extends Animal{
    void eat(){
        System.out.println("The lion is eating meat");
    }
}

class Test{
    public static void main(String[] args) {
        Animal animal;

        animal = new Dog();
        animal.eat();

        animal = new Cat();
        animal.eat();

        animal = new Lion();
        animal.eat();
    }
}
