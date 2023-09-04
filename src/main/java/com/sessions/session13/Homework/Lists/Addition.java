package com.sessions.session13.Homework.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Addition
{
    //List Addition: Write a program that creates an empty List of integers
    // and prompts the user to enter a series of numbers.
    // Add each number to the list, and then print out the contents of the list.
    public static void main(String[] args)
    {
        ArrayList<Integer> lista1=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cititi dimensiunea seriei:");
        int n=scanner.nextInt();
        System.out.println("Introduceti  seria de numere:");

        for(int i=0;i<n;i++)
        {
            int m=scanner.nextInt();
            lista1.add(m);
        }
        System.out.println("Lista:"+lista1);

    }
}
