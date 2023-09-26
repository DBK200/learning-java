package com.sessions.patternsPractice.creational.factory;

public class Test {
    public static void main(String[] args) {
        // Create the Bird Factory
        BirdFactory birdFactory = new BirdFactory();

        // Create a Sparrow using the factory
        Bird sparrow = birdFactory.createBird("sparrow");
        sparrow.fly();

        // Create an Owl using the factory
        Bird owl = birdFactory.createBird("owl");
        owl.fly();

        // Create an Eagle using the factory
        Bird eagle = birdFactory.createBird("eagle");
        eagle.fly();
    }
}
