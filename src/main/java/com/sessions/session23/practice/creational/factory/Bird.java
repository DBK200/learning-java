package com.sessions.session23.practice.creational.factory;

import java.util.Objects;

public interface Bird {
    void fly();
}

class Eagle implements Bird {

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}

class Owl implements Bird {

    @Override
    public void fly() {
        System.out.println("Owl flies at night");
    }
}

class Parrot implements Bird {

    @Override
    public void fly() {
        System.out.println("Parrot makes a lot of noise");
    }

    public void talk() {
        System.out.println("Parrot is talking with us");
    }
}

class BirdFactory {
    public Bird getBird(String birdType) {
        if (Objects.equals(String.format("%S", birdType), "EAGLE")) return new Eagle();
        else if (Objects.equals(String.format("%S", birdType), "OWL")) return new Owl();
        else if (Objects.equals(String.format("%S", birdType), "PARROT")) return new Parrot();
        else return null;
    }
}


class FactoryDemo {
    public static void main(String[] args) {
        Bird eagleBird = new BirdFactory().getBird("eagle");
        eagleBird.fly();

        Bird parrotBird = new BirdFactory().getBird("Parrot");
        parrotBird.fly();
        ((Parrot) parrotBird).talk();

    }
}