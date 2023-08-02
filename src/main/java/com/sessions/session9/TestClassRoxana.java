package com.sessions.session9;

public class TestClassRoxana
{
    public void myMethod()
    {
        //calling static member
        System.out.println(PracticeClassesRoxana.counter);
        //calling a instance member
        PracticeClassesRoxana myNewObject=new PracticeClassesRoxana();
        System.out.println(myNewObject.name);
        System.out.println(myNewObject.age);
    }
}
