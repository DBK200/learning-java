package com.sessions.session21.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Bird eagleBird = new BirdFactory().getBird("eagle");
        eagleBird.fly();

        Bird parrotBird =  new BirdFactory().getBird("parrot");
        parrotBird.fly();
        ((Parrot) parrotBird).talking();
    }
}
