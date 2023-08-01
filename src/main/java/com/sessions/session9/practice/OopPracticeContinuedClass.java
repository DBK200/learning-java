/**********************
 *                    *
 *  Date: 01.08.2023  *
 *                    *
 **********************/

package com.sessions.session9.practice;

import java.time.LocalDate;

public class OopPracticeContinuedClass {
    // Instance variables
    protected int age;
    private String name;
    private boolean isTall;

    // Static variables
    protected static int counter1 = 0;
    final private static int counter2 = 0;

    public static void main(String[] args) {
        System.out.println("Sum: " + calculateSum(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Current date is [static]: " + getStaticCurrentDate());

        // We don't need an instance of current class to access
        // a STATIC variable.
        // It can be accessed even in non-static methods.
        System.out.println(counter1);

        // A final variable can't be modified
        // counter2 = 2; // throws an error

        // We need an instance of current class to access
        // a class instance variable or a non-static class method
        OopPracticeContinuedClass myObject = new OopPracticeContinuedClass();
        System.out.println(myObject.age);
        System.out.println(myObject.name);
        System.out.println(myObject.isTall);
        System.out.println("Current date is [non-static]: " + myObject.getCurrentDate());

    }

    // Method declaration with defined access modifier
    private static int calculateSum(int... iValues) {
        // Local variable. Can only be access inside method's body
        int iResult = 0;
        for (int value: iValues) iResult += value;
        return iResult;
    }

    // Method declaration with DEFAULT access modifier
    static LocalDate getStaticCurrentDate() {
        return LocalDate.now();
    }

    LocalDate getCurrentDate() {
        return LocalDate.now();
    }

}

class TestClass {
    public void myMethod() {
        // Calling a static member
        System.out.println(OopPracticeContinuedClass.counter1);

        // Calling an instance member
        OopPracticeContinuedClass myNewObject = new OopPracticeContinuedClass();
        System.out.println(myNewObject.age);
    }
}

class Animal {
    private  String name;
    protected int age;
    private String family;

    // Default constructor is created by Java
    // when no constructor exists

    // This is not a default constructor
    // but a no arguments constructor
    public Animal() {
        // this("Default animal", 0);
    }

    // This is an all arguments constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // This is an all arguments constructor
    public Animal(String name, int age, String family) {
        this.name = name;
        this.age = age;
        this.family = family;
    }

    // Setter method for
    // [name] instance variable
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for
    // [name] instance variable
    public String getName() {
        return name;
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        System.out.printf("[animal1] No-args constructor: [name: %s] | [age: %d]%n", animal1.getName(), animal1.age);
        animal1.setName("Jaguar");
        System.out.printf("After [setName]: [name: %s] | [age: %d]%n", animal1.getName(), animal1.age);

        Animal animal2 = new Animal("Cat", 1);
        System.out.printf("[animal2] Two-args constructor: [name: %s] | [age: %d]%n", animal2.getName(), animal2.age);
    }
}