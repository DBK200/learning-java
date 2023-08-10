package com.sessions.session11.practice.abstraction;

public abstract class Vehicle extends Transportation {
    // Is not used to create new objects.
    // It will offer a blueprint for all the child classes
    // that will inherit it.

    // No restriction on instance variables

    Vehicle() {
        System.out.println("Inside constructor");
    }

    // Can't be PRIVATE and FINAL because it must
    // be overwritten in the child classes
    public abstract void startEngine();

    public static void myMethod() {
        // some code here
    }

    public void calculateSomething() {
        System.out.println("Something");
    }

}
abstract class Transportation {
    public abstract void transport();
}
class Car extends Vehicle {
    @Override
    // Implementing the abstract method from class Vehicle
    public void startEngine() {
        System.out.println("Vroom");
    }

    // Implementing the abstract method from class Transportation
    // which is the parent for class Vehicle
    @Override
    public void transport() {
        //
    }
}

class AbstractTest implements UserInterface{
    // To implement an interface, IMPLEMENT keyword
    // must be used in class declaration

    // Abstract methods implementation
    @Override
    public void getEmailAddress() {
        System.out.println("This is the email address");
    }

    @Override
    public void getUserPhoneNumber() {
        System.out.println("This is the phone number");
    }

    @Override
    public void getUserManager() {
        System.out.println("This is user's manager");
    }
    public static void main(String[] args) {
        // Vehicle car = new Car();
        Car car = new Car();
        car.startEngine();
        Vehicle.myMethod();
        // Or
        Car.myMethod();

        //
        AbstractTest myAbstract = new AbstractTest();
        myAbstract.getEmailAddress();

    }

}

