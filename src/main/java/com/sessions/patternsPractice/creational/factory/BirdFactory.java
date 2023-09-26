package com.sessions.patternsPractice.creational.factory;

public class BirdFactory {

    public Bird createBird(String birdType) {
        if (birdType.equalsIgnoreCase("sparrow")) {
            return new Sparrow();
        } else if (birdType.equalsIgnoreCase("eagle")) {
            return new Eagle();
        } else if (birdType.equalsIgnoreCase("owl")) {
            return new Owl();
        } else {
            throw new IllegalArgumentException("Invalid bird type: " + birdType);
        }
    }
}
