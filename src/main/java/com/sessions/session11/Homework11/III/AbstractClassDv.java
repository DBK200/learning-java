package com.sessions.session11.Homework11.III;

public abstract class AbstractClassDv {
    public AbstractClassDv(){
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    public void nonAbstract_method(){
        System.out.println("This is a normal method of abstract class");
    }
}
