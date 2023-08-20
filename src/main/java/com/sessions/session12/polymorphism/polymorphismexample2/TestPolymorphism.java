package com.sessions.session12.polymorphism.polymorphismexample2;

public class TestPolymorphism {

    public static void main(String[] args) {
        Parent parent;

        // parent va apela metodele din Subclass1
        parent = new Subclass1();

        parent.print();

        parent.doSomething();

        // parent va apela metodele din Subclass2
        parent = new Subclass2();

        parent.print();

        parent.doSomething();
    }
}
