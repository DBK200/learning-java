package com.sessions.session9;

public class AnimalTest1
{
    public static void main(String[] args)
    {
        AnimalRoxana animal=new AnimalRoxana();
        //set
        animal.setName("Cat");
        animal.setAge(3);
        //constructor
        AnimalRoxana dog=new AnimalRoxana("Dog",1);
        System.out.println(dog.name);
        System.out.println(dog.age);
    }
}
