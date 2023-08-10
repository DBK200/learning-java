package com.sessions.session11.challenges.exercise3;

public abstract class SomeClass {
    SomeClass() {
        System.out.println("This is constructor of abstract class SomeClass");
    }

    abstract void a_method();

    public void concreteMethod() {
        System.out.println("This is a normal method of abstract class SomeClass");
    }
}

class SubClass extends SomeClass {

    @Override
    void a_method() {
        System.out.println("This is an abstract method");
    }
}

class Test {
    public static void main(String[] args) {

        // Next declaration prints out the message from Constructor.
        SubClass subClass = new SubClass();

        // Prints out the message from the method implemented in the child class
        subClass.a_method();

        // Prints out the message from the method declared in the abstract class
        subClass.concreteMethod();
    }
}