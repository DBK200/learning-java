package com.sessions.session10.Homework;

public class TestAnimal extends AnimalRoxana
{
    public static void main(String[] args)
    {
        System.out.println("Animal makes sounds");

        System.out.print("Cat sounds: ");
        CatRoxana myCat = new CatRoxana();
        myCat.soundMethod("Miau");

        System.out.print("Chicken sounds: ");
        Chicken myChicken = new Chicken();
        myChicken.soundMethod("Cok Cok");

        System.out.print("Cow sounds: ");
        Cow myCow = new Cow();
        myCow.soundMethod("Muuu Muuu");

        System.out.print("Dog sounds: ");
        DogRoxana myDog = new DogRoxana();
        myDog.soundMethod("Ham Ham");

        System.out.print("Duck sounds: ");
        Duck myDuck = new Duck();
        myDuck.soundMethod("Mac Mac");

        System.out.print("Horse sounds: ");
        Horse myHorse = new Horse();
        myHorse.soundMethod("Trop Trop");

        System.out.print("Pig sounds: ");
        Pig myPig=new Pig();
        myPig.soundMethod("Guit Guit");
    }
}
