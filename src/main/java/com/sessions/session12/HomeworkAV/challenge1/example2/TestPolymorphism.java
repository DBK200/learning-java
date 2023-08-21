package com.sessions.session12.HomeworkAV.challenge1.example2;

public class TestPolymorphism {
    public static void main(String[] args) {
        Parent parent;
        parent = new Subclass1();
        parent.print(); //output: Subclass1

        parent = new Subclass2();
        parent.print(); //output: Subclass2
    }
}
