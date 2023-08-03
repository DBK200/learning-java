package com.sessions.session9;

public class TestClass1 {

    public void myMethod(){
        //calling static member
        System.out.println(PracticeClassesTeodor.counter);
        //calling instance member
        PracticeClassesTeodor myNewObject = new PracticeClassesTeodor();
        System.out.println(myNewObject.name);
        System.out.println(myNewObject.age);

    }
}
