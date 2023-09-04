package com.sessions.session13.Homework.BasicJava2;

import com.sessions.session12.homework.Parent;

public class Ex5
{
    //Scope: Declare variables in different scopes, such as local scope,
    // instance scope, and static scope.
   // Use the variables in your code to ensure that they are only accessible within their respective scopes.

    //Instance variable
    private int y=45;
    //Static variable
    public static int x=3;

    public static void main(String[] args)
    {

        //Local variable;
        String name="Roxana";
        System.out.println("Local:"+name);

        System.out.println("Static :"+x);

        //Crearea unei instanțe a clasei pentru a accesa variabila de instanță
        Ex5 instance=new Ex5();
        //Accesarea variabilei locale în cadrul metodei main
        System.out.println("Instance:"+instance.y);

    }
    public void print()
    {
        //Accesarea variabilei instanței în cadrul metodei instanței
        System.out.println("Instance"+y);
    }

}
