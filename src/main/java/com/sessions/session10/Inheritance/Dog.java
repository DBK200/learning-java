package com.sessions.session10.Inheritance;

public class Dog extends Animal{

         protected String name;

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 2;
        System.out.println(dog.age);
        dog.eat("food");
    }


    public void eat(String xd) {
        System.out.println("Dog is eating something else..."  +xd);
    }
    //method signature must be the same in both classes (parent and child)
    //access modifier cannot be more restrictive than the method from parent class
    //return type must be covariant(same type or a subclass)
    //if exception is thrown in parent class method, child class method cannot throw a broader exception type
}
