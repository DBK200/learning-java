package com.sessions.session25.practice.liskov_substitution_principle.after;

public class Duck extends Bird implements Swimmer {
    @Override
    public void fly() {
        // code to make the duck fly
    }

    @Override
    public void swim() {
        // code to make the duck swim
    }
}
