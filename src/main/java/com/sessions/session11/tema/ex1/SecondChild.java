package com.sessions.session11.tema.ex1;

public class SecondChild extends Parent
{
    public static void main(String[] args)
    {
        SecondChild mySubclass2=new SecondChild();
        mySubclass2.message();
    }
    @Override
    protected void message()
    {
        System.out.println("This is second subclass");
    }
}
