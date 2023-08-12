package com.sessions.session11.abstraction.HomeworkSession11ex3;

public abstract class DemoClass {

    //Constructor
    public DemoClass(){
        System.out.println("This is constructor of abstract class");
    }

    // Abstract method
    public abstract void a_method();

    public abstract void c_method();

    // Non-abstract method
    public void b_method(){
        System.out.println("This is a normal method of abstract class");
    }
}
