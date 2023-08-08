package com.sessions.session10.Homework10;

import com.sessions.session10.Inheritence.CatDavid;

public class TestAnimalDv {
    public static void main(String[] args) {

        AnimalDv animal=new AnimalDv();
        DogDv dog=new DogDv();
        CatDv cat=new CatDv();
        Wolf wolf=new Wolf();

        animal.sound();
        dog.sound();
        cat.sound();
        wolf.sound();


    }
}
