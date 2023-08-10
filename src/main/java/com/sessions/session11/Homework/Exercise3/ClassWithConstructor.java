package com.sessions.session11.Homework.Exercise3;

public abstract class ClassWithConstructor {

    ClassWithConstructor(){
        System.out.println("This is constructor of abstract class");
    }
    public abstract void a_method();

    public void non_abstract(){
        System.out.println("This is a normal method of abstract class");
    }
}
