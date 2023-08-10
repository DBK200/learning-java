package com.sessions.session11.challenges.exercise1;

public abstract class Parent {
    public abstract void message();
}

class Child1 extends Parent {

    @Override
    public void message() {
        System.out.printf("This is first subclass.%n(message sent by a class %S object)%n", this.getClass().getSimpleName());
    }
}

class Child2 extends Parent {

    @Override
    public void message() {
        System.out.printf("This is second subclass.%n(message sent by a class %S object)%n", this.getClass().getSimpleName());
    }
}

class Test {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        // Different way of instantiating an object from an abstract class child
        Parent child2 = new Child2();

        child1.message();
        child2.message();
    }
}