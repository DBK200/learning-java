package com.sessions.examples_solid.liskov_substitution_principle.before;

public class Bird {
    public void fly() {
        // code to make the bird fly
    }

    public void swim() {
        throw new UnsupportedOperationException("Birds cannot swim.");
    }
}
