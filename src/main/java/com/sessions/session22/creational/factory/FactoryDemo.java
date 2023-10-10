package com.sessions.session22.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Bird eagleBird = new BirdFactory().getBird("eagle");
        eagleBird.fly();

        Parrot parrotBird = (Parrot) new BirdFactory().getBird("parroT");
        parrotBird.talking();
        parrotBird.fly();

    }
}
