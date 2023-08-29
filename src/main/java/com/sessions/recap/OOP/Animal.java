package com.sessions.recap.OOP;

public class Animal {

//    Animal: Create an Animal class that has the following attributes: name, type, and sound.
//    Implement methods for making the animal make its sound, and for displaying the animal's name and type.

    private String name;
    private String type;
    private String sound;

    public Animal(String name,String type,String sound){
        this.name=name;
        this.type=type;
        this.sound=sound;
    }

    public void makeSound(){
        System.out.println(sound);
    }

    public void animalDetails(){
        System.out.println("Animal name is "+name+" and it is an/a "+ type+".");
    }

}
