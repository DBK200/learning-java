package com.sessions.session11.tema.ex3;

public class SubClass extends clasa
{
    public static void main(String[] args)
    {
        SubClass myClass=new SubClass();
        myClass.a_method();
        myClass.nonAbstract();
    }

    public void a_method()
    {
        System.out.println("This is abstract method");
    }
}
