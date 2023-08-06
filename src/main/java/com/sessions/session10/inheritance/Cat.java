package com.sessions.session10.inheritance;

public class Cat extends Animal
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        cat.age = 3;
        System.out.println("Cat age is: " + cat.age);

        Dog rex = new Dog();
        rex.age = 4;
        System.out.println("Dog age is: " + rex.age);
    }
}