package com.sessions.session10.Inheritence;

public class AnimalR
{
    //name,age,color,specie....->propietati
    //metode:mananca,doarme ,face sunete

    //propietati
    protected static String specie;
    public int age=2;

    //metoda eat-este accesibila pt orice clasa din Animal
    protected void eat(String x)
    {
        System.out.println("Animal is eating something good....");
    }





}
