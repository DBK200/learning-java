package com.sessions.session10.Inheritance;

public class Animal {

    // Multiple inheritance is not allowed in Java

    // name, age, color, specie...-> proprietate
    // eat, sleep, makesound...-> methods / functions (in Java se numesc metode)

    // Relatia dintre clasa parinte si clasa copil trebuie sa raspunda la intrebarea IS A
    // De exemplu un caine este un animal

    protected static String specie;
    public int age=2;

    protected void eat(){
        System.out.println("Animal is eating something good");
    }
}
