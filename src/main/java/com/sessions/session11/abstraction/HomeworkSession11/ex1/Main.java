package com.sessions.session11.abstraction.HomeworkSession11.ex1;

public class Main {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Subclass1 s1 = new Subclass1();

        s1.message();
        System.out.println();

        Subclass2 s2 = new Subclass2();
        s2.message();
    }



}
