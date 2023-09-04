package com.sessions.session13.Homework.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove
{
    //List Removal: Write a program that creates a List of
    // strings and prompts the user to enter a string to remove. Use the
    // remove() method to remove the first occurrence of the string from
    // the list, and then print out the modified list.
    public static void main(String[] args)
    {
       List<String> lista=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti nr de elemente din lista:");
        int n=scanner.nextInt();
        System.out.println("Introduceti elementele listei:");
        for(int i=0;i<=n;i++)
        {
            String m=scanner.nextLine();
            lista.add(m);
        }
        lista.remove(1);
        System.out.println("Lista dupa ce a fost sters primul element:" +lista);
    }
}
