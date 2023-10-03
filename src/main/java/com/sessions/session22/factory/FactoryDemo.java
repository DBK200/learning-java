package com.sessions.session22.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Bird owlBird = new BirdFactory().getBird("eagle");
        owlBird.fly();

        Parrot parrotBird = (Parrot) new BirdFactory().getBird("parrot");
        parrotBird.fly();
        parrotBird.talking();
    }
}
