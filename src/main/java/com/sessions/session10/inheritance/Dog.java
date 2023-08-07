package com.sessions.session10.inheritance;

public class Dog extends Animal {

    protected String name;

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        System.out.println(dog.age);
    }

    @Override
    protected void eat(){ // method signature must be the same in both classes
        System.out.println("Dog is eating something else.. ");
    }
    // acces modifier cannot be more restrictive than the method from the parent class
    // return type must be covariant ( same tye or a subclass )
    // exception cannot be more a more general/broader exception type

}
