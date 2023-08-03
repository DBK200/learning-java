package com.sessions.session9;

public class TestClassAV {

    public void myMethod() {
        System.out.println(PracticeClassesAV.counter); //apelare static variable
        PracticeClassesAV myNewObject = new PracticeClassesAV();
        System.out.println(myNewObject.name); //instance variable

    }
}
