package com.sessions.session13.Homework.Lists;

import java.util.ArrayList;
import java.util.List;

public class Creation
{
    //List Creation: Write a program that creates a List of strings and populates it with a few elements.
    // Print out the contents of the list using a loop.
    public static void main(String[] args)
    {
        List<String> lista=new ArrayList<>();
        lista.add("mere");
        lista.add("pere");
        lista.add("apa");
        lista.add("lapte");
        lista.add("ciocolata");
        System.out.println("Lista:");
        for (String element:lista)
        {
            System.out.println(element);
        }
    }
}
