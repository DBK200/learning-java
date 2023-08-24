package com.sessions.session10.OtherExamples.Inheritance.AbstractClasses;


 public abstract class A {
    abstract void callMe();

    private int animal;


     //concrete methods are still allowed in abstract classes
     void callMeToo(){
         System.out.println("This is a concrete method");
     }


 }
