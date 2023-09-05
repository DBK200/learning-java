package com.sessions.session12.polymorphism.polymorphismexample3;

public class Main {

    public static void main(String[] args) {
        Parent parent;
        parent = new Subclass1();
        parent.print();   // are acces la metodele si la variabilele din clasa Parent DAR NU
                            // si la cele din Subclass1
                            // practic din subclass1 ar putea lua doar parametrii constructorului, daca acesta ar avea parametrii

        parent = new Subclass2();
        parent.print();

        Parent parent1 = new Parent();
        parent1.print();
    }
}
