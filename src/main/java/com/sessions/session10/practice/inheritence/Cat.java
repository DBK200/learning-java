package com.sessions.session10.practice.inheritence;

public class Cat extends Animal {
    protected boolean hasRetractableClaws;
    public static void main(String[] args) {
        Cat kitty = new Cat();
        // Because is not override will get the parent method
        kitty.eat();
    }

}
