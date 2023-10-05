package com.sessions.session22patternsCreational.Creational.factory;

public class ParrotR implements BirdR
{
    @Override
    public void fly()
    {
        System.out.println("Parrot is flying");
    }
    public void talking()
    {
        System.out.println("Parrot is talking....");
    }

}
