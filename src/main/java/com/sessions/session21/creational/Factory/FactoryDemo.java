package com.sessions.session21.creational.Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Bird eagleBird = new BirdFactory().getBird("eagle");
        Parrot parrotBird = (Parrot) new BirdFactory().getBird("parrot");
        eagleBird.fly();
        parrotBird.fly();
        ((Parrot)parrotBird).taking();

    }
}
