package com.sessions.session12.homework;

public class Dog extends Animal
{
    int age=5;

    public static void main(String[] args)
    {
        Animal animal=new Dog();
        System.out.println(animal.age);
    }
}
