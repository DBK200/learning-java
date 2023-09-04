package com.sessions.session13.Homework.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Searching
{
    //List Searching: Write a program that creates a List of
    // strings and prompts the user to enter a string to search for.
    // Use the contains() method to check if the string is in the list,
    // and print out a message indicating whether the string was found or not.
    public static void main(String[] args)
    {
        List<String> lista=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti dimensiunea listei:");
        int n=scanner.nextInt();
        System.out.println("Introduceti elementele listei:");
        for (int i=0;i<=n;i++)
        {
            String m=scanner.nextLine();
            lista.add(m);
        }
        System.out.println("Introduceti string ul pe care doriti sa aflati daca se afla in lista:");
        String cautat=scanner.nextLine();
        if(lista.contains(cautat))
        {
            System.out.println("String ul se afla in lista");
        }
        else
        {
            System.out.println("String ul nu se afla in lista");
        }



    }
}
