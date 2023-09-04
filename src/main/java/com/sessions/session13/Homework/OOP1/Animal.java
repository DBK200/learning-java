package com.sessions.session13.Homework.OOP1;

public class Animal
{
    //Animal: Create an Animal class that has the following attributes:
    // name, type, and sound. Implement methods for making
    //the animal make its sound, and for displaying the animal's name and type.
    protected String name;
    protected String type;
    protected String sound;
    Animal(String name,String type,String sound)
    {
        this.name=name;
        this.type=type;
        this.sound=sound;
    }
    public static void printSound()
    {
        System.out.println("Sound");
    }
    public static void printName()
    {
        System.out.println("Name");
    }
    public static void printType()
    {
        System.out.println("Type");
    }

    public static void main(String[] args)
    {
        Animal cat=new Animal("Pisi","Siameza","Miau");
        System.out.println("Name:"+cat.name+", type:"+cat.type+", sound:"+cat.sound);
    }

}
