package com.sessions.session10.practice.inheritence;

public class Dog extends Animal {
    protected String name;
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.age);
        dog.eat();
    }

    // To override a method from the parent class:
    // 1. The signature has to be the same
    // 2. The access modifier has to be at least as restrictive as it is in the parent class
    //    Parent: protected -> Child: protected, public
    // 3. Returned type must be covariant (i.e., same type or a subclass)
    // 4. Thrown exception can't be a broader exception type

    @Override
    protected void eat() {
        // this is the parent class eat() method
        super.eat();
        // This overrides parent class declaration
        //System.out.println(getClass().getSimpleName() + " is eating something too!");
        System.out.println("DOG is eating something too!");
    }

}
