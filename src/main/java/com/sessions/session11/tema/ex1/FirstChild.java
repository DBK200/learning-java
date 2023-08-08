package com.sessions.session11.tema.ex1;

public class FirstChild extends Parent
{
    public static void main(String[] args)
    {
        FirstChild mySubclass=new FirstChild();
        mySubclass.message();

    }
    protected void message()
    {
        System.out.println("This is first subclass");
    }
}
