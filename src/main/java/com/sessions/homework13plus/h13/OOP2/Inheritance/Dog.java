package com.sessions.homework13plus.h13.OOP2.Inheritance;

public class Dog extends Animal{
    String breed, size;

    public Dog(String name, String species, String favoriteObject, int age, String breed, String size) {
        super(name, species, favoriteObject, age);
        this.breed = breed;
        this.size = size;
    }

     public void bark(){
        System.out.println(this.name + " says : Bark Bark !");
    }
    public void fetch(){
        System.out.println(this.name + " fetches the " +this.favoriteObject);
    }
}
