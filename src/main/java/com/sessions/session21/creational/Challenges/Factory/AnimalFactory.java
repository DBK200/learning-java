package com.sessions.session21.creational.Challenges.Factory;

import java.util.Objects;

public class AnimalFactory {

    public Animal getAnimal(String animal){
        if (Objects.equals(animal,"cat")){
            return new Cat();
        }
        if (Objects.equals(animal,"dog")){
            return new Dog();
        }
        if (Objects.equals(animal,"cow")){
            return new Cow();
        }else {
            return null;
        }
    }
}
