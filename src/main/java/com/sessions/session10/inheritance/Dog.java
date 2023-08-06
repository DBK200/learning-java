package com.sessions.session10.inheritance;

public class Dog extends Animal
{
    protected String name;

//    public static void main(String[] args)
//    {
//        Dog dog = new Dog();
//
//        //System.out.println(dog.age);
//
//        dog.eat();
//    }

    @Override
    protected void eat()
    {
        System.out.println("Dog is eating meal...");
    }
}
