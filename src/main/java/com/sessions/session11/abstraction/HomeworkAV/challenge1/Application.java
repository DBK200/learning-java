package com.sessions.session11.abstraction.HomeworkAV.challenge1;

public class Application {
    public static void main(String[] args) {

        FirstSubclass firstSubclass = new FirstSubclass();
        SecondSubclass secondSubclass = new SecondSubclass();

        firstSubclass.message();
        secondSubclass.message();
    }
}
